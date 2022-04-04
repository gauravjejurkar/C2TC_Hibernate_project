package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.Placement;

//Defining a interface IPlacementRepository
public interface IPlacementRepository {

	// Declaring abstract methods
	
	public void addPlacement(Placement placement);

	public void updatePlacement(Placement placement);

	public Placement searchPlacement(long id);
	
	public void cancelPlacement(long id);

	public void beginTrancsaction();

	public void commitTransaction();



}
