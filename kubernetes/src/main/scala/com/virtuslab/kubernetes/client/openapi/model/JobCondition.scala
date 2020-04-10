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

import java.time.OffsetDateTime
import com.virtuslab.kubernetes.client.openapi.core.ApiModel

/**
  * JobCondition describes current state of a job.
  */
case class JobCondition(
    /* Last time the condition was checked. */
    lastProbeTime: Option[OffsetDateTime] = None,
    /* Last time the condition transit from one status to another. */
    lastTransitionTime: Option[OffsetDateTime] = None,
    /* Human readable message indicating details about last transition. */
    message: Option[String] = None,
    /* (brief) reason for the condition's last transition. */
    reason: Option[String] = None,
    /* Status of the condition, one of True, False, Unknown. */
    status: String,
    /* Type of job condition, Complete or Failed. */
    `type`: String)
  extends ApiModel
