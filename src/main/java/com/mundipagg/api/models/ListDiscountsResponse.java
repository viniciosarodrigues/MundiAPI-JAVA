/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListDiscountsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5050595530169777248L;
    private List<GetDiscountResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The Discounts response
     */
    @JsonGetter("data")
    public List<GetDiscountResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The Discounts response
     */
    @JsonSetter("data")
    public void setData (List<GetDiscountResponse> value) { 
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
 