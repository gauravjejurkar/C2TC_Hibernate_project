package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.Student;


public interface IStudentService {
	
	public void addStudent(Student student);
	
	public void updateStudent(Student student); 
	
	public Student searchStudentById(long id);  

	public String searchStudentByHallTicket(long id); 

	public void deleteStudent(Student student); 

}
