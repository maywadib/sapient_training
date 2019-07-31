package training.sapient.spring01;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {
//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("SpringContext.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
		
		
		IHelloService helloService = (IHelloService) context.getBean("hello");
		
		System.out.println(helloService.sayHello());
		
		
		IHelloService helloService1 = (IHelloService) context.getBean("hello");
		
		
		
	}
}
