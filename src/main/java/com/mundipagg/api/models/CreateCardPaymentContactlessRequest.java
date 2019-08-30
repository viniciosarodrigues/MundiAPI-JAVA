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
public class CreateCardPaymentContactlessRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1739099960915993977L;
    private String type;
    private CreateApplePayRequest applePay;
    private CreateGooglePayRequest googlePay;
    private CreateEmvDecryptRequest emv;
    /** GETTER
     * The authentication type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The authentication type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * The ApplePay encrypted request
     */
    @JsonGetter("apple_pay")
    public CreateApplePayRequest getApplePay ( ) { 
        return this.applePay;
    }
    
    /** SETTER
     * The ApplePay encrypted request
     */
    @JsonSetter("apple_pay")
    public void setApplePay (CreateApplePayRequest value) { 
        this.applePay = value;
    }
 
    /** GETTER
     * The GooglePay encrypted request
     */
    @JsonGetter("google_pay")
    public CreateGooglePayRequest getGooglePay ( ) { 
        return this.googlePay;
    }
    
    /** SETTER
     * The GooglePay encrypted request
     */
    @JsonSetter("google_pay")
    public void setGooglePay (CreateGooglePayRequest value) { 
        this.googlePay = value;
    }
 
    /** GETTER
     * The Emv encrypted request
     */
    @JsonGetter("emv")
    public CreateEmvDecryptRequest getEmv ( ) { 
        return this.emv;
    }
    
    /** SETTER
     * The Emv encrypted request
     */
    @JsonSetter("emv")
    public void setEmv (CreateEmvDecryptRequest value) { 
        this.emv = value;
    }
 
}
