package com.vn.vsii.testdatabse.service;

import com.vn.vsii.testdatabse.model.Contact;

public interface ContactService {
    Iterable<Contact>findAll();
    Contact findById(Integer id);
    void save(Contact contact);
    void delete(Integer id);

}
