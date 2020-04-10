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

import org.openapitools.client.core.ApiModel

  /**
   * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
   */
case class TopologySelectorLabelRequirement(
  /* The label key that the selector applies to. */
  key: String,
  /* An array of string values. One value must match the label to be selected. Each entry in Values is ORed. */
  values: Seq[String]
) extends ApiModel


