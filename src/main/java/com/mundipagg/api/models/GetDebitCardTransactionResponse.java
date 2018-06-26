/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonTypeInfo(
          use = JsonTypeInfo.Id.NAME,
          include = JsonTypeInfo.As.EXISTING_PROPERTY,
          property = "transaction_type",
          defaultImpl = GetDebitCardTransactionResponse.class,
          visible = true)
@JsonInclude(Include.ALWAYS)
public class GetDebitCardTransactionResponse 
        extends GetTransactionResponse {
    private static final long serialVersionUID = 5477638262134103766L;
    private String statementDescriptor;
    private String acquirerName;
    private String acquirerAffiliationCode;
    private String acquirerTid;
    private String acquirerNsu;
    private String acquirerAuthCode;
    private String operationType;
    private GetCardResponse card;
    private String acquirerMessage;
    private String acquirerReturnCode;
    private String mpi;
    private String eci;
    private String authenticationType;
    private String authenticationUrl;
    /** GETTER
     * Text that will appear on the debit card's statement
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Text that will appear on the debit card's statement
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * Acquirer name
     */
    @JsonGetter("acquirer_name")
    public String getAcquirerName ( ) { 
        return this.acquirerName;
    }
    
    /** SETTER
     * Acquirer name
     */
    @JsonSetter("acquirer_name")
    public void setAcquirerName (String value) { 
        this.acquirerName = value;
    }
 
    /** GETTER
     * Aquirer affiliation code
     */
    @JsonGetter("acquirer_affiliation_code")
    public String getAcquirerAffiliationCode ( ) { 
        return this.acquirerAffiliationCode;
    }
    
    /** SETTER
     * Aquirer affiliation code
     */
    @JsonSetter("acquirer_affiliation_code")
    public void setAcquirerAffiliationCode (String value) { 
        this.acquirerAffiliationCode = value;
    }
 
    /** GETTER
     * Acquirer TID
     */
    @JsonGetter("acquirer_tid")
    public String getAcquirerTid ( ) { 
        return this.acquirerTid;
    }
    
    /** SETTER
     * Acquirer TID
     */
    @JsonSetter("acquirer_tid")
    public void setAcquirerTid (String value) { 
        this.acquirerTid = value;
    }
 
    /** GETTER
     * Acquirer NSU
     */
    @JsonGetter("acquirer_nsu")
    public String getAcquirerNsu ( ) { 
        return this.acquirerNsu;
    }
    
    /** SETTER
     * Acquirer NSU
     */
    @JsonSetter("acquirer_nsu")
    public void setAcquirerNsu (String value) { 
        this.acquirerNsu = value;
    }
 
    /** GETTER
     * Acquirer authorization code
     */
    @JsonGetter("acquirer_auth_code")
    public String getAcquirerAuthCode ( ) { 
        return this.acquirerAuthCode;
    }
    
    /** SETTER
     * Acquirer authorization code
     */
    @JsonSetter("acquirer_auth_code")
    public void setAcquirerAuthCode (String value) { 
        this.acquirerAuthCode = value;
    }
 
    /** GETTER
     * Operation type
     */
    @JsonGetter("operation_type")
    public String getOperationType ( ) { 
        return this.operationType;
    }
    
    /** SETTER
     * Operation type
     */
    @JsonSetter("operation_type")
    public void setOperationType (String value) { 
        this.operationType = value;
    }
 
    /** GETTER
     * Card data
     */
    @JsonGetter("card")
    public GetCardResponse getCard ( ) { 
        return this.card;
    }
    
    /** SETTER
     * Card data
     */
    @JsonSetter("card")
    public void setCard (GetCardResponse value) { 
        this.card = value;
    }
 
    /** GETTER
     * Acquirer message
     */
    @JsonGetter("acquirer_message")
    public String getAcquirerMessage ( ) { 
        return this.acquirerMessage;
    }
    
    /** SETTER
     * Acquirer message
     */
    @JsonSetter("acquirer_message")
    public void setAcquirerMessage (String value) { 
        this.acquirerMessage = value;
    }
 
    /** GETTER
     * Acquirer Return Code
     */
    @JsonGetter("acquirer_return_code")
    public String getAcquirerReturnCode ( ) { 
        return this.acquirerReturnCode;
    }
    
    /** SETTER
     * Acquirer Return Code
     */
    @JsonSetter("acquirer_return_code")
    public void setAcquirerReturnCode (String value) { 
        this.acquirerReturnCode = value;
    }
 
    /** GETTER
     * Merchant Plugin
     */
    @JsonGetter("mpi")
    public String getMpi ( ) { 
        return this.mpi;
    }
    
    /** SETTER
     * Merchant Plugin
     */
    @JsonSetter("mpi")
    public void setMpi (String value) { 
        this.mpi = value;
    }
 
    /** GETTER
     * Electronic Commerce Indicator (ECI)
     */
    @JsonGetter("eci")
    public String getEci ( ) { 
        return this.eci;
    }
    
    /** SETTER
     * Electronic Commerce Indicator (ECI)
     */
    @JsonSetter("eci")
    public void setEci (String value) { 
        this.eci = value;
    }
 
    /** GETTER
     * Authentication type
     */
    @JsonGetter("authentication_type")
    public String getAuthenticationType ( ) { 
        return this.authenticationType;
    }
    
    /** SETTER
     * Authentication type
     */
    @JsonSetter("authentication_type")
    public void setAuthenticationType (String value) { 
        this.authenticationType = value;
    }
 
    /** GETTER
     * Authentication Url
     */
    @JsonGetter("authentication_url")
    public String getAuthenticationUrl ( ) { 
        return this.authenticationUrl;
    }
    
    /** SETTER
     * Authentication Url
     */
    @JsonSetter("authentication_url")
    public void setAuthenticationUrl (String value) { 
        this.authenticationUrl = value;
    }
 
}
 