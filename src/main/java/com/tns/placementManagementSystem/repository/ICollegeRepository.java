package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.College;


//Defining a interface IStudentRepository
public interface ICollegeRepository {
	
// Declaring abstract methods
public void addCollege(College college);

public void updateCollege(College college);

public College searchCollege(String college);

public College findCollegeById(Long id);

public void deleteCollege(long id);

void beginTransaction();

void commitTransaction();


}
