package com.example.jenkinsdemo.controller.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController
{
    @GetMapping
    public String greeting()
    {
        return "Hello there v7 !";
    }

    @GetMapping("/jdk")
    public String getJdk()
    {
        return "version 18";
    }
}
