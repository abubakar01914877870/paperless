package com.paperless.app.objectDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paperless.app.object.Document;

@Service
public class DocumentRepositoryDAO {

	@Autowired
	public DocumentRepository documentRepository;
	
	
	public void saveDocument(Document newDocument) {
		documentRepository.save(newDocument);
	}
	
}
