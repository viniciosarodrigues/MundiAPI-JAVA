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

public class GetBankAccountResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4978925497578501104L;
    private String id;
    private String holderName;
    private String holderType;
    private String bank;
    private String branchNumber;
    private String branchCheckDigit;
    private String accountNumber;
    private String accountCheckDigit;
    private String type;
    private String status;
    private DateTime createdAt;
    private DateTime updatedAt;
    private DateTime deletedAt;
    private GetRecipientResponse recipient;
    private LinkedHashMap<String, String> metadata;
    /** GETTER
     * Id
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Id
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Holder name
     */
    @JsonGetter("holder_name")
    public String getHolderName ( ) { 
        return this.holderName;
    }
    
    /** SETTER
     * Holder name
     */
    @JsonSetter("holder_name")
    public void setHolderName (String value) { 
        this.holderName = value;
    }
 
    /** GETTER
     * Holder type
     */
    @JsonGetter("holder_type")
    public String getHolderType ( ) { 
        return this.holderType;
    }
    
    /** SETTER
     * Holder type
     */
    @JsonSetter("holder_type")
    public void setHolderType (String value) { 
        this.holderType = value;
    }
 
    /** GETTER
     * Bank
     */
    @JsonGetter("bank")
    public String getBank ( ) { 
        return this.bank;
    }
    
    /** SETTER
     * Bank
     */
    @JsonSetter("bank")
    public void setBank (String value) { 
        this.bank = value;
    }
 
    /** GETTER
     * Branch number
     */
    @JsonGetter("branch_number")
    public String getBranchNumber ( ) { 
        return this.branchNumber;
    }
    
    /** SETTER
     * Branch number
     */
    @JsonSetter("branch_number")
    public void setBranchNumber (String value) { 
        this.branchNumber = value;
    }
 
    /** GETTER
     * Branch check digit
     */
    @JsonGetter("branch_check_digit")
    public String getBranchCheckDigit ( ) { 
        return this.branchCheckDigit;
    }
    
    /** SETTER
     * Branch check digit
     */
    @JsonSetter("branch_check_digit")
    public void setBranchCheckDigit (String value) { 
        this.branchCheckDigit = value;
    }
 
    /** GETTER
     * Account number
     */
    @JsonGetter("account_number")
    public String getAccountNumber ( ) { 
        return this.accountNumber;
    }
    
    /** SETTER
     * Account number
     */
    @JsonSetter("account_number")
    public void setAccountNumber (String value) { 
        this.accountNumber = value;
    }
 
    /** GETTER
     * Account check digit
     */
    @JsonGetter("account_check_digit")
    public String getAccountCheckDigit ( ) { 
        return this.accountCheckDigit;
    }
    
    /** SETTER
     * Account check digit
     */
    @JsonSetter("account_check_digit")
    public void setAccountCheckDigit (String value) { 
        this.accountCheckDigit = value;
    }
 
    /** GETTER
     * Bank account type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Bank account type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Bank account status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Bank account status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Creation date
     */
    @JsonGetter("created_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Creation date
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt (DateTime value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Last update date
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * Last update date
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt (DateTime value) { 
        this.updatedAt = value;
    }
 
    /** GETTER
     * Deletion date
     */
    @JsonGetter("deleted_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getDeletedAt ( ) { 
        return this.deletedAt;
    }
    
    /** SETTER
     * Deletion date
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt (DateTime value) { 
        this.deletedAt = value;
    }
 
    /** GETTER
     * Recipient
     */
    @JsonGetter("recipient")
    public GetRecipientResponse getRecipient ( ) { 
        return this.recipient;
    }
    
    /** SETTER
     * Recipient
     */
    @JsonSetter("recipient")
    public void setRecipient (GetRecipientResponse value) { 
        this.recipient = value;
    }
 
    /** GETTER
     * Metadata
     */
    @JsonGetter("metadata")
    public LinkedHashMap<String, String> getMetadata ( ) { 
        return this.metadata;
    }
    
    /** SETTER
     * Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata (LinkedHashMap<String, String> value) { 
        this.metadata = value;
    }
 
}
 