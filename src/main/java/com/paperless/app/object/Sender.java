package com.paperless.app.object;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sender {

	@Id
	private int sender_id;
	private String sender_name;
	private String sender_email;
	private String sender_docid;
	
	public Sender() {
		
	}
	
	public Sender(int sender_id, String sender_name, String sender_email, String sender_docid) {
		this.sender_id = sender_id;
		this.sender_name = sender_name;
		this.sender_email = sender_email;
		this.sender_docid = sender_docid;
	}
	public int getSender_id() {
		return sender_id;
	}
	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
	}
	public String getSender_name() {
		return sender_name;
	}
	public void setSender_name(String sender_name) {
		this.sender_name = sender_name;
	}
	public String getSender_email() {
		return sender_email;
	}
	public void setSender_email(String sender_email) {
		this.sender_email = sender_email;
	}
	public String getSender_docid() {
		return sender_docid;
	}
	public void setSender_docid(String sender_docid) {
		this.sender_docid = sender_docid;
	}

	@Override
	public String toString() {
		return "Sender [sender_id=" + sender_id + ", sender_name=" + sender_name + ", sender_email=" + sender_email
				+ ", sender_docid=" + sender_docid + "]";
	}
	
	
	
}
