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
   * WebhookThrottleConfig holds the configuration for throttling events
   */
case class WebhookThrottleConfig(
  /* ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS */
  burst: Option[Long] = None,
  /* ThrottleQPS maximum number of batches per second default 10 QPS */
  qps: Option[Long] = None
) extends ApiModel


