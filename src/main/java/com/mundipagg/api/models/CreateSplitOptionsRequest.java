/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSplitOptionsRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -6586678224512336171L;
    private Boolean liable;
    private String chargeProcessingFee;
    /** GETTER
     * Liable options
     */
    @JsonGetter("liable")
    public Boolean getLiable ( ) { 
        return this.liable;
    }
    
    /** SETTER
     * Liable options
     */
    @JsonSetter("liable")
    public void setLiable (Boolean value) { 
        this.liable = value;
    }
 
    /** GETTER
     * Charge processing fee
     */
    @JsonGetter("charge_processing_fee")
    public String getChargeProcessingFee ( ) { 
        return this.chargeProcessingFee;
    }
    
    /** SETTER
     * Charge processing fee
     */
    @JsonSetter("charge_processing_fee")
    public void setChargeProcessingFee (String value) { 
        this.chargeProcessingFee = value;
    }
 
}
 