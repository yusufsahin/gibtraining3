package tr.gov.gib.sf701contactapi.controller;

import org.springframework.web.bind.annotation.*;
import tr.gov.gib.sf701contactapi.dao.model.Contact;
import tr.gov.gib.sf701contactapi.service.impl.ContactServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private  final ContactServiceImpl contactService;


    public ContactController(ContactServiceImpl contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAllContacts()
    {
        return  contactService.getAllContacts();
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable int id)
    {
        return  contactService.getContactById(id);
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact)
    {
        return  contactService.addContact(contact);
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable int id,@RequestBody Contact contact)
    {
        return  contactService.updateContact(contact);
    }

    @PatchMapping("/{id}")
    public Contact partialUpdateContact(@PathVariable int id,@RequestBody Contact contact)
    {
        Contact existingContact= contactService.getContactById(id);

        if (existingContact!=null)
        {
            if (contact.getFirstName() != null) {
                existingContact.setFirstName(contact.getFirstName());
            }
            if (contact.getLastName() != null) {
                existingContact.setLastName(contact.getLastName());
            }
            if (contact.getPhoneNumber() != null) {
                existingContact.setPhoneNumber(contact.getPhoneNumber());
            }
            return contactService.updateContact(existingContact);

        }
        return  null;
    }

    @DeleteMapping("/{id}")
    public  void  deleteContact(@PathVariable int id)
    {
        contactService.deleteContact(id);
    }
}
