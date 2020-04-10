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
  * represents the current status of a scale subresource.
  */
case class ScaleStatus(
    /* actual number of observed instances of the scaled object. */
    replicas: Int,
    /* label query over pods that should match the replicas count. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors */
    selector: Option[Map[String, String]] = None,
    /* label selector for pods that should match the replicas count. This is a serializated version of both map-based and more expressive set-based selectors. This is done to avoid introspection in the clients. The string will be in the same format as the query-param syntax. If the target type only supports map-based selectors, both this field and map-based selector field are populated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors */
    targetSelector: Option[String] = None)
  extends ApiModel
