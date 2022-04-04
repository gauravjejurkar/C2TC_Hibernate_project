package com.tns.placementManagementSystem.service;

import com.tns.placementManagementSystem.entities.Placement;
import com.tns.placementManagementSystem.repository.*;

public class PlacementServiceImp implements IPlacementService{

	private IPlacementRepository dao;
	
	public PlacementServiceImp() {
		dao = new PlacementRepositoryImp();
		
	}

	@Override
	public void addPlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public void cancelPlacement(long id) {
	  dao.beginTrancsaction();
	  dao.cancelPlacement(id);
	  dao.commitTransaction();
	}
	
	 

}
