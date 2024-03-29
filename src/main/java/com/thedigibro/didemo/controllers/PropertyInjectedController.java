package com.thedigibro.didemo.controllers;

import com.thedigibro.didemo.services.GreetingService;
import com.thedigibro.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("constructorGreetingService")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
