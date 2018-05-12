package com.paperless.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SendDocumentController {
	
	

	@RequestMapping("/senddocument")
	public String showSendDocument() {
		
		return "senddocument";
	}
}
