package com.news.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.news.entities.UserLogin;
import com.news.service.LoginService;

@RestController
public class RestApiController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/rest/users", method=RequestMethod.GET , produces = "application/json")	
	public @ResponseBody List<UserLogin> getAllUSerUsingREST()
	{
		return loginService.getAllUSerLoginInformation();
		
	}
}