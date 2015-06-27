package com.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.LoginDAO;
import com.news.entities.UserLogin;

@Service
public class LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	public List<UserLogin> getAllUSerLoginInformation()
	{
		return loginDAO.getAllUSer();
	}
}
