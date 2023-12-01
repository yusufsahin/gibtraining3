package tr.gov.gib.sf901datajdbc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.gov.gib.sf901datajdbc.dao.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long> {
}
