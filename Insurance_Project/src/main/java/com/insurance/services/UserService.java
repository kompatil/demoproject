package com.insurance.services;

import com.insurance.model.User;

public interface UserService 
{
	public User saveUser(User user);
	public void deleteUser(Integer id);



}
