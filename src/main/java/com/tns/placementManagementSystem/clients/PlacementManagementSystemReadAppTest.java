package com.tns.placementManagementSystem.clients;

import javax.persistence.NoResultException;

import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Placement;
import com.tns.placementManagementSystem.entities.Student;
import com.tns.placementManagementSystem.entities.User;
import com.tns.placementManagementSystem.service.CollegeServiceImp;
import com.tns.placementManagementSystem.service.ICollegeService;
import com.tns.placementManagementSystem.service.IPlacementService;
import com.tns.placementManagementSystem.service.IStudentService;
import com.tns.placementManagementSystem.service.IUserService;
import com.tns.placementManagementSystem.service.PlacementServiceImp;
import com.tns.placementManagementSystem.service.StudentServiceImp;
import com.tns.placementManagementSystem.service.UserServiceImp;

public class PlacementManagementSystemReadAppTest {

	public static void main(String[] args) {
		
		// Defining the required service package class objects
		IStudentService studentService = new StudentServiceImp();
		ICollegeService collegeService = new CollegeServiceImp();
		IPlacementService placeService = new PlacementServiceImp();
		IUserService userService       = new UserServiceImp();
		
		
		// Defining Student class object
//		Student student = new Student();
		
//		student = studentService.searchStudentById(1);
//		System.out.println("Name : "+student.getName()+"\n"+ "Course: "+student.getCourse()+"\n"+"College: "+student.getCollegeName()+"\n"+
//		                    "Hall Ticket no: "+student.getHallTicketNo()+"\n"+"Roll no: "+student.getRoll()+"\n"+
//				            "Qualification: "+student.getQualification());
		
//		try {
//			String Name = studentService.searchStudentByHallTicket(4);
//			System.out.println(Name);
//		}catch (NoResultException ex) {
//			System.out.println("Invalid student Hall ticket no OR So such data available in database");
//		}
		
//		College college = new College();
//		college = collegeService.searchCollege("Pillai");
//		
////		college = collegeService.findCollegeById(1L);
//		System.out.println("College Name: "+college.getCollegeName()+"\n"+"College Admin Name: "+college.getCollegeAdmin()+"\n"+
//				           "College Location: "+college.getLocation());

		
//		Placement placement = new Placement();
//		placement = placeService.searchPlacement(1);
//		System.out.println("Company Name: "+placement.getpName()+"\nPlacement schedule no : "+placement.getpDate()+"\nQualification Required: "+placement.getQualification()+
//				           "\nPassout Batch Year"+placement.getYear());
//	
//		User user = new User();
//		user = userService.findUserById(1L);
//		System.out.println("User Name: "+user.getuName()+"\nOrganization: "+user.getuType());
		
		

	}
	

}
