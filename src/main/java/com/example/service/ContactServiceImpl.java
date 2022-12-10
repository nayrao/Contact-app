package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Contact;
import com.example.repo.ContactRepository;
public class ContactServiceImpl implements ContactService{
	
	@Autowired
    private ContactRepository repository;

	@Override 
	public String addContact(Contact contact) {
		Contact save = repository.save(contact);
		if(save.getContactId()!=null) {
			return "Contact is saved";
		}
		return "Contact is failed to save";
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return repository.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repository.findById(contactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		
	 if(repository.existsById(contact.getContactId())) {
		 repository.save(contact);
		 
		 return "Contacted is updated successfully...";
		 
	 }
		return "Record is not found!...";
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repository.existsById(contactId)) {
			repository.deleteById(contactId);
			return "Record is deleted...";
		}
		return "No Record is found....";
	}

	

}
