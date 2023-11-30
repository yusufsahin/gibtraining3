package tr.gov.gib.sf701contactapi.service;

import tr.gov.gib.sf701contactapi.dao.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    Contact getContactById(int id);
    Contact addContact(Contact contact);
    Contact updateContact(Contact contact);
    void deleteContact(int id);
}
