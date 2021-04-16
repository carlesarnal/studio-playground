
package org.example.address.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Type for Address
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "country",
    "street"
})
public class Address {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("country")
    private String country;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street")
    @JsonPropertyDescription("")
    private String street;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

}
