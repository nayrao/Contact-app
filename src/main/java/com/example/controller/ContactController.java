package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Contact;
import com.example.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		return this.contactService.getAllContacts();
		
	}

	@GetMapping("/contacts/{contactId}")
	public Contact getContact(@PathVariable String contactId) {
		
		return this.contactService.getContact(Integer.parseInt(contactId));
		
	}
	@PostMapping("/newContact")
	public Contact saveNewContact(@RequestBody Contact contact) {
		return this.contactService.addContact(contact);
		
	}
}
