package tr.gov.gib.sf400hellowebmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/helloworld")
    @ResponseBody
    public String helloWorld()
    {
        return "Hello,Spring Web MVC";
    }
}
