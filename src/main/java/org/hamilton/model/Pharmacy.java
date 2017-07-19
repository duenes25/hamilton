package org.hamilton.model;

public class Pharmacy extends Facility {
	
	public PharmacyType pharmacyType;
	
	public Pharmacy() {
		super();
	}
	
	public Pharmacy(String name, Location location,
			PharmacyType pharmacyType) {
		super(name, location);
		this.pharmacyType = pharmacyType;
	}


	public PharmacyType getPharmacyType() {
		return pharmacyType;
	}

	public void setPharmacyType(PharmacyType pharmacyType) {
		this.pharmacyType = pharmacyType;
	}


	@Override
	public String toString() {
		return "PharmacyFacility [pharmacyType=" + pharmacyType + "]";
	}
	
	
}
