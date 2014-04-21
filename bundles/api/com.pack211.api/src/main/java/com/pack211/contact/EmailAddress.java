package com.pack211.contact;

import com.pack211.Model;

/**
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0
 */
public class EmailAddress implements Model {
    private String emailAddress;
    private boolean strictMode;

    private EmailAddress() {
    }

    public EmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public EmailAddress(String emailAddress, boolean strictMode) {
        this.emailAddress = emailAddress;
        this.strictMode = strictMode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    protected String validate(String emailAddress) {
        String REGEX = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$\n";

        if (emailAddress == null) {
            throw new NullPointerException("Email Address cannot be null!");
        }

        if (!strictMode || emailAddress.matches(REGEX)) {
            return emailAddress;
        }

        throw new IllegalArgumentException("Invalid email address format specified: " + emailAddress);
    }
}
