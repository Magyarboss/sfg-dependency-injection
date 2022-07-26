package guru.springframework.sfgdependencyinjection;

import guru.springframework.sfgdependencyinjection.controllers.ConstructorInjectedController;
import guru.springframework.sfgdependencyinjection.controllers.MyController;
import guru.springframework.sfgdependencyinjection.controllers.PropertyInjectionController;
import guru.springframework.sfgdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(SfgDependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");


		System.out.println("---------Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-----------PropertyInjected-based");

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");

		// without Spring
		//propertyInjectionController.greetingService = new GreetingServiceImpl();

		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("-------------SetterInjected-based");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		// without Spring
		//setterInjectedController.setGreetingService(new GreetingServiceImpl());

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------ConstructorInjected---based");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

	}


}
