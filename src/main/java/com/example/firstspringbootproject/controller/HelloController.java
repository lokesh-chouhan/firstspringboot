package com.example.firstspringbootproject.controller;
import com.example.firstspringbootproject.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sayhello")
    Message helloWolrd(){
        return new Message("Hello World");
    }

}
