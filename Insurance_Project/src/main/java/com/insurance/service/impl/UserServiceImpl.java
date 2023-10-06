package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurance.model.User;
import com.insurance.repository.UserRepository;
import com.insurance.services.UserService;
@Service
public class UserServiceImpl  implements UserService 
{

     @Autowired
	 private UserRepository userRepository;

	@Override
	public User saveUser(User user)
	{
	  User users=userRepository.save(user);
		return users;
	}

	@Override
	public void deleteUser(Integer id) {
		
	   userRepository.deleteById(id);
	}
	
}
