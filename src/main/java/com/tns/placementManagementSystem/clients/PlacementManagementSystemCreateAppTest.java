package com.tns.placementManagementSystem.clients;


// Importing the entity classes to defining object
import com.tns.placementManagementSystem.entities.User;

// Importing service interface for references and ServiceImp classes to make objects
import com.tns.placementManagementSystem.service.IUserService;
import com.tns.placementManagementSystem.service.UserServiceImp;

public class PlacementManagementSystemCreateAppTest {
	
	// Declaring required instance variable
	
	private User user;
	
	private IUserService userService;
	

	// Initialing instance variable through a Constructor 
	public PlacementManagementSystemCreateAppTest() 
	{
		user = new User();
		userService = new UserServiceImp();
	
	}
	
	
	
	// Method to add user data
	public void registerUser(Long userid, String userName, String userPass, String userType)
	{
		// Calling setter methods to write the private fields
		user.setUser_id(userid);
		user.setuName(userName);
		user.setuPassword(userPass);
		user.setuType(userType);
	}
	
	// Method to add data in data base relation 
	public void saveRegisterUserData()
	{
		// Through userService we are sending the data in relation world
		userService.addUser(user);
	}
	
	

	
	
}
