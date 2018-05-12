package com.paperless.app.object;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int document_id;
	private int user_id=1;
	private File document;
	private String recipient_name;
	private String recipient_email;
	private String email_subject;
	private String email_message;
	
	public Document() {
		
	}

	public Document(int document_id, File document, String recipient_name, String recipient_email, String email_subject,
			String email_message) {
		this.document_id = document_id;
		this.document = document;
		this.recipient_name = recipient_name;
		this.recipient_email = recipient_email;
		this.email_subject = email_subject;
		this.email_message = email_message;
	}

	public Document(File document, String recipient_name, String recipient_email, String email_subject,
			String email_message) {
		super();
		this.document = document;
		this.recipient_name = recipient_name;
		this.recipient_email = recipient_email;
		this.email_subject = email_subject;
		this.email_message = email_message;
	}

	public int getDocument_id() {
		return document_id;
	}

	public void setDocument_id(int document_id) {
		this.document_id = document_id;
	}

	public File getDocument() {
		return document;
	}

	public void setDocument(File document) {
		this.document = document;
	}

	public String getRecipient_name() {
		return recipient_name;
	}

	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}

	public String getRecipient_email() {
		return recipient_email;
	}

	public void setRecipient_email(String recipient_email) {
		this.recipient_email = recipient_email;
	}

	public String getEmail_subject() {
		return email_subject;
	}

	public void setEmail_subject(String email_subject) {
		this.email_subject = email_subject;
	}

	public String getEmail_message() {
		return email_message;
	}

	public void setEmail_message(String email_message) {
		this.email_message = email_message;
	}
	
	
}
