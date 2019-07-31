package training.sapient.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IGreetings greet = (IGreetings) context.getBean("english");
		
		System.out.println(greet.sayHello());

		IGreetings greet1 = context.getBean("french", GreetFrench.class);
		
		System.out.println(greet1.sayHello());
	}
}
