package guru.springframework.sfgdependencyinjection.controllers;

import guru.springframework.sfgdependencyinjection.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();

        controller.greetingService = new ConstructorInjectedGreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}