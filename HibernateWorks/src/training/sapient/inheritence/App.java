package training.sapient.inheritence;

import org.hibernate.Session;

import training.sapient.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		Product products[] = { new Television(101, "TV", "Some lcd tv", 2000, "LCD", 21, "1024x1024"),
				new Television(102, "TV", "Some led tv", 3000, "LED", 36, "2048x1024"),
				new CellPhone(333, "Mobile", "some mobile", 54545, "Smart", "iOS", "GSM"),
				new CellPhone(37, "Mobile", "some mobile", 65545, "Smart", "Android", "CDMA") };

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		for(Product temp : products) {
			session.save(temp);
		}
		
		
		session.beginTransaction().commit();
		
		System.out.println("data stored ....");
		
	}
}
