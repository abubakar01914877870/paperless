package com.paperless.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paperless.app.object.Contacts;
import com.paperless.app.objectDAO.ContactsRepositoryDAO;

@Service
public class ContactsService {

	@Autowired
	private ContactsRepositoryDAO contactsRepositoryDAO;
	
	public void saveContacts(Contacts newcontacts) {
		contactsRepositoryDAO.saveContacts(newcontacts);
	}
	
	public List<Contacts> showAllContacts(){
		List<Contacts> AllContacts=contactsRepositoryDAO.showAllContacts();
		
		return AllContacts;
	}
}
