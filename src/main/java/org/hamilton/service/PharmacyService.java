package org.hamilton.service;

import java.util.ArrayList;

import org.hamilton.model.Pharmacy;
import org.hamilton.model.PharmacyInventory;

public interface PharmacyService {

	public Pharmacy getPharmacyInfo(String pharmacyName);
	public ArrayList<Pharmacy> getAllPharmacies();
	public PharmacyInventory getPharmacyInventory(String pharmacyName);
	public ArrayList<PharmacyInventory> getPharmaciesWithDrugInStock(String ndc);
	
	

}
