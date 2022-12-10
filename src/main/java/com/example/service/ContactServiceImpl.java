package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Contact;
@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list=new ArrayList();
	
	
	
	public ContactServiceImpl() {
		list.add(new Contact(1,"Raja", "raja@gmail.com", 1234l));
		list.add(new Contact(2,"Ram", "ram@gmail.com", 9080l));
	}



	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return this.list;
	}



	@Override
	public Contact getContact(Integer contactId) {
		Contact contact=null;
		for (Contact c:list) {
			if(c.getContactId()==contactId) {
				contact=c;
				break;
			}
		}
		return contact;
	}



	@Override
	public Contact addContact(Contact contact) {
		list.add(contact);
		return contact;
	}



	@Override
	public Contact updateContact(Contact contact) {
		list.forEach(e->{
			if(e.getContactId()==contact.getContactId()) {
				e.setContactName(contact.getContactName());
				e.setContactEmail(contact.getContactEmail());
				e.setPhno(contact.getPhno());
			}
		});
		return contact;
	}

	
}
