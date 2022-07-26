package guru.springframework.sfgdependencyinjection.controllers;

import guru.springframework.sfgdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    @Autowired // in ConstructorInjection it is optional to add @Autowired notation we dont need to.
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
