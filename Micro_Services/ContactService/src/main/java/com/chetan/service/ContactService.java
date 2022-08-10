package com.chetan.service;

import java.util.List;

import com.chetan.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);
	
}
