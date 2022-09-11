package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.service.Contact_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class Contact_controller {

    @Autowired
    private Contact_Service contact_service;

    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        return this.contact_service.getContactsOfUser(userId);
    }


}
