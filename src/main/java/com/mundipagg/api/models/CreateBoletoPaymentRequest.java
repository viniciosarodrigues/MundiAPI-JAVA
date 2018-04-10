/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mundipagg.api.DateTimeHelper;
import org.joda.time.DateTime;

public class CreateBoletoPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4863980962404468983L;
    private int retries;
    private String bank;
    private String instructions;
    private DateTime dueAt;
    private CreateAddressRequest billingAddress;
    private String billingAddressId;
    private String nossoNumero;
    /** GETTER
     * Number of retries
     */
    @JsonGetter("retries")
    public int getRetries ( ) { 
        return this.retries;
    }
    
    /** SETTER
     * Number of retries
     */
    @JsonSetter("retries")
    public void setRetries (int value) { 
        this.retries = value;
    }
 
    /** GETTER
     * The bank code, containing three characters. The available codes are on the API specification
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * The bank code, containing three characters. The available codes are on the API specification
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
    }
 
    /** GETTER
     * The instructions field that will be printed on the boleto.
     */
    @JsonGetter("instructions")
    public String getInstructions ( ) { 
        return this.instructions;
    }
    
    /** SETTER
     * The instructions field that will be printed on the boleto.
     */
    @JsonSetter("instructions")
    public void setInstructions (String value) { 
        this.instructions = value;
    }
 
    /** GETTER
     * Boleto due date
     */
    @JsonGetter("due_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDueAt ( ) { 
        return this.dueAt;
    }
    
    /** SETTER
     * Boleto due date
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt (DateTime value) { 
        this.dueAt = value;
    }
 
    /** GETTER
     * Card's billing address
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * Card's billing address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress (CreateAddressRequest value) { 
        this.billingAddress = value;
    }
 
    /** GETTER
     * The address id for the billing address
     */
    @JsonGetter("billing_address_id")
    public String getBillingAddressId ( ) { 
        return this.billingAddressId;
    }
    
    /** SETTER
     * The address id for the billing address
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId (String value) { 
        this.billingAddressId = value;
    }
 
    /** GETTER
     * Número de identificação do cliente com o banco
     */
    @JsonGetter("nosso_numero")
    public String getNossoNumero ( ) { 
        return this.nossoNumero;
    }
    
    /** SETTER
     * Número de identificação do cliente com o banco
     */
    @JsonSetter("nosso_numero")
    public void setNossoNumero (String value) { 
        this.nossoNumero = value;
    }
 
}
 