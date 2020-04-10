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
   * Handler defines a specific action that should be taken
   */
case class Handler(
  exec: Option[ExecAction] = None,
  httpGet: Option[HTTPGetAction] = None,
  tcpSocket: Option[TCPSocketAction] = None
) extends ApiModel


