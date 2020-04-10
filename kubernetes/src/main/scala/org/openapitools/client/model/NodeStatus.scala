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
   * NodeStatus is information about the current status of a node.
   */
case class NodeStatus(
  /* List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses */
  addresses: Option[Seq[NodeAddress]] = None,
  /* Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. */
  allocatable: Option[Map[String, String]] = None,
  /* Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
  capacity: Option[Map[String, String]] = None,
  /* Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition */
  conditions: Option[Seq[NodeCondition]] = None,
  config: Option[NodeConfigStatus] = None,
  daemonEndpoints: Option[NodeDaemonEndpoints] = None,
  /* List of container images on this node */
  images: Option[Seq[ContainerImage]] = None,
  nodeInfo: Option[NodeSystemInfo] = None,
  /* NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated. */
  phase: Option[String] = None,
  /* List of volumes that are attached to the node. */
  volumesAttached: Option[Seq[AttachedVolume]] = None,
  /* List of attachable volumes in use (mounted) by the node. */
  volumesInUse: Option[Seq[String]] = None
) extends ApiModel


