package com.pack211.contact;

import com.pack211.Model;

import java.util.regex.Pattern;

/**
 * Represents a Phone Number.
 * <p/>
 * There are two modes for an instance of <code>Phone</code>: <b>strict</b> and <b>non-strict</b>.  In strict mode,
 * the phone that is specified must match the <code>REGEX</code>; otherwise an <code>IllegalArgumentException</code>
 * will be thrown.  In non-strict mode, the value passed into the constructor will always be valid.
 * <p/>
 * In either mode, passing in a <code>NULL</code> will always generate a <code>NullPointerException</code>.
 *
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0.0.1
 */
public class Phone implements Model {
    /**
     * The value of the phone number for this instance.
     *
     * @since 0.0.1
     */
    private String phone;
    /**
     * The value of the phone extension if one is provided
     *
     * @since 0.0.1
     */
    private String extension;
    /**
     * The <code>PhoneType</code> of this instance.
     *
     * @since 0.0.1
     */
    private PhoneType phoneType;
    /**
     * The strict mode flag which defaults to <code>true</code>.
     *
     * @since 0.0.1
     */
    private boolean strictMode = true;
    /**
     * A flag to indicate that the phone number uses an international format as opposed to a domestic format.  Defaults
     * to <code>false</code>.
     *
     * @since 0.0.1
     */
    private boolean isInternational = false;

    /**
     * Hidden Constructor since a null phone number throws an exception.
     *
     * @since 0.0.1
     */
    private Phone() {
    }

    /**
     * Constructor that sets the phone number, leaves the extension as <code>NULL</code> and uses the default values for
     * <var>strictMode</var> and <var>isInternational</var>.
     *
     * @param phone the phone number for this instance
     * @since 0.0.1
     */
    public Phone(String phone) {
        this(phone, PhoneType.MAIN);
    }

    public Phone(String phone, PhoneType phoneType) {
        this(phone, phoneType, true, false);
    }

    /**
     * Constructor that sets all the properties for this instance.
     *
     * @param phone           the phone number for this instance
     * @param strictMode      the flag to indicate whether or not to use strict mode
     * @param isInternational the flag to indicate whether or not the phone number is an international number
     * @since 0.0.1
     */
    public Phone(String phone, PhoneType phoneType, boolean strictMode, boolean isInternational) {
        this(phone, null, phoneType, strictMode, isInternational);
    }

    /**
     * Constructor that sets all the properties for this instance.
     *
     * @param phone           the phone number for this instance
     * @param strictMode      the flag to indicate whether or not to use strict mode
     * @param isInternational the flag to indicate whether or not the phone number is an international number
     * @since 0.0.1
     */
    public Phone(String phone, String extension, PhoneType phoneType, boolean strictMode, boolean isInternational) {
        this.strictMode = strictMode;
        this.isInternational = isInternational;
        this.phone = validate(phone);
        this.extension = extension;
        this.phoneType = phoneType;
    }

    /**
     * @return the phone number for this instance
     * @since 0.0.1
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone number for this instance
     * @since 0.0.1
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the phone extension for this instance
     * @since 0.0.1
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the phone extension for this instance
     * @since 0.0.1
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * @return the type of phone
     * @since 0.0.1
     */
    public PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * @param phoneType the type of phone
     * @since 0.0.1
     */
    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * Validates that the <var>phone</var> is not <code>NULL</code> and that the number is valid (all values are
     * valid if <var>strictMode</var> is <i>false</i>).
     *
     * @param phone the phone number to validate
     * @return the phone number that was passed in
     * @throws NullPointerException     if the value was <code>NULL</code>
     * @throws IllegalArgumentException if the value is invalid and <var>strictMode</var> is <i>true</i>
     * @since 0.0.1
     */
    protected String validate(String phone) {
        Pattern DOMESTIC_REGEX = Pattern.compile("^(?:\\([2-9]\\d{2}\\) ?|[2-9]\\d{2}(?:\\-?| ?|\\.?))[2-9]\\d{2}[- .]?\\d{4}$");
        Pattern INTL_REGEX = Pattern.compile("^\\+(?:[0-9]??){6,14}[0-9]$");

        if (phone == null) {
            throw new NullPointerException("Phone number cannot be null");
        }

        if (isInternational) {
            // @todo until unit tests are implemented for international phones, we should accept any entry
//            if (!strictMode || INTL_REGEX.matcher(phone).matches()) {
            return phone;
//            }
        } else {
            if (!strictMode || DOMESTIC_REGEX.matcher(phone).matches()) {
                return phone;
            }
        }

        throw new IllegalArgumentException("Invalid phone number format specified: " + phone);
    }

    /**
     * An enumeration of types of phones.
     *
     * @since 0.0.1
     */
    public enum PhoneType {
        MAIN,
        HOME,
        HOME_FAX,
        WORK,
        WORK_FAX,
        MOBILE,
        PAGER,
        OTHER
    }
}
