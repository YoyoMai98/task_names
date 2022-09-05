package com.example.task_names.controller;

import com.example.task_names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public Greeting greeting(@RequestParam(value = "timeOfDay") String timeOfDay){
        return new Greeting("Yongran", timeOfDay);
    }
}
