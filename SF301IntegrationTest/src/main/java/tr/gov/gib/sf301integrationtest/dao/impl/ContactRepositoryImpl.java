package tr.gov.gib.sf301integrationtest.dao.impl;

import org.springframework.stereotype.Repository;
import tr.gov.gib.sf301integrationtest.dao.ContactRepository;
import tr.gov.gib.sf301integrationtest.dao.model.Contact;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ContactRepositoryImpl implements ContactRepository {
    private Map<Long,Contact> contactDb= new HashMap<>();
    private Long idCounter=1L;
    @Override
    public Contact save(Contact contact) {
        if(contact.getId()==null)
        {
            contact.setId(idCounter++);
        }
        contactDb.put(contact.getId(),contact);
        return contact;
    }

    @Override
    public Optional<Contact> findById(Long id) {
        return Optional.ofNullable(contactDb.get(id));
    }

    @Override
    public Optional<Contact> findByFirstName(String firstName) {
        return contactDb.values().stream()
                .filter(contact -> contact.getFirstName().equals(firstName))
                .findFirst();
    }
}
