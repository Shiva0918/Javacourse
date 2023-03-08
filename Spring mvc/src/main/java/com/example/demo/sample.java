package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class sample {

    @GetMapping("/")
    public String hello() {
        return "Hello World";


    }
}




