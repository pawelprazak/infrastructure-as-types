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

import java.time.OffsetDateTime
import org.openapitools.client.core.ApiModel

  /**
   * ReplicaSetCondition describes the state of a replica set at a certain point.
   */
case class ReplicaSetCondition(
  /* The last time the condition transitioned from one status to another. */
  lastTransitionTime: Option[OffsetDateTime] = None,
  /* A human readable message indicating details about the transition. */
  message: Option[String] = None,
  /* The reason for the condition's last transition. */
  reason: Option[String] = None,
  /* Status of the condition, one of True, False, Unknown. */
  status: String,
  /* Type of replica set condition. */
  `type`: String
) extends ApiModel


