package com.vn.vsii.testdatabse.service.impl;

import com.vn.vsii.testdatabse.model.Contact;
import com.vn.vsii.testdatabse.repository.ContactRepository;
import com.vn.vsii.testdatabse.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public Iterable<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    public Contact findById(Integer id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);

    }

    @Override
    public void delete(Integer id) {
        contactRepository.deleteById(id);

    }


}
