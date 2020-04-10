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
  * IDRange provides a min/max of an allowed range of IDs.
  */
case class IDRange(
    /* max is the end of the range, inclusive. */
    max: Long,
    /* min is the start of the range, inclusive. */
    min: Long)
  extends ApiModel
