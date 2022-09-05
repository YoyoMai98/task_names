package com.example.task_names.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Good afternoon!";
    }
}
