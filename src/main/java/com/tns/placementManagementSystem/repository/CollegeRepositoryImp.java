package com.tns.placementManagementSystem.repository;

//Importing required entity class and interfaces 
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.tns.placementManagementSystem.entities.College;

public class CollegeRepositoryImp implements ICollegeRepository {
	// Declaring instance variable
	private EntityManager entityManager;
	
	// Initializing entity Manager from JPAUtil static method 
	public CollegeRepositoryImp() 
	{
		entityManager  = JPAUtil.getEntityManager();
	}

	// Implementing the abstract methods from interface.
	
    // Create operation
	@Override
	public void addCollege(College college) {
		// persist method will add data from required schema
		entityManager.persist(college);
	}

	// Update operation
	@Override
	public void updateCollege(College college) {
		// merge method will update data from required schema
		entityManager.merge(college);
	}

	// Read operation
	@Override
	public College searchCollege(String college) {
		String queryString = "select c.c_id from College c where c.collegeName =: coll";
		TypedQuery<Long> query = entityManager.createQuery(queryString, Long.class);
		query.setParameter("coll", college);
		Long id = query.getSingleResult();
		College col = entityManager.find(College.class, id);
		return col;
	}

	// delete operation 
	@Override
	public void deleteCollege(long id) {
		College col = entityManager.find(College.class, id);
		// remove method will  data from required schema
		entityManager.remove(col);
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	// Read operation
	@Override
	public College findCollegeById(Long id) {
		College col = entityManager.find(College.class, id);
		return col;
	}

}
