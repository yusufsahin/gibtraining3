package tr.gov.gib.sf800basicformsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public  String getLoginPage(){
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError() {
        return "login-error";
    }
}
