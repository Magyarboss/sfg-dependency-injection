package guru.springframework.sfgdependencyinjection.controllers;

import guru.springframework.sfgdependencyinjection.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingServiceImpl());


    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}