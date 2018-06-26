/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListSubscriptionItemsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4979858146411285668L;
    private List<GetSubscriptionItemResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The subscription items
     */
    @JsonGetter("data")
    public List<GetSubscriptionItemResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The subscription items
     */
    @JsonSetter("data")
    public void setData (List<GetSubscriptionItemResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging object
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging object
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 