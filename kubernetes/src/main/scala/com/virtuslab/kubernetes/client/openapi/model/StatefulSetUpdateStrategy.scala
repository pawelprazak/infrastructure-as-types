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
  * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
  */
case class StatefulSetUpdateStrategy(
    rollingUpdate: Option[RollingUpdateStatefulSetStrategy] = None,
    /* Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate. */
    `type`: Option[String] = None)
  extends ApiModel
