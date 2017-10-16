package com.vortexnepal.ghyampo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : Vortex Inc. Nepal
 * -- email fields acts as email for Customer but as a username for Admin
 * -- email is parent key to customer table which is yet to be made.
 * -- email is also parent key to user_roles table.
 **/
/*
 * TODO:
 * -- Hibenate validator insert message parameter
 * -- Create child @Entity Customer with foreign key email
 * -- Status: Incomplete
 */
@Entity
@Table(name="users")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="email")
	@NotEmpty
	private String email;
	@Column(name="password")
	@NotEmpty
	private String password;
	@Column(name="enabled")
	private boolean enabled;
		
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="user")
	private UserRoles userRoles;
	
	public User(){}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserRoles getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(UserRoles userRoles) {
		this.userRoles = userRoles;
	}
	
}
