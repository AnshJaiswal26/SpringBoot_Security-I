package com.example.SpringBoot_Security_I.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Ansh";
    }
}
