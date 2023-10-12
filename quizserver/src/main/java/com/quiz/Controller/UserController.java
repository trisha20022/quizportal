package com.quiz.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Role;
import com.quiz.entities.User;
import com.quiz.entities.UserRole;
import com.quiz.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {
	

	@Autowired
	private UserService userService;
	//creating user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception 
	{
		System.out.println(user);		
		Set<UserRole> roles=new HashSet<>();
		
		Role role=new Role();
		role.setRoleId(45);
		role.setRoleName("NORMAL");
		
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		return this.userService.createUser(user,roles);
		
	}
	@GetMapping("/{userName}") 
	public User getUser(@PathVariable("userName")String userName) {
	
		return this.userService.getUser(userName);
	}
	//@DeleteMapping("/{id}")
	//public void deleteUser(@PathVariable("id")int id) {
		//this.userService.deleteUser(id); 
	//}
	
}
