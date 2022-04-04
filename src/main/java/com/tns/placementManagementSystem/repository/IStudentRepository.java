package com.tns.placementManagementSystem.repository;



import com.tns.placementManagementSystem.entities.Student;


// Defining a interface IStudentRepository
public interface IStudentRepository {

	
	// Declaring abstract methods
	
	public void addStudent(Student student);
	
	public void updateStudent(Student student);
	
	public Student searchStudentById(long id);
	
	public String searchStudentByHallTicket(long ticketNo);
	
	public void deleteStudent(Student student);

	public void beginTrancsaction();
	
	public void commitTransaction();
}
