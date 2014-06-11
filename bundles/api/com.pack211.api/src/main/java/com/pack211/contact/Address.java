package com.pack211.contact;

/**
 * Represents an address.
 *
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0.0.1
 */
public class Address {
    private String street1;
    private String street2;
    private String city;
    private USProperty state;
    private ZipCode zipCode;

    public Address() {
    }

    /**
     * @return the first line of a street address
     * @since 0.0.1
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * @param street1 the first line of a street address
     * @since 0.0.1
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * @return the second line of a street address
     * @since 0.0.1
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * @param street2 the second line of a street address
     * @since 0.0.1
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * @return the name of the city
     * @since 0.0.1
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the name of the city
     * @since 0.0.1
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the enumeration of the state, commonwealth or territory
     * @since 0.0.1
     */
    public USProperty getState() {
        return state;
    }

    /**
     * @param state the enumeration of the state, commonwealth or territory
     * @since 0.0.1
     */
    public void setState(USProperty state) {
        this.state = state;
    }

    /**
     * @return the zip code
     * @since 0.0.1
     */
    public ZipCode getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zip code
     * @since 0.0.1
     */
    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }
}
