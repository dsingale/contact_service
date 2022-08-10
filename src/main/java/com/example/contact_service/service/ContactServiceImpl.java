package com.example.contact_service.service;

import com.example.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService {

    List<Contact>list=List.of(
            new Contact(1L,"devendra@gmail.com","Devendra",1233L),
            new Contact(2L,"satish@gmail.com","Satish",1235L),
            new Contact(3L,"shobha@gmail.com","Shobha",1263L),
            new Contact(6L,"pooja1@gmail.com","pooja1",1234L),
            new Contact(7L,"pooja2@gmail.com","pooja2",1234L),
            new Contact(8L,"pooja3@gmail.com","pooja3",1234L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserid().equals(userId)).collect(Collectors.toList());
    }
}
