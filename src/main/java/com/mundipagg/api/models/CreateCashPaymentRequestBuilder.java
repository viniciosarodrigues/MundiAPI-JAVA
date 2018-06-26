/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCashPaymentRequestBuilder {
    //the instance to build
    private CreateCashPaymentRequest createCashPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCashPaymentRequestBuilder() {
        createCashPaymentRequest = new CreateCashPaymentRequest();
    }

    /**
     * Description
     */
    public CreateCashPaymentRequestBuilder description(String description) {
        createCashPaymentRequest.setDescription(description);
        return this;
    }

    /**
     * Indicates whether cash collection will be confirmed in the act of creation
     */
    public CreateCashPaymentRequestBuilder confirm(boolean confirm) {
        createCashPaymentRequest.setConfirm(confirm);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCashPaymentRequest build() {
        return createCashPaymentRequest;
    }
}