/**
  * Kubernetes
  * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
  *
  * The version of the OpenAPI document: v1.15.10
  *
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package com.virtuslab.kubernetes.client.openapi.model

import com.virtuslab.kubernetes.client.openapi.core.ApiModel

/**
  * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
  */
case class Probe(
    exec: Option[ExecAction] = None,
    /* Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. */
    failureThreshold: Option[Int] = None,
    httpGet: Option[HTTPGetAction] = None,
    /* Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
    initialDelaySeconds: Option[Int] = None,
    /* How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. */
    periodSeconds: Option[Int] = None,
    /* Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1. */
    successThreshold: Option[Int] = None,
    tcpSocket: Option[TCPSocketAction] = None,
    /* Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes */
    timeoutSeconds: Option[Int] = None)
  extends ApiModel
