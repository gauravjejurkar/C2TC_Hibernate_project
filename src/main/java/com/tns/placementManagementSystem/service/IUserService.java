package com.tns.placementManagementSystem.service;

import java.util.List;

import com.tns.placementManagementSystem.entities.User;

public interface IUserService {
	
	public void addUser(User user);
	
	public User findUserById(Long id);
	
	public void updateUser(User user);
	
	public String login(String user, String password);
	
	public void logOut();

}
