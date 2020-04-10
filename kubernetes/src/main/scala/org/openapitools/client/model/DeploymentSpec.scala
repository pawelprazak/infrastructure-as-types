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
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

  /**
   * DeploymentSpec is the specification of the desired behavior of the Deployment.
   */
case class DeploymentSpec(
  /* Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) */
  minReadySeconds: Option[Int] = None,
  /* Indicates that the deployment is paused. */
  paused: Option[Boolean] = None,
  /* The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s. */
  progressDeadlineSeconds: Option[Int] = None,
  /* Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. */
  replicas: Option[Int] = None,
  /* The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10. */
  revisionHistoryLimit: Option[Int] = None,
  selector: LabelSelector,
  strategy: Option[DeploymentStrategy] = None,
  template: PodTemplateSpec
) extends ApiModel


