package com.searchiq.influencers.crawler.api.model;

import java.io.Serializable;

import com.restfb.Facebook;

public class FaceBookUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Facebook("first_name")
	private String firstName;

	@Facebook("last_name")
	private String lastName;

	@Facebook("name")
	private String fullName;

	@Facebook
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
