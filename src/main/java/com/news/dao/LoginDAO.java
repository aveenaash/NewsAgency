package com.news.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.news.entities.UserLogin;

@Repository
public class LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@SuppressWarnings("unchecked")
	@Transactional(readOnly=false)
	public List<UserLogin> getAllUSer()
	{
		List<UserLogin> usersss = new ArrayList<UserLogin>();
		 
		usersss = sessionFactory.getCurrentSession()
				.createSQLQuery("select * from userlogin")
				.addEntity(UserLogin.class)
				.list();		
		return usersss;
	}
}
