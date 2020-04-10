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
  * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
  */
case class TypedLocalObjectReference(
    /* APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required. */
    apiGroup: Option[String] = None,
    /* Kind is the type of resource being referenced */
    kind: String,
    /* Name is the name of resource being referenced */
    name: String)
  extends ApiModel
