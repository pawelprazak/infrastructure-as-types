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

import org.json4s.JObject
import org.openapitools.client.core.ApiModel

  /**
   * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
   */
case class JSONSchemaProps(
  ref: Option[String] = None,
  schema: Option[String] = None,
  /* JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property. */
  additionalItems: Option[JObject] = None,
  /* JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the boolean property. */
  additionalProperties: Option[JObject] = None,
  allOf: Option[Seq[JSONSchemaProps]] = None,
  anyOf: Option[Seq[JSONSchemaProps]] = None,
  /* default is a default value for undefined object fields. Defaulting is an alpha feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false. */
  default: Option[JObject] = None,
  definitions: Option[Map[String, JSONSchemaProps]] = None,
  dependencies: Option[Map[String, JObject]] = None,
  description: Option[String] = None,
  enum: Option[Seq[JObject]] = None,
  /* JSON represents any valid JSON value. These types are supported: bool, int64, float64, string, []interface{}, map[string]interface{} and nil. */
  example: Option[JObject] = None,
  exclusiveMaximum: Option[Boolean] = None,
  exclusiveMinimum: Option[Boolean] = None,
  externalDocs: Option[ExternalDocumentation] = None,
  format: Option[String] = None,
  id: Option[String] = None,
  /* JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes. */
  items: Option[JObject] = None,
  maxItems: Option[Long] = None,
  maxLength: Option[Long] = None,
  maxProperties: Option[Long] = None,
  maximum: Option[Double] = None,
  minItems: Option[Long] = None,
  minLength: Option[Long] = None,
  minProperties: Option[Long] = None,
  minimum: Option[Double] = None,
  multipleOf: Option[Double] = None,
  not: Option[JSONSchemaProps] = None,
  nullable: Option[Boolean] = None,
  oneOf: Option[Seq[JSONSchemaProps]] = None,
  pattern: Option[String] = None,
  patternProperties: Option[Map[String, JSONSchemaProps]] = None,
  properties: Option[Map[String, JSONSchemaProps]] = None,
  required: Option[Seq[String]] = None,
  title: Option[String] = None,
  `type`: Option[String] = None,
  uniqueItems: Option[Boolean] = None,
  /* x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata). */
  xKubernetesEmbeddedResource: Option[Boolean] = None,
  /* x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:  1) anyOf:    - type: integer    - type: string 2) allOf:    - anyOf:      - type: integer      - type: string    - ... zero or more */
  xKubernetesIntOrString: Option[Boolean] = None,
  /* x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden. */
  xKubernetesPreserveUnknownFields: Option[Boolean] = None
) extends ApiModel


