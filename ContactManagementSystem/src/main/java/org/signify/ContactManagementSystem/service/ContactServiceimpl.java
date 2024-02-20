package org.signify.ContactManagementSystem.service;

import org.signify.ContactManagementSystem.entity.Contact;
import org.signify.ContactManagementSystem.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceimpl implements ContactService{
    @Autowired
    ContactRepository contactRepository;
    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact getContactsbyId(Long id) {
        return contactRepository.findById(id).get();
    }

    @Override
    public Contact updateContacts(Long id, Contact contact) {
        if (contactRepository.existsById(id)){
            contact.setId(id);
            return contactRepository.save(contact);
        }
        return null;
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById((id));
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }


}
