package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements Contact_Service{

//    fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "Karan", "karan@mail.com",1011L),
            new Contact(2L, "Hari", "hari@mail.com",1011L),
            new Contact(3L, "Carry", "carry@mail.com",1012L),
            new Contact(4L, "Nakul", "nakul@mail.com",1013L),
            new Contact(5L, "Hiren", "hiren@mail.com",1013L),
            new Contact(6L, "Hitesh", "nakul@mail.com",1014L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
