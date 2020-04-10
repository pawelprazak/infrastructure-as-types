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

import org.openapitools.client.model.APIGroup
import org.openapitools.client.core._
import alias._
import sttp.client._
import sttp.model.Method

object ExtensionsApi {

  def apply(baseUrl: String = "http://localhost")(implicit serializer: SttpSerializer) = new ExtensionsApi(baseUrl)
}

class ExtensionsApi(baseUrl: String)(implicit serializer: SttpSerializer) {

  import Helpers._
  import serializer._

  /**
   * get information of a group
   * 
   * Expected answers:
   *   code 200 : APIGroup (OK)
   *   code 401 :  (Unauthorized)
   * 
   * Available security schemes:
   *   BearerToken (apiKey)
   */
  def getAPIGroup()(implicit apiKey: ApiKeyValue): ApiRequestT[APIGroup] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/apis/extensions/")
      .contentType("application/json")
      .header("authorization", apiKey.value)
      .response(asJson[APIGroup])

}

