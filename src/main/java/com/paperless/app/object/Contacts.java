package com.paperless.app.object;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacts {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int contacts_id;
	private String contacts_name;
	private String contacts_email;
	
	
	public Contacts() {
		
	}
	
	public Contacts(int contacts_id, String contacts_name, String contacts_email) {
		this.contacts_id = contacts_id;
		this.contacts_name = contacts_name;
		this.contacts_email = contacts_email;
	}
	
	public Contacts(String contacts_name, String contacts_email) {
		this.contacts_name = contacts_name;
		this.contacts_email = contacts_email;
	}

	public int getContacts_id() {
		return contacts_id;
	}
	public void setContacts_id(int contacts_id) {
		this.contacts_id = contacts_id;
	}
	public String getContacts_name() {
		return contacts_name;
	}
	public void setContacts_name(String contacts_name) {
		this.contacts_name = contacts_name;
	}
	public String getContacts_email() {
		return contacts_email;
	}
	public void setContacts_email(String contacts_email) {
		this.contacts_email = contacts_email;
	}
	
	
}
