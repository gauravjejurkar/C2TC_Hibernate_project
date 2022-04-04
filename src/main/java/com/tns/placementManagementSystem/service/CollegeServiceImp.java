package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Placement;
import com.tns.placementManagementSystem.repository.*;

public class CollegeServiceImp implements ICollegeService {

	
	
	private ICollegeRepository dao;
	
	public CollegeServiceImp() {
		dao = new CollegeRepositoryImp();
	}

	@Override
	public void addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		
	}

	@Override
	public College searchCollege(String college) {
		College college1 = dao.searchCollege(college);
		return college1;
	}

	@Override
	public void deleteCollege(long id) {
		dao.beginTransaction();
		dao.deleteCollege(id);
		dao.commitTransaction();
		
	}

	@Override
	public void schedulePlacement(Placement placement) {
		
		
	}

	@Override
	public College findCollegeById(Long id) {
		College col = dao.findCollegeById(id);
		return col;	
	}


}
