package org.maxwell.spring.didemo;

import org.maxwell.spring.didemo.controller.ConstructorInjectedController;
import org.maxwell.spring.didemo.controller.DummyConstructorInjectedController;
import org.maxwell.spring.didemo.controller.MyController;
import org.maxwell.spring.didemo.examplebeans.DefaultDataSource;
import org.maxwell.spring.didemo.examplebeans.FakeDataSource;
import org.maxwell.spring.didemo.examplebeans.FakeJMSDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println("### USERNAME ##" + fakeDataSource.getUserName());
		FakeJMSDataSource fakeJMSDataSource = (FakeJMSDataSource) ctx.getBean(FakeJMSDataSource.class);
		System.out.println("### JMS USERNAME ##" + fakeJMSDataSource.getJmsUserName());
		DefaultDataSource dataSource = (DefaultDataSource) ctx.getBean(DefaultDataSource.class);
		System.out.println("### Default USERNAME ##" + dataSource.getUserName());

		System.out.println(controller.sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(DummyConstructorInjectedController.class).sayHello());

	}

}
