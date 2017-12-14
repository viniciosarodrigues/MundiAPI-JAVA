/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListAnticipationResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4934268954377103001L;
    private List<GetAnticipationResponse> data;
    private PagingResponse paging;
    /** GETTER
     * Anticipations
     */
    @JsonGetter("data")
    public List<GetAnticipationResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * Anticipations
     */
    @JsonSetter("data")
    public void setData (List<GetAnticipationResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Paging
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Paging
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
 