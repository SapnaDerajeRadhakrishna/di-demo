package org.maxwell.spring.didemo;

import org.maxwell.spring.didemo.controller.ConstructorInjectedController;
import org.maxwell.spring.didemo.controller.DummyConstructorInjectedController;
import org.maxwell.spring.didemo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(DummyConstructorInjectedController.class).sayHello());
	}

}
