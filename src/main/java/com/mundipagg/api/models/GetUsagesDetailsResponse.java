/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetUsagesDetailsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5494512187401767593L;
    private String subscriptionId;
    private int totalAmount;
    private GetPeriodResponse period;
    private ListUsagesDetailsResponse usages;
    private Integer totalDiscount;
    private Integer totalIncrement;
    /** GETTER
     * Subscription Identifier
     */
    @JsonGetter("subscription_id")
    public String getSubscriptionId ( ) { 
        return this.subscriptionId;
    }
    
    /** SETTER
     * Subscription Identifier
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId (String value) { 
        this.subscriptionId = value;
    }
 
    /** GETTER
     * Current Invoice Amount
     */
    @JsonGetter("total_amount")
    public int getTotalAmount ( ) { 
        return this.totalAmount;
    }
    
    /** SETTER
     * Current Invoice Amount
     */
    @JsonSetter("total_amount")
    public void setTotalAmount (int value) { 
        this.totalAmount = value;
    }
 
    /** GETTER
     * Period Details
     */
    @JsonGetter("Period")
    public GetPeriodResponse getPeriod ( ) { 
        return this.period;
    }
    
    /** SETTER
     * Period Details
     */
    @JsonSetter("Period")
    public void setPeriod (GetPeriodResponse value) { 
        this.period = value;
    }
 
    /** GETTER
     * Usages Details
     */
    @JsonGetter("Usages")
    public ListUsagesDetailsResponse getUsages ( ) { 
        return this.usages;
    }
    
    /** SETTER
     * Usages Details
     */
    @JsonSetter("Usages")
    public void setUsages (ListUsagesDetailsResponse value) { 
        this.usages = value;
    }
 
    /** GETTER
     * Total discounted value
     */
    @JsonGetter("total_discount")
    public Integer getTotalDiscount ( ) { 
        return this.totalDiscount;
    }
    
    /** SETTER
     * Total discounted value
     */
    @JsonSetter("total_discount")
    public void setTotalDiscount (Integer value) { 
        this.totalDiscount = value;
    }
 
    /** GETTER
     * Total inremented value
     */
    @JsonGetter("total_increment")
    public Integer getTotalIncrement ( ) { 
        return this.totalIncrement;
    }
    
    /** SETTER
     * Total inremented value
     */
    @JsonSetter("total_increment")
    public void setTotalIncrement (Integer value) { 
        this.totalIncrement = value;
    }
 
}
 