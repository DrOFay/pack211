package com.pack211.contact;

import com.pack211.Model;

import java.util.regex.Pattern;

/**
 * Represents a US Zip Code.
 * <p/>
 * There are two modes for an instance of <code>ZipCode</code>: <b>strict</b> and <b>non-strict</b>.  In strict mode,
 * the zip code that is specified must match the <code>REGEX</code>; otherwise an <code>IllegalArgumentException</code>
 * will be thrown.  In non-strict mode, the value passed into the constructor will always be valid.
 * <p/>
 * In either mode, passing in a <code>NULL</code> will always generate a <code>NullPointerException</code>.
 * <p/>
 * NOTE: This implementation does not compare the zip code against any known set of valid zip codes.  It simply ensures
 * that the value that is passed in matches the pattern for a valid zip code (when in strict mode)¡¡.
 *
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0.0.1
 */
public class ZipCode implements Model {
    /**
     * The value of the zip code for this instance.
     *
     * @since 0.0.1
     */
    private String zipCode;
    /**
     * The strict mode flag which defaults to <code>true</code>.
     *
     * @since 0.0.1
     */
    private boolean strictMode = true;

    /**
     * Hidden Constructor since a null zip code throws an exception.
     *
     * @since 0.0.1
     */
    private ZipCode() {
    }

    /**
     * Constructor that sets the zip code and uses the default value for <var>strictMode</var>.
     *
     * @param zipCode the zip code value for this instance
     * @since 0.0.1
     */
    public ZipCode(String zipCode) {
        this(zipCode, true);
    }

    /**
     * Constructor that sets the zip code and strict mode flag.
     *
     * @param zipCode    the zip code value for this instance
     * @param strictMode the flag to indicate whether or not strict mode is used
     * @since 0.0.1
     */
    public ZipCode(String zipCode, boolean strictMode) {
        this.strictMode = strictMode;
        this.zipCode = validate(zipCode);
    }

    /**
     * @return the zip code for this instance
     * @since 0.0.1
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Validates that the <var>zipCode</var> is not <code>NULL</code> and that the zip code is valid (all values are
     * valid if <var>strictMode</var> is <i>false</i>).
     *
     * @param zipCode the zip code to validate
     * @return the zip code that was passed in
     * @throws NullPointerException     if the value was <code>NULL</code>
     * @throws IllegalArgumentException if the value is invalid and <var>strictMode</var> is <i>true</i>
     * @since 0.0.1
     */
    protected String validate(String zipCode) {
        Pattern REGEX = Pattern.compile("^\\d{5}(-\\d{4})?$");

        if (zipCode == null) {
            throw new NullPointerException("Zip Code cannot be null!");
        }

        if (!strictMode || REGEX.matcher(zipCode).matches()) {
            return zipCode;
        }

        throw new IllegalArgumentException("Invalid zip code format specified: " + zipCode);
    }
}
