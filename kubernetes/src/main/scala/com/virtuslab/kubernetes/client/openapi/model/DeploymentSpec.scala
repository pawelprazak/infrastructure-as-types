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
  * DeploymentSpec is the specification of the desired behavior of the Deployment.
  */
case class DeploymentSpec(
    /* Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
    minReadySeconds: Option[Int] = None,
    /* Indicates that the deployment is paused and will not be processed by the deployment controller. */
    paused: Option[Boolean] = None,
    /* The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means \"no deadline\". */
    progressDeadlineSeconds: Option[Int] = None,
    /* Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. */
    replicas: Option[Int] = None,
    /* The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means \"retaining all old RelicaSets\". */
    revisionHistoryLimit: Option[Int] = None,
    rollbackTo: Option[RollbackConfig] = None,
    selector: Option[LabelSelector] = None,
    strategy: Option[DeploymentStrategy] = None,
    template: PodTemplateSpec)
  extends ApiModel
