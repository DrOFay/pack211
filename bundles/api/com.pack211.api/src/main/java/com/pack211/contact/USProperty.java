package com.pack211.contact;

/**
 * An enumeration of States, Commonwealths and Territories of the United States
 *
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0.0.1
 */
public enum USProperty {
    // US States
    ALABAMA("AL", "Alabama"),
    ALASKA("AK", "Alaska"),
    ARIZONA("AZ", "Arizona"),
    ARKANSAS("AR", "Arkansas"),
    CALIFORNIA("CA", "California"),
    COLORADO("CO", "Colorado"),
    CONNECTICUT("CT", "Connecticut"),
    DELAWARE("DE", "Delaware"),
    DISTRICT_OF_COLUMBIA("DC", "District of Columbia"),
    FLORIDA("FL", "Florida"),
    GEORGIA("GA", "Georgia"),
    HAWAII("HI", "Hawaii"),
    IDAHO("ID", "Idaho"),
    ILLINOIS("IL", "Illinois"),
    INDIANA("IN", "Indiana"),
    IOWA("IA", "Iowa"),
    KANSAS("KS", "Kansas"),
    KENTUCKY("KY", "Kentucky"),
    LOUISIANA("LA", "Louisiana"),
    MAINE("ME", "Maine"),
    MARYLAND("MD", "Maryland"),
    MASSACHUSETTS("MA", "Massachusetts"),
    MICHIGAN("MI", "Michigan"),
    MINNESOTA("MN", "Minnesota"),
    MISSOURI("MO", "Missouri"),
    MISSISSIPPI("MS", "Mississippi"),
    MONTANA("MT", "Montana"),
    NEBRASKA("NE", "Nebraska"),
    NEVADA("NV", "Nevada"),
    NEW_HAMPSHIRE("NH", "New Hampshire"),
    NEW_JERSEY("NJ", "New Jersey"),
    NEW_MEXICO("NM", "New Mexico"),
    NEW_YORK("NY", "New York"),
    NORTH_CAROLINA("NC", "North Carolina"),
    NORTH_DAKOTA("ND", "North Dakota"),
    OHIO("OH", "Ohio"),
    OKLAHOMA("OK", "Oklahoma"),
    OREGON("OR", "Oregon"),
    PENNSYLVANIA("PA", "Pennsylvania"),
    RHODE_ISLAND("RI", "Rhode Island"),
    SOUTH_CAROLINA("SC", "South Carolina"),
    SOUTH_DAKOTA("SD", "South Dakota"),
    TENNESSEE("TN", "Tennessee"),
    TEXAS("TX", "Texas"),
    UTAH("UT", "Utah"),
    VERMONT("VT", "Vermont"),
    VIRGINIA("VA", "Virginia"),
    WASHINGTON("WA", "Washington"),
    WEST_VIRGINIA("WV", "West Virginia"),
    WISCONSIN("WS", "Wisconsin"),
    WYOMING("WY", "Wyoming"),
    // US Commonwealths/Territories
    AMERICAN_SAMOA("AS", "American Samoa"),
    MICRONESIA("FM", "Federated States of Micronesia"),
    GUAM("GU", "Guam"),
    MARSHALL_ISLANDS("MH", "Marshall Island"),
    MARIANA("MP", "Northern Mariana Islands"),
    PALAU("PW", "Palau"),
    PUERTO_RICO("PR", "Puerto Rico"),
    VIRGIN_ISLANDS("VI", "Virgin Islands");

    /**
     * The abbreviation for the state, commonwealth or territory
     */
    private String abbreviation;
    /**
     * The name of the state, commonwealth or territory
     */
    private String name;

    private USProperty(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String toString() {
        return abbreviation;
    }
}
