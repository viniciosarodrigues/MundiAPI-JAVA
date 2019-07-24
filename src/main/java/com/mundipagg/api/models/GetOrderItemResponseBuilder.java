/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetOrderItemResponseBuilder {
    //the instance to build
    private GetOrderItemResponse getOrderItemResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetOrderItemResponseBuilder() {
        getOrderItemResponse = new GetOrderItemResponse();
    }

    /**
     * Id
     */
    public GetOrderItemResponseBuilder id(String id) {
        getOrderItemResponse.setId(id);
        return this;
    }

    public GetOrderItemResponseBuilder amount(int amount) {
        getOrderItemResponse.setAmount(amount);
        return this;
    }

    public GetOrderItemResponseBuilder description(String description) {
        getOrderItemResponse.setDescription(description);
        return this;
    }

    public GetOrderItemResponseBuilder quantity(int quantity) {
        getOrderItemResponse.setQuantity(quantity);
        return this;
    }

    /**
     * Seller data
     */
    public GetOrderItemResponseBuilder getSellerResponse(GetSellerResponse getSellerResponse) {
        getOrderItemResponse.setGetSellerResponse(getSellerResponse);
        return this;
    }

    /**
     * Category
     */
    public GetOrderItemResponseBuilder category(String category) {
        getOrderItemResponse.setCategory(category);
        return this;
    }

    /**
     * Code
     */
    public GetOrderItemResponseBuilder code(String code) {
        getOrderItemResponse.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOrderItemResponse build() {
        return getOrderItemResponse;
    }
}