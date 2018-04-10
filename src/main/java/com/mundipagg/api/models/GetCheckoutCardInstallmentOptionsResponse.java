/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetCheckoutCardInstallmentOptionsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5445333121260397706L;
    private String number;
    private int total;
    /** GETTER
     * Número de parcelas
     */
    @JsonGetter("number")
    public String getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * Número de parcelas
     */
    @JsonSetter("number")
    public void setNumber (String value) { 
        this.number = value;
    }
 
    /** GETTER
     * Valor total da compra
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * Valor total da compra
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
    }
 
}
 