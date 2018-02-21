package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class User {
	@Id
	private String email;
	@Column(nullable=false)
	private String firstname;
	@Column(nullable=false)
	private String lastname;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String contactnumber;
	private String role;

	@Column(name="online_status")
	private Boolean Online;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public Boolean getOnline() {
		return Online;
	}

	public void setOnline(Boolean online) {
		this.Online = online;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", contactnumber=" + contactnumber + ", role=" + role + ", Online=" + Online + "]";
	}

	
	
	


}
