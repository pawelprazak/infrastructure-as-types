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
  * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
  */
case class OwnerReference(
    /* API version of the referent. */
    apiVersion: String,
    /* If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. */
    blockOwnerDeletion: Option[Boolean] = None,
    /* If true, this reference points to the managing controller. */
    controller: Option[Boolean] = None,
    /* Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
    kind: String,
    /* Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names */
    name: String,
    /* UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids */
    uid: String)
  extends ApiModel
