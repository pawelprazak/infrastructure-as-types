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
  * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
  */
case class NonResourceAttributes(
    /* Path is the URL path of the request */
    path: Option[String] = None,
    /* Verb is the standard HTTP verb */
    verb: Option[String] = None)
  extends ApiModel
