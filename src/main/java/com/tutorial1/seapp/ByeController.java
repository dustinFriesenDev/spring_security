package com.tutorial1.seapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye everyone !";
    }
}
