package me.greet.greet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("greet/john")
    Afternoon greet() {
        return new Afternoon("Good afternoon John");
    }
}

class Afternoon {
    private final String greet;

    Afternoon(String greet) {
        this.greet = greet;
    }

    public String getGreet() {
        return greet;
    }
}
