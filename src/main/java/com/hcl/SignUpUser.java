package com.hcl;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")

public class SignUpUser {
	@Id
	@Column(name="email")
	private String email;
	@Column(name="password")
	private int password;
	@Column(name="password2")
	private int password2;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getPassword2() {
		return password2;
	}
	public void setPassword2(int password2) {
		this.password2 = password2;
	}
	
	

}
