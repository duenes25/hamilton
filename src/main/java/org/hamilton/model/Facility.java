package org.hamilton.model;

public class Facility {
	public String name;
	public Location location;
	
	public Facility(){
		super();
		this.name = "";
		this.location = new Location(0,0);
	}
	
	public Facility(String name, Location location) {
		super();
		this.name = name;
		this.location = location;
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
		return "Facility [name=" + name + ", location=" + location + "]";
	}
	
	

}
