package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Contact;
import com.example.service.ContactService;

@RestController
@RequestMapping("/contact/api")
public class ContactController {
	
	@Qualifier
	private ContactService contactService;
	
	@PostMapping("/save")
	public String saveContact(@RequestBody Contact contact) {
		
		return this.contactService.addContact(contact);
		
	}
	
	@GetMapping("/allContacts")
	public List<Contact> getContants(){
		return contactService.getAllContacts();
		
	}
	@GetMapping("/contacts/{contactId}")
	public Contact getContactById(@PathVariable Integer contactId) {
		return contactService.getContactById(contactId);
		
	}
	@PutMapping("/updateContact")
	public String updateContact(Contact contact) {
		return contactService.updateContact(contact);
		
	}
	
	@DeleteMapping("/contacts/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		return contactService.deleteContactById(contactId);
		
	}
}


	
	
	
