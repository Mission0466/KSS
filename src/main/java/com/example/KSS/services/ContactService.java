package com.example.KSS.services;

import com.example.KSS.models.Contact;
import com.example.KSS.repositories.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void contactCustomerDetails(String firstName, String lastName, String email, String phoneNumber) {
        Contact c = new Contact();
        c.setFirstName(firstName);
        c.setEmail(email);
        c.setLastName(lastName);
        c.setPhoneNumber(phoneNumber);

        contactRepository.save(c);
        
    }
}

