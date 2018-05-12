package com.paperless.app.objectDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paperless.app.object.Contacts;

@Service
public class ContactsRepositoryDAO {

	@Autowired
	private ContactsRepository contactsRepository;
	
	public void saveContacts(Contacts newcontacts) {
		contactsRepository.save(newcontacts);
	}
	
	public List<Contacts> showAllContacts(){
		List<Contacts> AllContacts=new ArrayList<>();
		contactsRepository.findAll().forEach(AllContacts ::add);
		
		return AllContacts;
	}
}
