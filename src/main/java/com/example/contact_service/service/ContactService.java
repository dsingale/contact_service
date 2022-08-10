package com.example.contact_service.service;

import com.example.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ContactService
{
    public List<Contact> getContactsOfUser(Long userId);
}
