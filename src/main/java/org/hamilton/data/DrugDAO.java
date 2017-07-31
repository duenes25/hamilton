package org.hamilton.data;

import java.util.ArrayList;

import org.hamilton.model.Drug;

public abstract class DrugDAO {

	// Dummy database. Initialize with some dummy values.
	public static ArrayList<Drug> drugs;
	{
		drugs = new ArrayList<Drug>();
		drugs.add(new Drug("Betnovate", "Glaxo", "5486805200", false));
		drugs.add(new Drug("Diprosone", "Schering-Plough", "0168005515", false));
		drugs.add(new Drug("Valisone", "Actavis Pharma, Inc", "000850136", false));
		drugs.add(new Drug("Pramosone", "Sebela Pharmaceuticals Inc.", "547660726", false));
		drugs.add(new Drug("Methotrexate", "Bedford Laboratories", "553900031", false));
		drugs.add(new Drug("Cyclosporine", "American Health Packaging", "680840921", false));
	}

	
		
	public abstract ArrayList<Drug> findAll();
	public abstract ArrayList<Drug> findAllAtPharmacy(String pharmacyName);
	public abstract Drug findByNdc(String ndc);
	public abstract Drug findByName(String drugName);
	public abstract Drug findByNameAndNDC(String drugName, String ndc);
	
	
}
