package com.quiz;

//import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.quiz.entities.Role;
import com.quiz.entities.User;
import com.quiz.entities.UserRole;
import com.quiz.service.UserService;

@SpringBootApplication
@EntityScan("com.quiz.entities")
public class QuizserverApplication implements CommandLineRunner{

//	@Autowired
//	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(QuizserverApplication.class, args);
	
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("starting code");
		

//
//		User user = new User();
//		
//		user.setFirstname("Pritha");
//		user.setLastname("Biswas");
//		user.setUsername("Pritha05");
//		user.setPassword("abc");
//		user.setEmail("abc@gmail.com");
//
//		
//		Role role1 = new Role();
//		role1.setRoleId(44);
//		role1.setRoleName("ADMIN");
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole=new UserRole();
//		
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
		
		
		
		
		
		
	}

}
