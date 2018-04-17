/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListCardsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5281004875990209594L;
    private List<GetCardResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The card objects
     */
    @JsonGetter("data")
    public List<GetCardResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The card objects
     */
    @JsonSetter("data")
    public void setData (List<GetCardResponse> value) { 
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
 