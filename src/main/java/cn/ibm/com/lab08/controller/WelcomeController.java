package cn.ibm.com.lab08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping(value = "/api")
    public String loginPage() {
        return "Hello World!";
    }
}
