package org.signify.ContactManagementSystem.service;

import org.signify.ContactManagementSystem.entity.Contact;

import java.util.List;

public interface ContactService {
    Contact saveContact(Contact contact);

    Contact getContactsbyId(Long id);

    Contact updateContacts(Long id, Contact contact);

    void deleteContact(Long id);
    List<Contact> getAllContacts();
}
