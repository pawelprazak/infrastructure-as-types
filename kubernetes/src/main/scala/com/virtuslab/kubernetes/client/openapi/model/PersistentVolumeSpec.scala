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
  * PersistentVolumeSpec is the specification of a persistent volume.
  */
case class PersistentVolumeSpec(
    /* AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes */
    accessModes: Option[Seq[String]] = None,
    awsElasticBlockStore: Option[AWSElasticBlockStoreVolumeSource] = None,
    azureDisk: Option[AzureDiskVolumeSource] = None,
    azureFile: Option[AzureFilePersistentVolumeSource] = None,
    /* A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity */
    capacity: Option[Map[String, String]] = None,
    cephfs: Option[CephFSPersistentVolumeSource] = None,
    cinder: Option[CinderPersistentVolumeSource] = None,
    claimRef: Option[ObjectReference] = None,
    csi: Option[CSIPersistentVolumeSource] = None,
    fc: Option[FCVolumeSource] = None,
    flexVolume: Option[FlexPersistentVolumeSource] = None,
    flocker: Option[FlockerVolumeSource] = None,
    gcePersistentDisk: Option[GCEPersistentDiskVolumeSource] = None,
    glusterfs: Option[GlusterfsPersistentVolumeSource] = None,
    hostPath: Option[HostPathVolumeSource] = None,
    iscsi: Option[ISCSIPersistentVolumeSource] = None,
    local: Option[LocalVolumeSource] = None,
    /* A list of mount options, e.g. [\"ro\", \"soft\"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options */
    mountOptions: Option[Seq[String]] = None,
    nfs: Option[NFSVolumeSource] = None,
    nodeAffinity: Option[VolumeNodeAffinity] = None,
    /* What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming */
    persistentVolumeReclaimPolicy: Option[String] = None,
    photonPersistentDisk: Option[PhotonPersistentDiskVolumeSource] = None,
    portworxVolume: Option[PortworxVolumeSource] = None,
    quobyte: Option[QuobyteVolumeSource] = None,
    rbd: Option[RBDPersistentVolumeSource] = None,
    scaleIO: Option[ScaleIOPersistentVolumeSource] = None,
    /* Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass. */
    storageClassName: Option[String] = None,
    storageos: Option[StorageOSPersistentVolumeSource] = None,
    /* volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. This is a beta feature. */
    volumeMode: Option[String] = None,
    vsphereVolume: Option[VsphereVirtualDiskVolumeSource] = None)
  extends ApiModel
