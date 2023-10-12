package com.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserRole {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int UserRoleId;
	
	@ManyToOne(fetch= FetchType.EAGER)
	private User user;
	
	@ManyToOne
	private Role role;

	public int getUserRoleId() {
		return UserRoleId;
	}

	public void setUserRoleId(int UserRoleId) {
		this.UserRoleId = UserRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
