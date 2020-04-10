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
package com.virtuslab.kubernetes.client.openapi.api

import com.virtuslab.kubernetes.client.openapi.model.APIGroup
import com.virtuslab.kubernetes.client.openapi.core._
import alias._
import sttp.client._
import sttp.model.Method

object RbacAuthorizationApi {

  def apply(baseUrl: String = "http://localhost")(implicit serializer: SttpSerializer) = new RbacAuthorizationApi(baseUrl)
}

class RbacAuthorizationApi(baseUrl: String)(implicit serializer: SttpSerializer) {

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
      .method(Method.GET, uri"$baseUrl/apis/rbac.authorization.k8s.io/")
      .contentType("application/json")
      .header("authorization", apiKey.value)
      .response(asJson[APIGroup])

}
