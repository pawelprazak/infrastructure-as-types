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
  * AttachedVolume describes a volume attached to a node
  */
case class AttachedVolume(
    /* DevicePath represents the device path where the volume should be available */
    devicePath: String,
    /* Name of the attached volume */
    name: String)
  extends ApiModel
