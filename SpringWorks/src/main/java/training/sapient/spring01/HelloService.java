package training.sapient.spring01;

public class HelloService implements IHelloService{

	
	private String name;
	private String city;
	
	public String sayHello() {
		
		
		return this.sayHello(name, city);
	}
	
	public String sayHello(String name, String city) {

		String myString [] = {
				"Hey Mr : %s, how is your city %s",
				"Good morning  %s, heard you are in city %s",
				"Mr. %s, Your city %s is beautiful"
		};
		
		
		int randomNumber = (int)(Math.random() *3);
		
		
		
		return String.format(myString[randomNumber].toString(), name, city);
	}

	
	public HelloService() {
		System.out.println("Constructor created..from helloservice");
	}
	
	@Override
	public String toString() {
		return "HelloService [name=" + name + ", city=" + city + "]";
	}

	public HelloService(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	
}
