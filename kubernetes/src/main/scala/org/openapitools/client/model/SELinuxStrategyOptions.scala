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
   * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use SELinuxStrategyOptions from policy API Group instead.
   */
case class SELinuxStrategyOptions(
  /* rule is the strategy that will dictate the allowable labels that may be set. */
  rule: String,
  seLinuxOptions: Option[SELinuxOptions] = None
) extends ApiModel


