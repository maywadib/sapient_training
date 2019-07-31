package training.sapient.spring01;

public interface IHelloService {

	//the value for this is injected from xml file
	public String sayHello();
	public String sayHello(String name, String city);
	
	
}
