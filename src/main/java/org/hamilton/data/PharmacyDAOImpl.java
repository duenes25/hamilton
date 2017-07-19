package org.hamilton.data;

import java.util.ArrayList;

import org.hamilton.model.Drug;
import org.hamilton.model.Pharmacy;
import org.hamilton.model.PharmacyInventory;

public class PharmacyDAOImpl extends PharmacyDAO {

	@Override
	public ArrayList<Pharmacy> findAll() {
		return PharmacyDAO.pharmacies;
	}

	@Override
	public Pharmacy findByName(String pharmacyName) {
		Pharmacy result = new Pharmacy();
	    for (Pharmacy pharmacy : PharmacyDAO.pharmacies) {
	        if (pharmacyName.equals(pharmacy.getName())) {
	            result = pharmacy;
	            break;
	        }
	    }
		return result;
	}

	@Override
	public ArrayList<PharmacyInventory> findAllContainingDrug(String ndc) {
		ArrayList<PharmacyInventory> result = new ArrayList<PharmacyInventory>();
	    for (PharmacyInventory pharmacyInventory : PharmacyDAO.pharmacyInventory) {
	    	for (Drug drug : pharmacyInventory.getDrugList()) {
	    		if (ndc.equals(drug.getNdc())) {
	    			result.add(pharmacyInventory);
	    		}
	    	}
	    }
		return result;
	}

	@Override
	public PharmacyInventory findInventoryByName(String pharmacyName) {
		PharmacyInventory result = new PharmacyInventory();
	    for (PharmacyInventory pharmacyInventory : PharmacyDAO.pharmacyInventory) {
	        if (pharmacyName.equals(pharmacyInventory.getPharmacy().getName())) {
	            result = pharmacyInventory;
	            break;
	        }
	    }
		return result;
	}

}
