package com.vn.vsii.testdatabse.repository;

import com.vn.vsii.testdatabse.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact,Integer> {
    List<Contact>findByNameContaining(String term);
}
