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

import java.time.OffsetDateTime
import com.virtuslab.kubernetes.client.openapi.core.ApiModel

/**
  * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
  */
case class HorizontalPodAutoscalerStatus(
    /* conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met. */
    conditions: Seq[HorizontalPodAutoscalerCondition],
    /* currentMetrics is the last read state of the metrics used by this autoscaler. */
    currentMetrics: Option[Seq[MetricStatus]] = None,
    /* currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler. */
    currentReplicas: Int,
    /* desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler. */
    desiredReplicas: Int,
    /* lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed. */
    lastScaleTime: Option[OffsetDateTime] = None,
    /* observedGeneration is the most recent generation observed by this autoscaler. */
    observedGeneration: Option[Long] = None)
  extends ApiModel
