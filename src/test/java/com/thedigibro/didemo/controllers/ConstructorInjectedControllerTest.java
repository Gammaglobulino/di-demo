package com.thedigibro.didemo.controllers;

import com.thedigibro.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_FOLKS,constructorInjectedController.sayHello());
    }
}