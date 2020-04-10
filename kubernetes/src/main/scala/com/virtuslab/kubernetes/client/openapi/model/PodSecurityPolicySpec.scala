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
  * PodSecurityPolicySpec defines the policy enforced.
  */
case class PodSecurityPolicySpec(
    /* allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true. */
    allowPrivilegeEscalation: Option[Boolean] = None,
    /* AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes. This is an alpha field, and is only honored if the API server enables the CSIInlineVolume feature gate. */
    allowedCSIDrivers: Option[Seq[AllowedCSIDriver]] = None,
    /* allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities. */
    allowedCapabilities: Option[Seq[String]] = None,
    /* allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \"volumes\" field. */
    allowedFlexVolumes: Option[Seq[AllowedFlexVolume]] = None,
    /* allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used. */
    allowedHostPaths: Option[Seq[AllowedHostPath]] = None,
    /* AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled. */
    allowedProcMountTypes: Option[Seq[String]] = None,
    /* allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.  Examples: e.g. \"foo/_*\" allows \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" allows \"foo.bar\", \"foo.baz\", etc. */
    allowedUnsafeSysctls: Option[Seq[String]] = None,
    /* defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list. */
    defaultAddCapabilities: Option[Seq[String]] = None,
    /* defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process. */
    defaultAllowPrivilegeEscalation: Option[Boolean] = None,
    /* forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \"*\" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.  Examples: e.g. \"foo/_*\" forbids \"foo/bar\", \"foo/baz\", etc. e.g. \"foo.*\" forbids \"foo.bar\", \"foo.baz\", etc. */
    forbiddenSysctls: Option[Seq[String]] = None,
    fsGroup: FSGroupStrategyOptions,
    /* hostIPC determines if the policy allows the use of HostIPC in the pod spec. */
    hostIPC: Option[Boolean] = None,
    /* hostNetwork determines if the policy allows the use of HostNetwork in the pod spec. */
    hostNetwork: Option[Boolean] = None,
    /* hostPID determines if the policy allows the use of HostPID in the pod spec. */
    hostPID: Option[Boolean] = None,
    /* hostPorts determines which host port ranges are allowed to be exposed. */
    hostPorts: Option[Seq[HostPortRange]] = None,
    /* privileged determines if a pod can request to be run as privileged. */
    privileged: Option[Boolean] = None,
    /* readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to. */
    readOnlyRootFilesystem: Option[Boolean] = None,
    /* requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added. */
    requiredDropCapabilities: Option[Seq[String]] = None,
    runAsGroup: Option[RunAsGroupStrategyOptions] = None,
    runAsUser: RunAsUserStrategyOptions,
    runtimeClass: Option[RuntimeClassStrategyOptions] = None,
    seLinux: SELinuxStrategyOptions,
    supplementalGroups: SupplementalGroupsStrategyOptions,
    /* volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'. */
    volumes: Option[Seq[String]] = None)
  extends ApiModel
