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

import java.time.OffsetDateTime
import org.openapitools.client.core.ApiModel

  /**
   * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system.
   */
case class Event(
  /* What action was taken/failed regarding to the regarding object. */
  action: Option[String] = None,
  /* APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources */
  apiVersion: Option[String] = None,
  /* Deprecated field assuring backward compatibility with core.v1 Event type */
  deprecatedCount: Option[Int] = None,
  /* Deprecated field assuring backward compatibility with core.v1 Event type */
  deprecatedFirstTimestamp: Option[OffsetDateTime] = None,
  /* Deprecated field assuring backward compatibility with core.v1 Event type */
  deprecatedLastTimestamp: Option[OffsetDateTime] = None,
  deprecatedSource: Option[EventSource] = None,
  /* Required. Time when this Event was first observed. */
  eventTime: OffsetDateTime,
  /* Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds */
  kind: Option[String] = None,
  metadata: Option[ObjectMeta] = None,
  /* Optional. A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB. */
  note: Option[String] = None,
  /* Why the action was taken. */
  reason: Option[String] = None,
  regarding: Option[ObjectReference] = None,
  related: Option[ObjectReference] = None,
  /* Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. */
  reportingController: Option[String] = None,
  /* ID of the controller instance, e.g. `kubelet-xyzf`. */
  reportingInstance: Option[String] = None,
  series: Option[EventSeries] = None,
  /* Type of this event (Normal, Warning), new types could be added in the future. */
  `type`: Option[String] = None
) extends ApiModel


