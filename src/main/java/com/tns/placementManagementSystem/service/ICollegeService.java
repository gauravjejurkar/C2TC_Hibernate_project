package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Placement;

//Defining a interface IStudentRepository
public interface ICollegeService {
	
	public void addCollege(College college);
	
	public void updateCollege(College college);
	
	public College searchCollege(String college);
	
	public void deleteCollege(long id);
	
	public College findCollegeById(Long id);
	
	public void schedulePlacement(Placement placement);

}
