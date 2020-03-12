package com.virtuslab

import com.virtuslab.dsl.Networked
import play.api.libs.json.Format
import skuber.{ K8SRequestContext, ObjectResource, ResourceDefinition }

import scala.concurrent.duration._
import scala.concurrent.{ Await, Future }

object OperatorMain extends AbstractMain with App {
  import com.virtuslab.dsl.{ Application, Configuration, Namespace, System, SystemInterpreter }

  def deploy(): Unit = {
    val namespace = Namespace("test").inNamespace { implicit ns =>
      import ns._

      val configuration = Configuration(
        name = "app",
        data = Map(
          "config.yaml" ->
            """
              |listen: :8080
              |logRequests: true
              |connectors:
              |- type: file
              |  uri: file:///opt/test.txt
              |  pathPrefix: /health
              |""".stripMargin,
          "test.txt" ->
            """
              |I'm testy tester, being tested ;-)
              |""".stripMargin
        )
      )

      val app = Application(
        name = "app",
        image = "quay.io/virtuslab/cloud-file-server:v0.0.6",
        command = List("cloud-file-server"),
        args = List("--config", "/opt/config.yaml"),
        configurations = List(configuration),
        ports = Networked.Port(8080) :: Nil
      )

      val second = Application(
        name = "app",
        image = "quay.io/virtuslab/cloud-file-server:v0.0.6",
        command = List("cloud-file-server"),
        args = List("--config", "/opt/config.yaml"),
        configurations = List(configuration),
        ports = Networked.Port(8080) :: Nil
      )

      Applications(
        app,
        second
      )
    }

    // Populate the namespace

    val system = System("test")
      .inSystem { implicit system =>
        import system._

        Namespaces(
          namespace
        )
      }

    import skuber.apps.v1.Deployment
    import skuber.json.format._
    import skuber.{ ConfigMap, Namespace, Service }

    val systemInterpreter = SystemInterpreter.of(system)
    systemInterpreter(system).foreach {

      case namespace: Namespace =>
        val createNamespace = createOrUpdate(client, namespace)
        val ns = Await.result(createNamespace, 1.minute)
        println(s"Successfully created '$ns' on Kubernetes cluster")

      case config: ConfigMap =>
        val createConfig = createOrUpdate(client, config)
        val cfg = Await.result(createConfig, 1.minute)
        println(s"Successfully created '$cfg' on Kubernetes cluster")

      case service: Service =>
        val createService = createOrUpdate(client, service)
        val svc = Await.result(createService, 1.minute)
        println(s"Successfully created '$svc' on Kubernetes cluster")

      case deployment: Deployment =>
        val createDeployment = createOrUpdate(client, deployment)
        val dpl = Await.result(createDeployment, 1.minute)
        println(s"Successfully created '$dpl' on Kubernetes cluster")

      case o => throw new UnsupportedOperationException(s"unexpected resource $o")
    }
  }

  def createOrUpdate[O <: ObjectResource](client: K8SRequestContext, o: O)(implicit fmt: Format[O], rd: ResourceDefinition[O]): Future[O] = {
    import skuber._

    client.create(o) recoverWith {
      case ex: K8SException if ex.status.code.contains(409) => client.update(o)
    }
  }

  // Run
  deploy()

  // Cleanup
  client.close
  //  super.close() // FIXME
}
