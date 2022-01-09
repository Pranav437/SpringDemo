package co.pragra.learning.springdemo;

import co.pragra.learning.springdemo.model.Car;
import co.pragra.learning.springdemo.model.Peron;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {



		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("car", Car.class));
		System.out.println(context.getBean("person", Peron.class));
		context.registerShutdownHook();
	}

}
