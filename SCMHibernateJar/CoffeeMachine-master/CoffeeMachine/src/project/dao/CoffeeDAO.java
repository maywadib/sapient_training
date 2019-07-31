package project.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import project.beans.Coffee;
import project.beans.Logs;
import project.standards.ICoffeeDAO;
import project.util.HibernateUtil;

public class CoffeeDAO implements ICoffeeDAO {

	@Override
	public boolean insertCoffee(Coffee coffee) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(coffee);
		
		transaction.commit();
		
		session.close();
		
		return true;
		
	}

	@Override
	public Coffee getCoffeeType(int coffeeId) {


		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Coffee coffee = session.get(Coffee.class, coffeeId);
		
		return coffee;
	}

	@Override
	public Coffee getPopularCoffee() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Integer> query = criteriaBuilder.createQuery(Integer.class);

		Root<Logs> root = query.from(Logs.class);

		query.select(root.get("coffeeId")).groupBy(root.get("coffeeId")).orderBy(criteriaBuilder.desc(criteriaBuilder.count(root.get("empId"))));
		
		List<Integer> result = session.createQuery(query).getResultList();
		return getCoffeeType(result.get(0));
		
	}

	@Override
	public Coffee getFavoriteCoffee(String employeeId) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

		CriteriaQuery<Integer> query = criteriaBuilder.createQuery(Integer.class);

		Root<Logs> root = query.from(Logs.class);
		
		Predicate employeeIdPredicate = criteriaBuilder.equal(root.get("empId"), employeeId);

		query.select(root.get("coffeeId")).where(employeeIdPredicate).groupBy(root.get("coffeeId")).orderBy(criteriaBuilder.desc(criteriaBuilder.count(root.get("empId"))));
		
		List<Integer> result = session.createQuery(query).getResultList();
		
		return getCoffeeType(result.get(0));
		
	}

}
