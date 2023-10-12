package com.quiz.ServiceImp;

import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entities.User;
import com.quiz.entities.UserRole;
import com.quiz.repository.RoleRepository;
import com.quiz.repository.UserRepository;
import com.quiz.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override 
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
	
		User local=this.userRepository.findByUserName(user.getUserName());
		if(local!=null) {
			System.out.println("User is already there!!");
			throw new Exception("User already exsist!!");
			
		}else {
			//user create
			
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local=this.userRepository.save(user);
		}
		
		return local;
	}

	@Override
	public User getUser(String userName) {
		 //TODO Auto-generated method stub
		return this.userRepository.findByUserName(userName);
	}

	//@Override
	//public void deleteUser(int id) {
		// TODO Auto-generated method stub
		//this.userRepository.deleteById(id);
	//}

	
}
