package com.tns.placementManagementSystem.service;

import java.util.List;

import com.tns.placementManagementSystem.entities.User;
import com.tns.placementManagementSystem.repository.IUserRepository;
import com.tns.placementManagementSystem.repository.UserRepositoryImp;

public class UserServiceImp implements IUserService {

	private IUserRepository dao;
	
	public UserServiceImp() {
		dao = new UserRepositoryImp();
	}

	@Override
	public void addUser(User user) {
		dao.beginTrancsaction();
		dao.addUser(user);
		dao.commitTransaction();
		
	}

	@Override
	public void updateUser(User user) {
		dao.beginTrancsaction();
		dao.updateUser(user);
		dao.commitTransaction();
		
	}

	@Override
	public String login(String user, String password) {
		List<String> check = dao.login(user, password);
		if((user == check.get(0))&&(password == check.get(1))){
			return "Welcome";
		}
		return "User Invalid";
	}
	

	@Override
	public void logOut() {
		System.out.println("Logout.....");
		
	}

	@Override
	public User findUserById(Long id) {
		User user = dao.findUserById(id);
		return user;
	}


}
