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
  * NodeAddress contains information for the node's address.
  */
case class NodeAddress(
    /* The node address. */
    address: String,
    /* Node address type, one of Hostname, ExternalIP or InternalIP. */
    `type`: String)
  extends ApiModel
