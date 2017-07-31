package org.hamilton.service;

import java.util.ArrayList;

import org.hamilton.data.DrugDAO;
import org.hamilton.data.DrugDAOImpl;
import org.hamilton.model.Drug;
import org.springframework.stereotype.Service;


@Service
public class DrugServiceImpl implements DrugService{
	
	
	@Override
	public Drug getDrugInfo(String drugName, String ndc){
		System.out.println("In getDrugInfo Service for drugName= " + drugName + " and NDC= " + ndc);
		DrugDAO drugDao = new DrugDAOImpl();
		//if drugName is empty and ndc is there, call findByNDC
		if(drugName == null || drugName.isEmpty()){
			if( ndc == null || ndc.isEmpty())
			{
				//Both values empty return empty drug
				System.out.println("Both empty");
				return new Drug();
			}
			else{
				//Locate only by ndc
				System.out.println("Only NDC populated");
				return drugDao.findByNdc(ndc);	
			}
		}
		//drugName is not empty.  Check if NDC is there too
		else{
			if(ndc == null || ndc.isEmpty()){
				System.out.println("Only ndc is populated");
				//locate only by drugname
				return drugDao.findByName(drugName);
			}
				//Locate by both name and ndc
			else{
				System.out.println("Both populated");
				return drugDao.findByNameAndNDC(drugName, ndc);
			}
		}
		
	}
	
	@Override
	public ArrayList<Drug> getPharmacyDrugList(String pharmacyName){
		DrugDAO drugDao = new DrugDAOImpl();
		return drugDao.findAllAtPharmacy(pharmacyName);
		
	}
	
	@Override
	public ArrayList<Drug> getDrugInventoryAtPharmacy(String pharmacyName){
		DrugDAO drugDao = new DrugDAOImpl();
		return drugDao.findAllAtPharmacy(pharmacyName);
	}

}
