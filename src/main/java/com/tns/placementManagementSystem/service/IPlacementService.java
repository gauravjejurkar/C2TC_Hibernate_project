package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.Placement;

public interface IPlacementService {
	
	public void addPlacement(Placement placement);

	public void updatePlacement(Placement placement);
	
	public Placement searchPlacement(long id); 
	
	public void cancelPlacement(long id);
	

}
