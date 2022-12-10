package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Contact;

@Service
public interface ContactService {
	
	
	public String addContact(Contact contact);
	
	public List<Contact> getAllContacts();

	public Contact getContactById(Integer contactId);

	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer contactId);
	
}
