package tr.gov.gib.sf301integrationtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tr.gov.gib.sf301integrationtest.dao.ContactRepository;
import tr.gov.gib.sf301integrationtest.dao.impl.ContactRepositoryImpl;
import tr.gov.gib.sf301integrationtest.dao.model.Contact;
import static org.assertj.core.api.Assertions.assertThat;
public class ContactIntegrationTest {
        private ContactRepository contactRepository;
        @BeforeEach
        public void setUp()
        {
            contactRepository= new ContactRepositoryImpl();
        }

        @Test
        public  void testSaveAndRetrieveContact()
        {
            Contact contact=new Contact(null,"John","Doe","123-456-7890");
            Contact savedContact= contactRepository.save(contact);

            assertThat(savedContact.getId()).isNotNull();
            assertThat(contactRepository.findById(savedContact.getId())).isPresent();
            assertThat(contactRepository.findByFirstName("John")).isPresent();

        }
}
