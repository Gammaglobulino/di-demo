package com.thedigibro.didemo.controllers;

import com.thedigibro.didemo.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    String sayHello(){
        return greetingService.sayGreeting();
    }
}
