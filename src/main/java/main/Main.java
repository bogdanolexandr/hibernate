package main;

import dao.UserDao;
import entity.User;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		UserDao userDao = new UserDao();
		
		User user = new User();
		user.setName("User 1");
		
		userDao.addUser(user);
		
		System.out.println(userDao.getAllUsers());
		HibernateUtil.shutdown();
		
	}

}
