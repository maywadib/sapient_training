package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import project.beans.Employee;
import project.standards.IEmployeeDAO;
import project.util.HibernateUtil;

public class EmployeeDAO implements IEmployeeDAO{

	@Override
	public boolean insertEmployee(Employee employee) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		
		session.close();
		
		return true;
	}

	@Override
	public Employee getEmployee(String empId) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Employee employee = session.get(Employee.class, empId);
		
		//System.out.println(coffee);
		return employee;
	}

	

	
	
}
