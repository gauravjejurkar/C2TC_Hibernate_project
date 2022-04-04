package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.repository.IStudentRepository;
import com.tns.placementManagementSystem.repository.StudentRepositoryImp;

import javax.persistence.TypedQuery;

import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.Student;

public class StudentServiceImp implements IStudentService{
	
	private IStudentRepository dao;

	// Initializing StudentRepositoryImp class object
	public StudentServiceImp() 
	{
		dao = new StudentRepositoryImp();
	}

	
	// Create Operation
	@Override
	public void addStudent(Student student) {
		dao.beginTrancsaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	
	// Update Operation
	@Override
	public void updateStudent(Student student) {
		dao.beginTrancsaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	// Read Operation
	@Override
	public Student searchStudentById(long id) {
		Student student = dao.searchStudentById(id);
		return student;
	}

	// Read operation
	@Override
	public String searchStudentByHallTicket(long id) {
		String studentName = dao.searchStudentByHallTicket(id);
		return studentName;
	}



	// Delete Operation
	@Override
	public void deleteStudent(Student student) {
		dao.beginTrancsaction();
		dao.deleteStudent(student);
		dao.commitTransaction();
		
	}

}
