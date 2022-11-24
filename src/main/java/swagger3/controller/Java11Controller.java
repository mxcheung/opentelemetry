package swagger3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("java11")
public class Java11Controller {

    @RequestMapping("/")
    public String index() {
        String message = "Greetings from Spring Boot!";
        message = "Greetings from "  + "La ".repeat(2) + "Land";
        return message;
    }

}