package com.news.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.news.entities.AgencyProfile;
import com.news.entities.UserLogin;
import com.news.service.SignupService;

@Controller
public class SignUpController {

	@Autowired
	private SignupService signupservice;
	
	@RequestMapping(value = "/agencysignup", method = RequestMethod.GET)
	public String getSignUp(
			@ModelAttribute("agencyProfile") AgencyProfile agencyProfile,
			Model model) {
		return "agencySignup";
	}

	@RequestMapping(value = "/agencysignup", method = RequestMethod.POST)
	public String registerAgency(@ModelAttribute("agencyProfile") AgencyProfile agencyProfile,
			BindingResult bindingResult) {
		signupservice.saveAgencyProfile(agencyProfile);
		//agencyProfile=new AgencyProfile();
		return "home";
	}
}
