package spring.security.playground.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/user")
    public String user() {
        return "you have an access to user page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "you have an access to admin page";
    }

}
