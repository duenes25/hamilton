package org.hamilton.data;

import java.util.ArrayList;

import org.hamilton.model.Drug;
import org.hamilton.model.Location;
import org.hamilton.model.Pharmacy;
import org.hamilton.model.PharmacyInventory;
import org.hamilton.model.PharmacyType;

public abstract class PharmacyDAO {
	
	
	// Dummy database. Initialize with some dummy values.
	public static ArrayList<Pharmacy> pharmacies;
	{
		pharmacies = new ArrayList<Pharmacy>();
		pharmacies.add(new Pharmacy("pharmacy1", new Location(1,1), PharmacyType.CVS));
		pharmacies.add(new Pharmacy("pharmacy2", new Location(2,2), PharmacyType.WALGREENS));
		pharmacies.add(new Pharmacy("pharmacy3", new Location(3,3), PharmacyType.CVS));
		pharmacies.add(new Pharmacy("pharmacy4", new Location(4,4), PharmacyType.WALMART));
		pharmacies.add(new Pharmacy("pharmacy5", new Location(5,5), PharmacyType.KAISER));
		pharmacies.add(new Pharmacy("pharmacy6", new Location(6,6), PharmacyType.CVS));
	}

	public static ArrayList<PharmacyInventory> pharmacyInventory;
	{
		pharmacyInventory = new ArrayList<PharmacyInventory>();
		
		ArrayList<Drug> drugList = new ArrayList<Drug>();
		drugList.add(new Drug("drug1", "manufacturer1", "00000000000", false));
		drugList.add(new Drug("drug2", "manufacturer2", "11111111111", false));
		drugList.add(new Drug("drug3", "manufacturer2", "22222222222", false));
		drugList.add(new Drug("drug4", "manufacturer3", "33333333333", false));
		drugList.add(new Drug("drug5", "manufacturer3", "44444444444", false));
		drugList.add(new Drug("drug6", "manufacturer3", "55555555555", false));
		drugList.add(new Drug("Drug X", "manufacturer x", "9999999999", false));
		pharmacyInventory.add(new PharmacyInventory(new Pharmacy("pharmacy1", new Location(1,1), PharmacyType.CVS), drugList));
		pharmacyInventory.add(new PharmacyInventory(new Pharmacy("pharmacy2", new Location(2,2), PharmacyType.WALGREENS), drugList));
		pharmacyInventory.add(new PharmacyInventory(new Pharmacy("pharmacy3", new Location(3,3), PharmacyType.CVS), drugList));		
	}
		
	public abstract ArrayList<Pharmacy> findAll();
	public abstract Pharmacy findByName(String pharmacyName);
	public abstract ArrayList<PharmacyInventory> findAllContainingDrug(String ndc);
	public abstract PharmacyInventory findInventoryByName(String pharmacyName);
	

}
