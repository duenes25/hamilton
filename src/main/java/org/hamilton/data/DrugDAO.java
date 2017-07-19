package org.hamilton.data;

import java.util.ArrayList;

import org.hamilton.model.Drug;

public abstract class DrugDAO {

	// Dummy database. Initialize with some dummy values.
	public static ArrayList<Drug> drugs;
	{
		drugs = new ArrayList<Drug>();
		drugs.add(new Drug("drug1", "manufacturer1", "00000000000", false));
		drugs.add(new Drug("drug2", "manufacturer2", "11111111111", false));
		drugs.add(new Drug("drug3", "manufacturer2", "22222222222", false));
		drugs.add(new Drug("drug4", "manufacturer3", "33333333333", false));
		drugs.add(new Drug("drug5", "manufacturer3", "44444444444", false));
		drugs.add(new Drug("drug6", "manufacturer3", "55555555555", false));
	}

	
		
	public abstract ArrayList<Drug> findAll();
	public abstract ArrayList<Drug> findAllAtPharmacy(String pharmacyName);
	public abstract Drug findByNdc(String ndc);
	
	
}
