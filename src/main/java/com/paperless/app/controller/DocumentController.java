package com.paperless.app.controller;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.paperless.app.service.DocumentService;

@Controller
public class DocumentController {

	
	private static final String UPLOAD_DIRECTORY ="./document/";  
	private static final int THRESHOLD_SIZE     = 1024 * 1024 * 30;  // 30MB
	
		@Autowired
		private DocumentService documentService;
	
	@RequestMapping(value="/dosavedocument", method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView saveDocument(@RequestParam("document")  MultipartFile document, @RequestParam String recipient_name, 
			@RequestParam String recipient_email, @RequestParam String email_subject, 
			@RequestParam String email_message) throws Exception{
		
		File convertFile = new File(UPLOAD_DIRECTORY+document.getOriginalFilename());
		convertFile.createNewFile();
		
		FileOutputStream fout = new FileOutputStream(convertFile);
		fout.write(document.getBytes());
		fout.close();
		System.out.println(convertFile.length());
		
		ModelAndView modelAndView=new ModelAndView("senddocumentsuccess");
		
		return modelAndView;
	}
}
