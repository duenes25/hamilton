package org.hamilton.model;

public class Drug {

	public String name;
	public String manufacturer;
	public String ndc;
	public Boolean isGeneric;
	
	public Drug(){
		super();
	}
	
	public Drug(String name, String manufacturer, String ndc, Boolean isGeneric) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.ndc = ndc;
		this.isGeneric = isGeneric;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getNdc() {
		return ndc;
	}
	public void setNdc(String ndc) {
		this.ndc = ndc;
	}
	public Boolean getIsGeneric() {
		return isGeneric;
	}
	public void setIsGeneric(Boolean isGeneric) {
		this.isGeneric = isGeneric;
	}
	@Override
	public String toString() {
		return "Drug [name=" + name + ", manufacturer=" + manufacturer
				+ ", ndc=" + ndc + ", isGeneric=" + isGeneric + "]";
	}
	
	
	
	
	
	
}
