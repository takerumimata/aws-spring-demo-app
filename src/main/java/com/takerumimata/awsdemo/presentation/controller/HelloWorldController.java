package com.takerumimata.awsdemo.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {
    @GetMapping("/world")
    public String getHelloWorld() {
        return "Hello World!";
    }
}
