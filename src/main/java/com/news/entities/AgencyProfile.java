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
@Table(name="profile_agency")
public class AgencyProfile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="agencyProfileId", nullable=false)
	private long id;
	
	@Column(name="agencyName")
	private String agencyname;
	
	@Column(name="agencyEmail")
	private String agencyEmail;
	
	@Column(name="agencyAddress")
	private String agencyAddress;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loginId")
	private UserLogin userlogin;


	public String getAgencyname() {
		return agencyname;
	}


	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}


	public String getAgencyEmail() {
		return agencyEmail;
	}


	public void setAgencyEmail(String agencyEmail) {
		this.agencyEmail = agencyEmail;
	}


	public String getAgencyAddress() {
		return agencyAddress;
	}


	public void setAgencyAddress(String agencyAddress) {
		this.agencyAddress = agencyAddress;
	}


	public UserLogin getUserlogin() {
		return userlogin;
	}


	public void setUserlogin(UserLogin userlogin) {
		this.userlogin = userlogin;
	}
	
	
	
}
