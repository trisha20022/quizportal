package com.quiz.service;

import java.util.Set;

import com.quiz.entities.User;
import com.quiz.entities.UserRole;

public interface UserService {
	
	public User createUser(User user,Set<UserRole>userRoles) throws Exception;
	
	public User getUser(String userName);
	//public void deleteUser(int id);
}
