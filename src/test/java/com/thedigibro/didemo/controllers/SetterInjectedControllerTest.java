package com.thedigibro.didemo.controllers;

import com.thedigibro.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;
    @Before
    public void setUp() throws Exception {
        this.setterInjectedController= new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_FOLKS,setterInjectedController.sayHello());
    }
}