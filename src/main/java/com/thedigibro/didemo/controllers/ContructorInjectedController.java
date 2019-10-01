package com.thedigibro.didemo.controllers;

import com.thedigibro.didemo.services.GreetingService;

public class ContructorInjectedController {

    private GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService=greetingService;
    }
    String sayHello(){
        return greetingService.sayGreeting();
    }
}
