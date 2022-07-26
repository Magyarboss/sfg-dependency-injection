package guru.springframework.sfgdependencyinjection.controllers;

import guru.springframework.sfgdependencyinjection.services.GreetingService;
import guru.springframework.sfgdependencyinjection.services.PropertyInjectedGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
