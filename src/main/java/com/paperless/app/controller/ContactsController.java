package com.paperless.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.paperless.app.object.Contacts;
import com.paperless.app.service.ContactsService;

@Controller
public class ContactsController {
	
	@Autowired
	private ContactsService contactsService;

	@RequestMapping("/contacts")
	public ModelAndView showContacts(){
		List<Contacts> AllContacts=contactsService.showAllContacts();
		
		ModelAndView modelAndViewContacts = new ModelAndView("contacts");
		modelAndViewContacts.addObject("Allcontacts", AllContacts);
		return modelAndViewContacts;
	}
	
	@RequestMapping(value="/dosavecontacts",method=RequestMethod.POST)
	public ModelAndView saveContacts(@RequestParam String contacts_name, @RequestParam String contacts_email){
		System.out.println(contacts_email+" "+contacts_name);
		
		Contacts newcontacts=new Contacts(contacts_name, contacts_email);
		contactsService.saveContacts(newcontacts);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/contacts");
	    
		return modelAndView;
	}
	
	
}
