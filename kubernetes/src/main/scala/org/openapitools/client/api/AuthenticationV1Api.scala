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
package org.openapitools.client.api

import org.openapitools.client.model.APIResourceList
import org.openapitools.client.model.TokenReview
import org.openapitools.client.core._
import alias._
import sttp.client._
import sttp.model.Method

object AuthenticationV1Api {

  def apply(baseUrl: String = "http://localhost")(implicit serializer: SttpSerializer) = new AuthenticationV1Api(baseUrl)
}

class AuthenticationV1Api(baseUrl: String)(implicit serializer: SttpSerializer) {

  import Helpers._
  import serializer._

  /**
   * create a TokenReview
   * 
   * Expected answers:
   *   code 200 : TokenReview (OK)
   *   code 201 : TokenReview (Created)
   *   code 202 : TokenReview (Accepted)
   *   code 401 :  (Unauthorized)
   * 
   * Available security schemes:
   *   BearerToken (apiKey)
   * 
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint.
   * @param pretty If 'true', then the output is pretty printed.
   * @param body 
   */
  def createTokenReview(dryRun: Option[String] = None, fieldManager: Option[String] = None, pretty: Option[String] = None, body: TokenReview)(implicit apiKey: ApiKeyValue): ApiRequestT[TokenReview] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/apis/authentication.k8s.io/v1/tokenreviews?dryRun=$dryRun&fieldManager=$fieldManager&pretty=$pretty")
      .contentType("application/json")
      .header("authorization", apiKey.value)
      .body(body)
      .response(asJson[TokenReview])

  /**
   * get available resources
   * 
   * Expected answers:
   *   code 200 : APIResourceList (OK)
   *   code 401 :  (Unauthorized)
   * 
   * Available security schemes:
   *   BearerToken (apiKey)
   */
  def getAPIResources()(implicit apiKey: ApiKeyValue): ApiRequestT[APIResourceList] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/apis/authentication.k8s.io/v1/")
      .contentType("application/json")
      .header("authorization", apiKey.value)
      .response(asJson[APIResourceList])

}

