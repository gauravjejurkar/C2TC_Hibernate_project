package com.tns.placementManagementSystem.clients;

import javax.persistence.NoResultException;

import com.tns.placementManagementSystem.service.IUserService;
import com.tns.placementManagementSystem.service.UserServiceImp;

public class UserTestApp {

	
	public static void main(String[] args) {
		
		
		PlacementManagementSystemCreateAppTest system = new  PlacementManagementSystemCreateAppTest();
		
		
//		Long userid, String userName, String userPass, String userType
//		system.registerUser(1L, "M.K", "1234", "University");
//		system.saveRegisterUserData();
//		System.out.println("Done");
		
		
		IUserService userService = new UserServiceImp();
		try {
			String response = userService.login("M.5", "1234");
			System.out.println(response);
		}catch (NoResultException ex)
		{
			System.out.println("Please Register---");
		}
		
		
		
		
	
		
		
		
		
		
		

	}

}
