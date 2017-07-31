package org.hamilton.service;

import java.util.ArrayList;
import org.hamilton.model.Drug;

public interface DrugService {
	
	public Drug getDrugInfo(String drugName, String ndc);
	public ArrayList<Drug> getPharmacyDrugList(String pharmacyName);
	public ArrayList<Drug> getDrugInventoryAtPharmacy(String pharmacyName);

}
