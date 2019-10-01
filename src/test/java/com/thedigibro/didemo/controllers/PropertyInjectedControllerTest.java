package com.thedigibro.didemo.controllers;

import com.thedigibro.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;
    @Before
    public void setUp(){
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingService=new GreetingServiceImpl();
    }
    @Test
    public void testGreting(){
        assertEquals(GreetingServiceImpl.HELLO_FOLKS,propertyInjectedController.sayHello());
    }

}