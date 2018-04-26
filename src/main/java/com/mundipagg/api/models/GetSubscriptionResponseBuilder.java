/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetSubscriptionResponseBuilder {
    //the instance to build
    private GetSubscriptionResponse getSubscriptionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSubscriptionResponseBuilder() {
        getSubscriptionResponse = new GetSubscriptionResponse();
    }

    public GetSubscriptionResponseBuilder id(String id) {
        getSubscriptionResponse.setId(id);
        return this;
    }

    public GetSubscriptionResponseBuilder code(String code) {
        getSubscriptionResponse.setCode(code);
        return this;
    }

    public GetSubscriptionResponseBuilder startAt(DateTime startAt) {
        getSubscriptionResponse.setStartAt(startAt);
        return this;
    }

    public GetSubscriptionResponseBuilder interval(String interval) {
        getSubscriptionResponse.setInterval(interval);
        return this;
    }

    public GetSubscriptionResponseBuilder intervalCount(int intervalCount) {
        getSubscriptionResponse.setIntervalCount(intervalCount);
        return this;
    }

    public GetSubscriptionResponseBuilder billingType(String billingType) {
        getSubscriptionResponse.setBillingType(billingType);
        return this;
    }

    public GetSubscriptionResponseBuilder currentCycle(GetPeriodResponse currentCycle) {
        getSubscriptionResponse.setCurrentCycle(currentCycle);
        return this;
    }

    public GetSubscriptionResponseBuilder paymentMethod(String paymentMethod) {
        getSubscriptionResponse.setPaymentMethod(paymentMethod);
        return this;
    }

    public GetSubscriptionResponseBuilder currency(String currency) {
        getSubscriptionResponse.setCurrency(currency);
        return this;
    }

    public GetSubscriptionResponseBuilder installments(int installments) {
        getSubscriptionResponse.setInstallments(installments);
        return this;
    }

    public GetSubscriptionResponseBuilder status(String status) {
        getSubscriptionResponse.setStatus(status);
        return this;
    }

    public GetSubscriptionResponseBuilder createdAt(DateTime createdAt) {
        getSubscriptionResponse.setCreatedAt(createdAt);
        return this;
    }

    public GetSubscriptionResponseBuilder updatedAt(DateTime updatedAt) {
        getSubscriptionResponse.setUpdatedAt(updatedAt);
        return this;
    }

    public GetSubscriptionResponseBuilder customer(GetCustomerResponse customer) {
        getSubscriptionResponse.setCustomer(customer);
        return this;
    }

    public GetSubscriptionResponseBuilder card(GetCardResponse card) {
        getSubscriptionResponse.setCard(card);
        return this;
    }

    public GetSubscriptionResponseBuilder items(List<GetSubscriptionItemResponse> items) {
        getSubscriptionResponse.setItems(items);
        return this;
    }

    public GetSubscriptionResponseBuilder statementDescriptor(String statementDescriptor) {
        getSubscriptionResponse.setStatementDescriptor(statementDescriptor);
        return this;
    }

    public GetSubscriptionResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getSubscriptionResponse.setMetadata(metadata);
        return this;
    }

    public GetSubscriptionResponseBuilder setup(GetSetupResponse setup) {
        getSubscriptionResponse.setSetup(setup);
        return this;
    }

    /**
     * Affiliation Code
     */
    public GetSubscriptionResponseBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        getSubscriptionResponse.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * Subscription increments
     */
    public GetSubscriptionResponseBuilder increments(List<GetIncrementResponse> increments) {
        getSubscriptionResponse.setIncrements(increments);
        return this;
    }

    public GetSubscriptionResponseBuilder nextBillingAt(DateTime nextBillingAt) {
        getSubscriptionResponse.setNextBillingAt(nextBillingAt);
        return this;
    }

    public GetSubscriptionResponseBuilder billingDay(Integer billingDay) {
        getSubscriptionResponse.setBillingDay(billingDay);
        return this;
    }

    public GetSubscriptionResponseBuilder minimumPrice(Integer minimumPrice) {
        getSubscriptionResponse.setMinimumPrice(minimumPrice);
        return this;
    }

    public GetSubscriptionResponseBuilder canceledAt(DateTime canceledAt) {
        getSubscriptionResponse.setCanceledAt(canceledAt);
        return this;
    }

    /**
     * Subscription discounts
     */
    public GetSubscriptionResponseBuilder discounts(List<GetDiscountResponse> discounts) {
        getSubscriptionResponse.setDiscounts(discounts);
        return this;
    }

    /**
     * Days until boleto expires
     */
    public GetSubscriptionResponseBuilder boletoDueDays(Integer boletoDueDays) {
        getSubscriptionResponse.setBoletoDueDays(boletoDueDays);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSubscriptionResponse build() {
        return getSubscriptionResponse;
    }
}