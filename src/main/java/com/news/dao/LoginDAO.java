package com.news.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
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
		 Session session= sessionFactory.getCurrentSession();
		 SQLQuery query=session.createSQLQuery("select * from userlogin");
		 query.addEntity(UserLogin.class);
		 usersss =query.list();		
		 
		 return usersss;
	}
	
	@Transactional(readOnly=false)
	public UserLogin getAllUSerByName(String name)
	{		 
		 Session session= sessionFactory.getCurrentSession();
		 Query query=session.createQuery("from UserLogin where loginname = :username");
		 query.setParameter("username", name);
		 UserLogin user =(UserLogin)query.list().get(0);
		 return user;
	}
	
}
