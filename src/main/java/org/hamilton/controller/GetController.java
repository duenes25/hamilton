package org.hamilton.controller;

import java.util.ArrayList;

import org.hamilton.model.Drug;
import org.hamilton.model.Pharmacy;
import org.hamilton.model.PharmacyInventory;
import org.hamilton.service.DrugService;
import org.hamilton.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
	
	//private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	DrugService drugService;
	
	@Autowired
	PharmacyService pharmacyService;
	
	/*
	 * This Method will respond with the details of a specific Pharmacy
	 * Request should include Pharmacy Name
	 * 
	 */
	@RequestMapping("/pharmacyInfo")
	public Pharmacy pharmacyInfo(@RequestParam(value="pharmacyName", defaultValue="") String pharmacyName) {
		
		return pharmacyService.getPharmacyInfo(pharmacyName);
	}
	
	/*
	 * This method will respond with a list of all Pharmacies.
	 * Request may include a location (longitude/latitude) and a radius
	 * If no location or radius is passed, it will retrieve all pharmacies
	 * 
	 */
	@RequestMapping("/pharmacies")
	public ArrayList<Pharmacy> pharmacyList(@RequestParam(value="longitude", defaultValue="") String longitude,
											@RequestParam(value="latitude", defaultValue="") String latitude,
											@RequestParam(value="radius", defaultValue="") String radius) {
		return pharmacyService.getAllPharmacies();
		
	}
	

	/*
	 * This method will respond with the full inventory of a specific Pharmacy
	 * Request should include pharmacy name
	 * 									
	 */
    @RequestMapping("/pharmacyInventory")
    public PharmacyInventory pharmacyInventory(@RequestParam(value="pharmacyName", defaultValue="") String pharmacyName) {
        
    	return pharmacyService.getPharmacyInventory(pharmacyName);

    }
    

    /*
     * This method will respond with the details of a drug
     * Request should include drug name
     */
    @RequestMapping("/drugInfo")
    public Drug drugInfo(@RequestParam(value="ndc", defaultValue="") String ndc,
    					@RequestParam(value="drugName", defaultValue="") String drugName) {
        
    	return drugService.getDrugInfo(drugName, ndc);

    }
    
    /*
     * This method will respond with a list of Pharmacies that have the drug available
     * Request should include drug name
     * If no location is passed, it will retrieve all pharmacies
     */
    @RequestMapping("/locateDrug")
    public ArrayList<PharmacyInventory> locateDrug(@RequestParam(value="longitude", defaultValue="") String longitude,
												@RequestParam(value="latitude", defaultValue="") String latitude,
												@RequestParam(value="ndc", defaultValue="") String ndc) {
    	
    	return pharmacyService.getPharmaciesWithDrugInStock(ndc);

    }

    
    
}






    


    