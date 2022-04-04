package com.tns.placementManagementSystem.repository;

import java.util.List;

import com.tns.placementManagementSystem.entities.User;

//Defining a interface IUserRepository
public interface IUserRepository {
	
	
	// Declaring abstract methods
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(long id);
	
	public User findUserById(Long id);
	
	public List<String> login(String userName, String password);
	
    public void beginTrancsaction();
	
	public void commitTransaction();

}
