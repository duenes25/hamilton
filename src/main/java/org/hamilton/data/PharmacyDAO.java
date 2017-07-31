package org.hamilton.data;

import java.util.ArrayList;

import org.hamilton.model.Address;
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
		pharmacies.add(new Pharmacy("CVS Pharmacy", new Location(1,1), PharmacyType.CVS, new Address("6700 Topanga Canyon Blvd", "Canoga Park", "CA", "91303")));
		pharmacies.add(new Pharmacy("True Care Family Pharmacy", new Location(1,1), PharmacyType.OTHER, new Address("22030 Sherman Way #100", "Canoga Park", "CA", "91303")));
		pharmacies.add(new Pharmacy("Ralphs Pharmacy", new Location(1,1), PharmacyType.RALPHS, new Address("22333 Sherman Way", "Canoga Park", "CA", "91303")));
		pharmacies.add(new Pharmacy("Walmart Pharmacy", new Location(1,1), PharmacyType.WALMART, new Address("6433 Fallbrook Ave", "West Hills", "CA", "91307")));
		pharmacies.add(new Pharmacy("CVS Pharmacy", new Location(1,1), PharmacyType.CVS, new Address("6635 Fallbrook Ave", "West Hills", "CA", "91307")));
		pharmacies.add(new Pharmacy("CVS Pharmacy", new Location(1,1), PharmacyType.CVS, new Address("22968 Victory Blvd", "Woodland Hills", "CA", "91367")));
		
		
	}

	public static ArrayList<PharmacyInventory> pharmacyInventory;
	{
		pharmacyInventory = new ArrayList<PharmacyInventory>();
		
		ArrayList<Drug> drugList = new ArrayList<Drug>();
		drugList.add(new Drug("Betnovate", "Glaxo", "5486805200,", false));
		drugList.add(new Drug("Diprosone", "Schering-Plough", "0168005515,", false));
		drugList.add(new Drug("Valisone", "Actavis Pharma, Inc", "000850136", false));
		drugList.add(new Drug("Pramosone", "Sebela Pharmaceuticals Inc.", "547660726", false));
		drugList.add(new Drug("Methotrexate", "Bedford Laboratories", "553900031", false));
		drugList.add(new Drug("Cyclosporine", "American Health Packaging", "680840921", false));
		pharmacies.add(new Pharmacy("CVS Pharmacy", new Location(1,1), PharmacyType.CVS, new Address("6700 Topanga Canyon Blvd", "Canoga Park", "CA", "91303")));
		pharmacies.add(new Pharmacy("True Care Family Pharmacy", new Location(1,1), PharmacyType.OTHER, new Address("22030 Sherman Way #100", "Canoga Park", "CA", "91303")));
		pharmacies.add(new Pharmacy("Ralphs Pharmacy", new Location(1,1), PharmacyType.RALPHS, new Address("22333 Sherman Way", "Canoga Park", "CA", "91303")));
	}
		
	public abstract ArrayList<Pharmacy> findAll();
	public abstract Pharmacy findByName(String pharmacyName);
	public abstract ArrayList<PharmacyInventory> findAllContainingDrug(String ndc);
	public abstract PharmacyInventory findInventoryByName(String pharmacyName);
	

}
