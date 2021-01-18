/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class GetTransferSettingsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5663902074206946903L;
    private boolean transferEnabled;
    private String transferInterval;
    private int transferDay;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transfer_enabled")
    public boolean getTransferEnabled ( ) { 
        return this.transferEnabled;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transfer_enabled")
    public void setTransferEnabled (boolean value) { 
        this.transferEnabled = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transfer_interval")
    public String getTransferInterval ( ) { 
        return this.transferInterval;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transfer_interval")
    public void setTransferInterval (String value) { 
        this.transferInterval = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("transfer_day")
    public int getTransferDay ( ) { 
        return this.transferDay;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("transfer_day")
    public void setTransferDay (int value) { 
        this.transferDay = value;
    }
 
}
