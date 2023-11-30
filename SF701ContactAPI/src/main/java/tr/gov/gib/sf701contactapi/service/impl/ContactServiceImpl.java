package tr.gov.gib.sf701contactapi.service.impl;

import org.springframework.stereotype.Service;
import tr.gov.gib.sf701contactapi.dao.impl.ContactRepositoryImpl;
import tr.gov.gib.sf701contactapi.dao.model.Contact;
import tr.gov.gib.sf701contactapi.service.ContactService;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepositoryImpl contactRepository;

    public ContactServiceImpl(ContactRepositoryImpl contactRepository) {
        this.contactRepository = contactRepository;
    }


    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.getAll();
    }

    @Override
    public Contact getContactById(int id) {
        return contactRepository.getById(id);
    }

    @Override
    public Contact addContact(Contact contact) {
        return contactRepository.insert(contact);
    }

    @Override
    public Contact updateContact(Contact contact) {
        return contactRepository.update(contact);
    }

    @Override
    public void deleteContact(int id) {
        contactRepository.delete(id);
    }
}
