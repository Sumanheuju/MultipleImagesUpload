package com.vortexnepal.ghyampo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
 * -- UserRoles.class doesn't have getter for User object to prevent from infinite loop while fetching User Entity
 * -- Child Class is annotated with @joinColumn to be fetched from parent class(User) creating foreign key
 * -- user object is responsible for creating and mapping email column in UserRoles.class
 */
@Entity
@Table(name="user_roles")
public class UserRoles {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Long userId;
	@Column(name="role")
	private String role;
	
	@OneToOne
	@JoinColumn(name="email")
	private User user;
	
	public UserRoles(){}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
