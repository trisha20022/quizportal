package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

	public User findByUserName(String userName);
	public User findByName(String name);
	
}
