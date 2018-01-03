/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateDeviceRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5505876823168326163L;
    private String platform;
    /** GETTER
     * Device's platform
     */
    @JsonGetter("platform")
    public String getPlatform ( ) { 
        return this.platform;
    }
    
    /** SETTER
     * Device's platform
     */
    @JsonSetter("platform")
    public void setPlatform (String value) { 
        this.platform = value;
    }
 
}
 