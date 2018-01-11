/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListChargesResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5568749548650653926L;
    private List<GetChargeResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The charge objects
     */
    @JsonGetter("data")
    public List<GetChargeResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The charge objects
     */
    @JsonSetter("data")
    public void setData (List<GetChargeResponse> value) { 
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
 