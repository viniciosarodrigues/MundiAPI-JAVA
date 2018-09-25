/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;

public class GetThreeDSecureResponseBuilder {
    //the instance to build
    private GetThreeDSecureResponse getThreeDSecureResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetThreeDSecureResponseBuilder() {
        getThreeDSecureResponse = new GetThreeDSecureResponse();
    }

    /**
     * MPI Vendor
     */
    public GetThreeDSecureResponseBuilder mpi(String mpi) {
        getThreeDSecureResponse.setMpi(mpi);
        return this;
    }

    /**
     * Electronic Commerce Indicator (ECI) (Opcional)
     */
    public GetThreeDSecureResponseBuilder eci(String eci) {
        getThreeDSecureResponse.setEci(eci);
        return this;
    }

    /**
     * Online payment cryptogram, definido pelo 3-D Secure.
     */
    public GetThreeDSecureResponseBuilder cavv(String cavv) {
        getThreeDSecureResponse.setCavv(cavv);
        return this;
    }

    /**
     * Identificador da transação (XID)
     */
    public GetThreeDSecureResponseBuilder transactionId(String transactionId) {
        getThreeDSecureResponse.setTransactionId(transactionId);
        return this;
    }

    /**
     * Url de redirecionamento de sucessso
     */
    public GetThreeDSecureResponseBuilder successUrl(String successUrl) {
        getThreeDSecureResponse.setSuccessUrl(successUrl);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetThreeDSecureResponse build() {
        return getThreeDSecureResponse;
    }
}