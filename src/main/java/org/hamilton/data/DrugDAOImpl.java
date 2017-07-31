package org.hamilton.data;

import java.util.ArrayList;

import org.hamilton.model.Drug;

public class DrugDAOImpl extends DrugDAO{

	@Override
	public ArrayList<Drug> findAll() {
		return DrugDAO.drugs;
	}

	@Override
	public ArrayList<Drug> findAllAtPharmacy(String pharmacyName) {
		return DrugDAO.drugs;
	}

	@Override
	public Drug findByNdc(String ndc) {
		
	    Drug result = new Drug();
	    System.out.println("Start iterating through Drug List.  Comparing with NDC: " + ndc);
	    for (Drug drug : DrugDAO.drugs) {
	        if (ndc.trim().equalsIgnoreCase(drug.getNdc().trim())) {
	            result = drug;
	            break;
	        }
	    }
		return result;
	}
	
	@Override
	public Drug findByName(String drugName) {
		
	    Drug result = new Drug();
	    System.out.println("Start iterating through Drug List");
	    for (Drug drug : DrugDAO.drugs) {
	        if (drugName.trim().equalsIgnoreCase(drug.getName().trim())) {
	            result = drug;
	            break;
	        }
	    }
		return result;
	}

	@Override
	public Drug findByNameAndNDC(String drugName, String ndc) {
		
	    Drug result = new Drug();
	    System.out.println("Start iterating through Drug List");
	    for (Drug drug : DrugDAO.drugs) {
	        if (ndc.trim().equalsIgnoreCase(drug.getNdc().trim()) && drugName.trim().equalsIgnoreCase(drug.getName().trim())) {
	            result = drug;
	            break;
	        }
	    }
		return result;
	}
	
}
