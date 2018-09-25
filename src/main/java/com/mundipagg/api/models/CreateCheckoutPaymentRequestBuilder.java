/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class CreateCheckoutPaymentRequestBuilder {
    //the instance to build
    private CreateCheckoutPaymentRequest createCheckoutPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckoutPaymentRequestBuilder() {
        createCheckoutPaymentRequest = new CreateCheckoutPaymentRequest();
    }

    /**
     * Accepted Payment Methods
     */
    public CreateCheckoutPaymentRequestBuilder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        createCheckoutPaymentRequest.setAcceptedPaymentMethods(acceptedPaymentMethods);
        return this;
    }

    /**
     * Accepted Multi Payment Methods
     */
    public CreateCheckoutPaymentRequestBuilder acceptedMultiPaymentMethods(List<Object> acceptedMultiPaymentMethods) {
        createCheckoutPaymentRequest.setAcceptedMultiPaymentMethods(acceptedMultiPaymentMethods);
        return this;
    }

    /**
     * Success url
     */
    public CreateCheckoutPaymentRequestBuilder successUrl(String successUrl) {
        createCheckoutPaymentRequest.setSuccessUrl(successUrl);
        return this;
    }

    /**
     * Default payment method
     */
    public CreateCheckoutPaymentRequestBuilder defaultPaymentMethod(String defaultPaymentMethod) {
        createCheckoutPaymentRequest.setDefaultPaymentMethod(defaultPaymentMethod);
        return this;
    }

    /**
     * Gateway Affiliation Id
     */
    public CreateCheckoutPaymentRequestBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        createCheckoutPaymentRequest.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * Credit Card payment request
     */
    public CreateCheckoutPaymentRequestBuilder creditCard(CreateCheckoutCreditCardPaymentRequest creditCard) {
        createCheckoutPaymentRequest.setCreditCard(creditCard);
        return this;
    }

    /**
     * Debit Card payment request
     */
    public CreateCheckoutPaymentRequestBuilder debitCard(CreateCheckoutDebitCardPaymentRequest debitCard) {
        createCheckoutPaymentRequest.setDebitCard(debitCard);
        return this;
    }

    /**
     * Boleto payment request
     */
    public CreateCheckoutPaymentRequestBuilder boleto(CreateCheckoutBoletoPaymentRequest boleto) {
        createCheckoutPaymentRequest.setBoleto(boleto);
        return this;
    }

    /**
     * Torna o objeto editável
     */
    public CreateCheckoutPaymentRequestBuilder customerEditable(Boolean customerEditable) {
        createCheckoutPaymentRequest.setCustomerEditable(customerEditable);
        return this;
    }

    /**
     * Tempo em minutos para a expiração
     */
    public CreateCheckoutPaymentRequestBuilder expiresIn(Integer expiresIn) {
        createCheckoutPaymentRequest.setExpiresIn(expiresIn);
        return this;
    }

    /**
     * Pular tela de sucesso pós-pagamento?
     */
    public CreateCheckoutPaymentRequestBuilder skipCheckoutSuccessPage(boolean skipCheckoutSuccessPage) {
        createCheckoutPaymentRequest.setSkipCheckoutSuccessPage(skipCheckoutSuccessPage);
        return this;
    }

    /**
     * Torna o objeto billing address editável
     */
    public CreateCheckoutPaymentRequestBuilder billingAddressEditable(boolean billingAddressEditable) {
        createCheckoutPaymentRequest.setBillingAddressEditable(billingAddressEditable);
        return this;
    }

    /**
     * Endereço de cobrança
     */
    public CreateCheckoutPaymentRequestBuilder billingAddress(CreateAddressRequest billingAddress) {
        createCheckoutPaymentRequest.setBillingAddress(billingAddress);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckoutPaymentRequest build() {
        return createCheckoutPaymentRequest;
    }
}