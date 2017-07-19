package org.hamilton.service;

import java.util.ArrayList;

import org.hamilton.data.PharmacyDAO;
import org.hamilton.data.PharmacyDAOImpl;
import org.hamilton.model.Pharmacy;
import org.hamilton.model.PharmacyInventory;
import org.springframework.stereotype.Service;

@Service
public class PharmacyServiceImpl implements PharmacyService{

	@Override
	public Pharmacy getPharmacyInfo(String pharmacyName){
		/*
		Location pharmacyLocation = new Location(0, 0);
		return new Pharmacy(pharmacyName, pharmacyLocation, PharmacyType.CVS);
		*/
		PharmacyDAO pharmacyDao = new PharmacyDAOImpl();
		return pharmacyDao.findByName(pharmacyName);
	}
	
	@Override
	public ArrayList<Pharmacy> getAllPharmacies(){
		/*
		ArrayList<Pharmacy> pharmacyList = new ArrayList<Pharmacy>();
		
		pharmacyList.add(new Pharmacy("pharmacy1", new Location(1,1), PharmacyType.CVS));
		pharmacyList.add(new Pharmacy("pharmacy2", new Location(2,2), PharmacyType.WALGREENS));
		pharmacyList.add(new Pharmacy("pharmacy3", new Location(3,3), PharmacyType.CVS));
		pharmacyList.add(new Pharmacy("pharmacy4", new Location(4,4), PharmacyType.WALMART));
		pharmacyList.add(new Pharmacy("pharmacy5", new Location(5,5), PharmacyType.KAISER));
		pharmacyList.add(new Pharmacy("pharmacy6", new Location(6,6), PharmacyType.CVS));
		
		return pharmacyList;
		*/
		PharmacyDAO pharmacyDao = new PharmacyDAOImpl();
		return pharmacyDao.findAll();
		
	}

	@Override
	public PharmacyInventory getPharmacyInventory(String pharmacyName){
		/*
		Location location = new Location(0, 0);
		Pharmacy pharmacy = new Pharmacy("Test", location, PharmacyType.KAISER); 
		DrugService drugService = new DrugServiceImpl();
        ArrayList<Drug> drugList = drugService.getPharmacyDrugList(pharmacy.getName());
        return new PharmacyInventory(pharmacy, drugList);
        */
		PharmacyDAO pharmacyDao = new PharmacyDAOImpl();
		return pharmacyDao.findInventoryByName(pharmacyName);
	}
	
	@Override
	public ArrayList<PharmacyInventory> getPharmaciesWithDrugInStock(String ndc){
		/*
		ArrayList<PharmacyInventory> pharmacyInventoryList = new ArrayList<PharmacyInventory>();
		
		ArrayList<Drug> drugList = new ArrayList<Drug>();
		drugList.add(new Drug("Drug X", "manufacturer x", "9999999999", false));
		
		pharmacyInventoryList.add(new PharmacyInventory(new Pharmacy("pharmacy1", new Location(1,1), PharmacyType.CVS), drugList));
		pharmacyInventoryList.add(new PharmacyInventory(new Pharmacy("pharmacy2", new Location(2,2), PharmacyType.WALGREENS), drugList));
		pharmacyInventoryList.add(new PharmacyInventory(new Pharmacy("pharmacy3", new Location(3,3), PharmacyType.CVS), drugList));
		
		return pharmacyInventoryList;
		*/
		PharmacyDAO pharmacyDao = new PharmacyDAOImpl();
		return pharmacyDao.findAllContainingDrug(ndc);
		
	}

	
}
