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
   * NodeSpec describes the attributes that a node is created with.
   */
case class NodeSpec(
  configSource: Option[NodeConfigSource] = None,
  /* Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966 */
  externalID: Option[String] = None,
  /* PodCIDR represents the pod IP range assigned to the node. */
  podCIDR: Option[String] = None,
  /* ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID> */
  providerID: Option[String] = None,
  /* If specified, the node's taints. */
  taints: Option[Seq[Taint]] = None,
  /* Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration */
  unschedulable: Option[Boolean] = None
) extends ApiModel


