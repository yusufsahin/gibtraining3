package tr.gov.gib.sf401contactmanager.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import tr.gov.gib.sf401contactmanager.dao.ContactRepository;
import tr.gov.gib.sf401contactmanager.dao.model.Contact;


@Component
@Order(1)
public class DataFeed implements CommandLineRunner {

    private  final ContactRepository contactRepository;

    @Autowired
    public DataFeed(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        contactRepository.save(new Contact(1L,"John","Doe","+9054378999"));
        contactRepository.save(new Contact(2L,"Jane","Doe","+9054378978"));
        contactRepository.save(new Contact(3L,"Sue","Doe","+9054378970"));
    }
}
