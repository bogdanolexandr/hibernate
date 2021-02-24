package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.User;
import util.HibernateUtil;

public class UserDao {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	public void addUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	
	public List<User> getAllUsers(){
		Session session = sessionFactory.openSession();
		List<User> users = session.createQuery("from User",User.class).getResultList();
		session.close();
		return users;
	}
	

}
