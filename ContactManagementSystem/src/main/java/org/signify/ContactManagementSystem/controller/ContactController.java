package org.signify.ContactManagementSystem.controller;

import org.signify.ContactManagementSystem.aspect.LoggingAspect;
import org.signify.ContactManagementSystem.entity.Contact;
import org.signify.ContactManagementSystem.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/contacts")
    public Contact saveContacts(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }
    @GetMapping("/{id}")
    public Contact getContactsById(@PathVariable("id") Long id){
        return contactService.getContactsbyId(id);
    }

    @PutMapping("/{id}")
    public Contact updateContacts(@PathVariable("id") Long id, @RequestBody Contact contact){
        return contactService.updateContacts(id,contact);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable("id") Long id){
        contactService.deleteContact(id);
    }

    @GetMapping("/contacts/")
    public List<Contact> getAllContacts(){
        return contactService.getAllContacts();
    }
}
