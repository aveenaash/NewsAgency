package com.news.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.news.entities.AgencyProfile;
import com.news.entities.SubscriberProfile;

@Repository
public class SignupDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly=false)
	public void saveAgencyProfile(AgencyProfile agencyProfile)
	{
		Session session=sessionFactory.getCurrentSession();
		session.persist(agencyProfile);
	}
	
	@Transactional(readOnly=false)
	public void saveSubscriberProfile(SubscriberProfile subscriberProfile)
	{
		Session session=sessionFactory.getCurrentSession();
		session.persist(subscriberProfile);
	}
	
	
}
