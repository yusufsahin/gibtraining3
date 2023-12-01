package tr.gov.gib.sf903datajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.gov.gib.sf903datajpa.dao.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {
}
