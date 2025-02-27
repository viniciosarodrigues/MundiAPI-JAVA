/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetBalanceResponseBuilder {
    //the instance to build
    private GetBalanceResponse getBalanceResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetBalanceResponseBuilder() {
        getBalanceResponse = new GetBalanceResponse();
    }

    /**
     * Currency
     */
    public GetBalanceResponseBuilder currency(String currency) {
        getBalanceResponse.setCurrency(currency);
        return this;
    }

    /**
     * Amount available for transferring
     */
    public GetBalanceResponseBuilder availableAmount(long availableAmount) {
        getBalanceResponse.setAvailableAmount(availableAmount);
        return this;
    }

    /**
     * Recipient
     */
    public GetBalanceResponseBuilder recipient(GetRecipientResponse recipient) {
        getBalanceResponse.setRecipient(recipient);
        return this;
    }

    public GetBalanceResponseBuilder waitingFundsAmount(long waitingFundsAmount) {
        getBalanceResponse.setWaitingFundsAmount(waitingFundsAmount);
        return this;
    }

    public GetBalanceResponseBuilder transferredAmount(long transferredAmount) {
        getBalanceResponse.setTransferredAmount(transferredAmount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetBalanceResponse build() {
        return getBalanceResponse;
    }
}