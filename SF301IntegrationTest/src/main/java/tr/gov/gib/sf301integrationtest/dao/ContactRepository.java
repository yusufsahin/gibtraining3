package tr.gov.gib.sf301integrationtest.dao;

import tr.gov.gib.sf301integrationtest.dao.model.Contact;

import java.util.Optional;

public interface ContactRepository {
    Contact save(Contact contact);
    Optional<Contact> findById(Long id);
    Optional<Contact> findByFirstName(String firstName);
}
