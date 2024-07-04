#
# OpenAPI Petstore
# 
# This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
# The version of the OpenAPI document: 1.0.0
# 
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_order

const basepath = "http://petstore.swagger.io/v2"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc deleteOrder*(httpClient: HttpClient, orderId: string): Response =
  ## Delete purchase order by ID
  httpClient.delete(basepath & fmt"/store/order/{orderId}")


proc getInventory*(httpClient: HttpClient): (Option[Table[string, int]], Response) =
  ## Returns pet inventories by status

  let response = httpClient.get(basepath & "/store/inventory")
  constructResult[Table[string, int]](response)


proc getOrderById*(httpClient: HttpClient, orderId: int64): (Option[Order], Response) =
  ## Find purchase order by ID

  let response = httpClient.get(basepath & fmt"/store/order/{orderId}")
  constructResult[Order](response)


proc placeOrder*(httpClient: HttpClient, order: Order): (Option[Order], Response) =
  ## Place an order for a pet
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & "/store/order", $(%order))
  constructResult[Order](response)

