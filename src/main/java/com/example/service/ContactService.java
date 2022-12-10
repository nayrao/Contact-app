package com.example.service;

import java.util.List;

import com.example.model.Contact;


public interface ContactService {
	
	public List<Contact> getAllContacts();

	public Contact getContact(Integer contactId);

	public Contact addContact(Contact contact);

	public Contact updateContact(Contact contact);
	
	
}
