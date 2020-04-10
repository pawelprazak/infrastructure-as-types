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
   * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
   */
case class NodeSystemInfo(
  /* The Architecture reported by the node */
  architecture: String,
  /* Boot ID reported by the node. */
  bootID: String,
  /* ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0). */
  containerRuntimeVersion: String,
  /* Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64). */
  kernelVersion: String,
  /* KubeProxy Version reported by the node. */
  kubeProxyVersion: String,
  /* Kubelet Version reported by the node. */
  kubeletVersion: String,
  /* MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html */
  machineID: String,
  /* The Operating System reported by the node */
  operatingSystem: String,
  /* OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)). */
  osImage: String,
  /* SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-US/Red_Hat_Subscription_Management/1/html/RHSM/getting-system-uuid.html */
  systemUUID: String
) extends ApiModel


