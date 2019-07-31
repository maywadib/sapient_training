package trining.sapient.works;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.sapient.beans.Person;
import training.sapient.util.HibernateUtil;

public class P01_InsertPersonData {

	public static void main(String[] args) throws ParseException {

		Person p = new Person();
		
		p.setId(104);
		p.setName("Kartik");
		p.setHeight(5.10);
		p.setAge(23);
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		p.setBirthDate(sdf.parse("20-04-2010"));
		
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		//create a new session
		//which represents the db connection  and which
		//can help to do the CRUD operations
		
		
		Session session = sessionFactory.openSession();
		
		//perform CRUD operations
		//1. begin transaction
		
		Transaction transaction = session.beginTransaction();
		
		// insert/update/delete
		
		session.save(p);
		
		////to save to db
		
		transaction.commit();
		
		session.close();
		
		
		
		System.out.println("data saved successfully");
		
		
	}

}
