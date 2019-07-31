package project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import project.beans.Logs;
import project.standards.IlogsDAO;
import project.util.HibernateUtil;


public class LogsDAO implements IlogsDAO{

	@Override
	public boolean insertLog(String empId, int coffeeId) {
	
		Logs log = new Logs(empId,coffeeId); 
			
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(log);
		
		transaction.commit();
		
		session.close();
		
		return true;
	
	}	
}
