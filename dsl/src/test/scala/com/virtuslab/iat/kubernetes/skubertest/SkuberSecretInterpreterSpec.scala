package com.virtuslab.iat.kubernetes.skubertest

import com.stephenn.scalatest.playjson.JsonMatchers
import com.virtuslab.iat.dsl.Label.Name
import com.virtuslab.iat.dsl.{ Namespace, Secret }
import com.virtuslab.iat.json.json4s.jackson.YamlMethods.yamlToJson
import com.virtuslab.iat.kubernetes
import com.virtuslab.iat.test.EnsureMatchers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SkuberSecretInterpreterSpec extends AnyFlatSpec with Matchers with JsonMatchers with EnsureMatchers {
  import skuber.json.format._

  it should "create empty secret" in {
    import kubernetes.skuber._
    import kubernetes.skuber.playjson._

    val ns = Namespace(Name("foo") :: Nil)
    val sec = Secret(Name("test") :: Nil, data = Map.empty)

    val secret = interpret(sec, ns).head
    secret.should(matchJsonString(yamlToJson(s"""
        |---
        |kind: Secret
        |apiVersion: v1
        |metadata:
        |  name: ${sec.name}
        |  namespace: ${ns.name}
        |  labels:
        |    name: ${sec.name}
        |""".stripMargin)))
  }

  it should "create secret with key and value" in {
    import kubernetes.skuber._
    import kubernetes.skuber.playjson._

    val ns = Namespace(Name("foo") :: Nil)
    val sec = Secret(Name("test") :: Nil, data = Map("foo" -> "admin"))

    val secret = interpret(sec, ns).head
    secret.should(matchJsonString(yamlToJson(s"""
       |---
       |kind: Secret
       |apiVersion: v1
       |metadata:
       |  name: ${sec.name}
       |  namespace: ${ns.name}
       |  labels:
       |    name: ${sec.name}
       |data:
       |  foo: YWRtaW4=
       |""".stripMargin))) // FIXME is this encoding right?
  }
}
