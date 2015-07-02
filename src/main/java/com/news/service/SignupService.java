package com.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.SignupDAO;
import com.news.entities.AgencyProfile;
import com.news.entities.SubscriberProfile;

@Service
public class SignupService {

	@Autowired
	private SignupDAO signupDAO;

	public SignupDAO getSignupDAO() {
		return signupDAO;
	}

	public void setSignupDAO(SignupDAO signupDAO) {
		this.signupDAO = signupDAO;
	}
	
	public void saveAgencyProfile(AgencyProfile agencyProfile)
	{
		agencyProfile.getUserlogin().setLogintype("Agency");
		signupDAO.saveAgencyProfile(agencyProfile);
	}
	
	public void saveSubscriberProfile(SubscriberProfile subscriberProfile)
	{
		subscriberProfile.getUserlogin().setLogintype("Subscriber");
		signupDAO.saveSubscriberProfile(subscriberProfile);
	}
}
