package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.User;
import com.insurance.services.UserService;

@RestController
public class UserController
{
@Autowired
private UserService userservice;
@PostMapping("usersave")
public User saveUser(@RequestBody User user) 
{
	User user1=userservice.saveUser(user);
    return user1;
}

@DeleteMapping("/delete/{id}")
public void deleteUser(@PathVariable("id")Integer id)throws Exception 
{
	userservice.deleteUser(id);
}

}
