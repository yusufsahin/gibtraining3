package tr.gov.gib.sf500thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.gov.gib.sf500thymeleaf.dao.model.Note;
import tr.gov.gib.sf500thymeleaf.service.impl.NoteServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/notes")
public class NoteController {

   @Autowired
   private NoteServiceImpl noteService;

   @GetMapping
    public String listNotes(Model model)
   {
       List<Note> notes= noteService.getAllNotes();
       model.addAttribute("notes",notes);
       return "notes";
   }
}
