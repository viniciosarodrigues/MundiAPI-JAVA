/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetDeviceResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5326310205476473744L;
    private String platform;
    /** GETTER
     * Device's platform name
     */
    @JsonGetter("platform")
    public String getPlatform ( ) { 
        return this.platform;
    }
    
    /** SETTER
     * Device's platform name
     */
    @JsonSetter("platform")
    public void setPlatform (String value) { 
        this.platform = value;
    }
 
}
 