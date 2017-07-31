package org.hamilton.model;

public class Facility {
	public String name;
	public Location location;
	public Address address;
	
	public Facility(){
		super();
		this.name = "";
		this.location = new Location(0,0);
		this.address = new Address();
	}
	
	public Facility(String name, Location location, Address address) {
		super();
		this.name = name;
		this.location = location;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Facility [name=" + name + ", location=" + location + ", address=" + address + "]";
	}
	
	

}
