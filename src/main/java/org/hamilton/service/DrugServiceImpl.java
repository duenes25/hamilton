package org.hamilton.service;

import java.util.ArrayList;

import org.hamilton.data.DrugDAO;
import org.hamilton.data.DrugDAOImpl;
import org.hamilton.model.Drug;
import org.springframework.stereotype.Service;


@Service
public class DrugServiceImpl implements DrugService{
	
	
	@Override
	public Drug getDrugInfo(String ndc){
		//return new Drug(ndc, "sample manufacturer", "00000000000", false);
		DrugDAO drugDao = new DrugDAOImpl();
		return drugDao.findByNdc(ndc);
		
	}
	
	@Override
	public ArrayList<Drug> getPharmacyDrugList(String pharmacyName){
		/*
		ArrayList<Drug> drugList = new ArrayList<Drug>();
		drugList.add(new Drug("drug1", "manufacturer1", "00000000000", false));
		drugList.add(new Drug("drug2", "manufacturer2", "11111111111", false));
		drugList.add(new Drug("drug3", "manufacturer2", "22222222222", false));
		drugList.add(new Drug("drug4", "manufacturer3", "33333333333", false));
		drugList.add(new Drug("drug5", "manufacturer3", "44444444444", false));
		drugList.add(new Drug("drug6", "manufacturer3", "55555555555", false));
		return drugList;
		*/
		DrugDAO drugDao = new DrugDAOImpl();
		return drugDao.findAllAtPharmacy(pharmacyName);
		
	}
	
	@Override
	public ArrayList<Drug> getDrugInventoryAtPharmacy(String pharmacyName){
		/*
		ArrayList<Drug> drugList = new ArrayList<Drug>();
		drugList.add(new Drug("drug1", "manufacturer1", "00000000000", false));
		drugList.add(new Drug("drug2", "manufacturer2", "11111111111", false));
		drugList.add(new Drug("drug3", "manufacturer2", "22222222222", false));
		drugList.add(new Drug("drug4", "manufacturer3", "33333333333", false));
		drugList.add(new Drug("drug5", "manufacturer3", "44444444444", false));
		drugList.add(new Drug("drug6", "manufacturer3", "55555555555", false));
		return drugList;
		*/
		DrugDAO drugDao = new DrugDAOImpl();
		return drugDao.findAllAtPharmacy(pharmacyName);
	}

}
