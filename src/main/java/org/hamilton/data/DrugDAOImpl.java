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
	    for (Drug drug : DrugDAO.drugs) {
	        if (ndc.equals(drug.getNdc())) {
	            result = drug;
	            break;
	        }
	    }
		return result;
	}

	
}
