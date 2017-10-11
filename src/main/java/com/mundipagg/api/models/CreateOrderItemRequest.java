/*
 * MundiAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mundipagg.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateOrderItemRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5132800588925083700L;
    private int amount;
    private String description;
    private int quantity;
    private CreateSellerRequest seller;
    private String sellerId;
    /** GETTER
     * Amount
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Quantity
     */
    @JsonGetter("quantity")
    public int getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Quantity
     */
    @JsonSetter("quantity")
    public void setQuantity (int value) { 
        this.quantity = value;
    }
 
    /** GETTER
     * Item seller
     */
    @JsonGetter("seller")
    public CreateSellerRequest getSeller ( ) { 
        return this.seller;
    }
    
    /** SETTER
     * Item seller
     */
    @JsonSetter("seller")
    public void setSeller (CreateSellerRequest value) { 
        this.seller = value;
    }
 
    /** GETTER
     * seller identificator
     */
    @JsonGetter("seller_id")
    public String getSellerId ( ) { 
        return this.sellerId;
    }
    
    /** SETTER
     * seller identificator
     */
    @JsonSetter("seller_id")
    public void setSellerId (String value) { 
        this.sellerId = value;
    }
 
}
 