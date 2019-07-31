package training.sapient.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");//,"screen.xml","speaker.xml","camera.xml");
		
		
		Mobile mobile = context.getBean("mobile", Mobile.class);
		
		System.out.println(mobile.getCamera());
		System.out.println(mobile.getSpeaker());
		System.out.println(mobile.getScreen());
	}
}
