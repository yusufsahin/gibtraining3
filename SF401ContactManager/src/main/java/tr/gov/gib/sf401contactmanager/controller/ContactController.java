package tr.gov.gib.sf401contactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.gov.gib.sf401contactmanager.service.impl.ContactServiceImpl;

@Controller
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactServiceImpl contactService;

    @GetMapping("/asstring")
    @ResponseBody
    public  String getContactsAsString()
    {
        return  contactService.getContactsAsString();
    }
}
