package com.news.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	public List<UserLogin> getAllUSer()
	{
		List<UserLogin> users = new ArrayList<UserLogin>();
		 
		users = sessionFactory.getCurrentSession()
			.createQuery("from User")
			.list();		
		return users;
	}
}
