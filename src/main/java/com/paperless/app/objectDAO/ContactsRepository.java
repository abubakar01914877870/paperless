package com.paperless.app.objectDAO;

import org.springframework.data.repository.CrudRepository;

import com.paperless.app.object.Contacts;

public interface ContactsRepository extends CrudRepository<Contacts, Integer>{

}
