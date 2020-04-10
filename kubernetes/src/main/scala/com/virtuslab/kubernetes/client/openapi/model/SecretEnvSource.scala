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
  * SecretEnvSource selects a Secret to populate the environment variables with.  The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
  */
case class SecretEnvSource(
    /* Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names */
    name: Option[String] = None,
    /* Specify whether the Secret must be defined */
    optional: Option[Boolean] = None)
  extends ApiModel
