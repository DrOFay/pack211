package com.pack211.contact;

/**
 * An enumeration of States, Commonwealths and Territories of the United States
 *
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0.0.1
 */
public enum State {
    // US States
    ALABAMA("AL", "Alabama", 10),
    ALASKA("AK", "Alaska", 11),
    ARIZONA("AZ", "Arizona", 12),
    ARKANSAS("AR", "Arkansas", 13),
    CALIFORNIA("CA", "California", 14),
    COLORADO("CO", "Colorado", 15),
    CONNECTICUT("CT", "Connecticut", 16),
    DELAWARE("DE", "Delaware", 17),
    DISTRICT_OF_COLUMBIA("DC", "District of Columbia", 18),
    FLORIDA("FL", "Florida", 19),
    GEORGIA("GA", "Georgia", 20),
    HAWAII("HI", "Hawaii", 21),
    IDAHO("ID", "Idaho", 22),
    ILLINOIS("IL", "Illinois", 23),
    INDIANA("IN", "Indiana", 24),
    IOWA("IA", "Iowa", 25),
    KANSAS("KS", "Kansas", 26),
    KENTUCKY("KY", "Kentucky", 27),
    LOUISIANA("LA", "Louisiana", 28),
    MAINE("ME", "Maine", 29),
    MARYLAND("MD", "Maryland", 30),
    MASSACHUSETTS("MA", "Massachusetts", 31),
    MICHIGAN("MI", "Michigan", 32),
    MINNESOTA("MN", "Minnesota", 33),
    MISSOURI("MO", "Missouri", 34),
    MISSISSIPPI("MS", "Mississippi", 35),
    MONTANA("MT", "Montana", 36),
    NEBRASKA("NE", "Nebraska", 37),
    NEVADA("NV", "Nevada", 38),
    NEW_HAMPSHIRE("NH", "New Hampshire", 39),
    NEW_JERSEY("NJ", "New Jersey", 40),
    NEW_MEXICO("NM", "New Mexico", 41),
    NEW_YORK("NY", "New York", 42),
    NORTH_CAROLINA("NC", "North Carolina", 43),
    NORTH_DAKOTA("ND", "North Dakota", 44),
    OHIO("OH", "Ohio", 45),
    OKLAHOMA("OK", "Oklahoma", 46),
    OREGON("OR", "Oregon", 47),
    PENNSYLVANIA("PA", "Pennsylvania", 48),
    RHODE_ISLAND("RI", "Rhode Island", 49),
    SOUTH_CAROLINA("SC", "South Carolina", 50),
    SOUTH_DAKOTA("SD", "South Dakota", 51),
    TENNESSEE("TN", "Tennessee", 52),
    TEXAS("TX", "Texas", 53),
    UTAH("UT", "Utah", 54),
    VERMONT("VT", "Vermont", 55),
    VIRGINIA("VA", "Virginia", 56),
    WASHINGTON("WA", "Washington", 57),
    WEST_VIRGINIA("WV", "West Virginia", 58),
    WISCONSIN("WS", "Wisconsin", 59),
    WYOMING("WY", "Wyoming", 60),
    // US Commonwealths/Territories
    AMERICAN_SAMOA("AS", "American Samoa", 61),
    MICRONESIA("FM", "Federated States of Micronesia", 62),
    GUAM("GU", "Guam", 63),
    MARSHALL_ISLANDS("MH", "Marshall Island", 64),
    MARIANA("MP", "Northern Mariana Islands", 65),
    PALAU("PW", "Palau", 66),
    PUERTO_RICO("PR", "Puerto Rico", 67),
    VIRGIN_ISLANDS("VI", "Virgin Islands", 68);

    /**
     * The abbreviation for the state, commonwealth or territory
     */
    private String abbreviation;
    /**
     * The name of the state, commonwealth or territory
     */
    private String name;
    /**
     * An ordinal used for identifying the state, commonwealth or territory as a numeric portion of a customer account
     * number
     */
    private int ordinal;

    private State(String abbreviation, String name, int ordinal) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.ordinal = ordinal;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String toString() {
        return abbreviation;
    }
}
