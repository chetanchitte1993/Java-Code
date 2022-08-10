package com.chetan.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.chetan.entity.Contact;
import com.chetan.service.ContactService;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{

	//fake list of contacts
	
	List<Contact> list = List.of(
				new Contact(1L, "chetan@gmail.com","Chetan",1311L),
				new Contact(2L, "rajesh@gmail.com","Kumar",1231L),
				new Contact(3L, "rohit@gmail.com","Bhamre",1122L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return list.stream().filter(contact-> contact.getUserId().equals(userId)).collect(Collectors.toList());
		
	}

	
}
