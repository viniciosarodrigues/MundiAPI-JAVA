/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class UpdateSubscriptionStartAtRequestBuilder {
    //the instance to build
    private UpdateSubscriptionStartAtRequest updateSubscriptionStartAtRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateSubscriptionStartAtRequestBuilder() {
        updateSubscriptionStartAtRequest = new UpdateSubscriptionStartAtRequest();
    }

    /**
     * The date when the subscription periods will start
     */
    public UpdateSubscriptionStartAtRequestBuilder startAt(DateTime startAt) {
        updateSubscriptionStartAtRequest.setStartAt(startAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateSubscriptionStartAtRequest build() {
        return updateSubscriptionStartAtRequest;
    }
}