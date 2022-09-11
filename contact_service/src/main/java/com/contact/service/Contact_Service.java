package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface Contact_Service {

    public List<Contact> getContactsOfUser(Long userId);

}
