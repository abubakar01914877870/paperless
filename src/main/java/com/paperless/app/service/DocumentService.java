package com.paperless.app.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.paperless.app.object.Document;
import com.paperless.app.objectDAO.DocumentRepositoryDAO;

@Service
public class DocumentService {

	@Autowired
	private DocumentRepositoryDAO documentRepositoryDAO;
	
	public void saveDocument(Document newDocument) {
		documentRepositoryDAO.saveDocument(newDocument);
	}
	
	
}
