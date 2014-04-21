package com.pack211.contact;

import com.pack211.Model;

import java.util.Set;

/**
 * Represents contact information for a contact-able entity.
 *
 * @author <a href="mailto:david@.biz">David Fay</a>
 * @since 0
 */
public class Contact implements Model {
    private Address address;
    private Set<Phone> phoneNumbers;
    private Set<EmailAddress> emailAddresses;
}
