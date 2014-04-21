package com.pack211.contact;

import com.pack211.Model;

/**
 * A container class to represent a basic user.  More complex implementations should extend this class.
 *
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0.0.1
 */
public class User implements Model {
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private Contact contactInfo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * A convenience method to get all the user name properties in a single <code>String</code>.
     *
     * @return the full name of the user
     * @since 0.0.1
     */
    public String getFullName() {
        String title = this.title == null ? "" : this.title.trim();
        String firstName = this.firstName == null ? "" : this.firstName.trim();
        String middleName = this.middleName == null ? "" : this.middleName.trim();
        String lastName = this.lastName == null ? "" : this.lastName.trim();
        String suffix = this.suffix == null ? "" : this.suffix.trim();

        return title.concat(firstName).concat(middleName).concat(lastName).concat(suffix);
    }
}
