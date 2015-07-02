package com.news.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="profileSubscriber")
public class SubscriberProfile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="subscriberProfileId", nullable=false)
	private long id;
	
	@Column(name="firstname")
	private String firstname;
	
	private String lastname;
	
	private String subscriberEmail;
	
	private String subscriberAddress;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loginId")
	private UserLogin userlogin;


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getSubscriberEmail() {
		return subscriberEmail;
	}


	public void setSubscriberEmail(String subscriberEmail) {
		this.subscriberEmail = subscriberEmail;
	}


	public String getSubscriberAddress() {
		return subscriberAddress;
	}


	public void setSubscriberAddress(String subscriberAddress) {
		this.subscriberAddress = subscriberAddress;
	}


	public UserLogin getUserlogin() {
		return userlogin;
	}


	public void setUserlogin(UserLogin userlogin) {
		this.userlogin = userlogin;
	}
	
	
	
}
