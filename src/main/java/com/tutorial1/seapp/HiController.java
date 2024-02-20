package com.tutorial1.seapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("/hi")
    public String sayHi() {
        return "Hi everyone !";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello everyone !";
    }
}
