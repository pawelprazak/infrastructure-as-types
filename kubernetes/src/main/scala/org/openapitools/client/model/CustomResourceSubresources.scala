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

import org.json4s.JObject
import org.openapitools.client.core.ApiModel

  /**
   * CustomResourceSubresources defines the status and scale subresources for CustomResources.
   */
case class CustomResourceSubresources(
  scale: Option[CustomResourceSubresourceScale] = None,
  /* Status denotes the status subresource for CustomResources */
  status: Option[JObject] = None
) extends ApiModel


