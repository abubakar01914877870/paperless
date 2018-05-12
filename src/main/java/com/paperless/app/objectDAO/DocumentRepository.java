package com.paperless.app.objectDAO;

import org.springframework.data.repository.CrudRepository;

import com.paperless.app.object.Document;

public interface DocumentRepository extends CrudRepository<Document, Integer> {

}
