package org.hamilton.model;

public enum PharmacyType {
	CVS,
	COSTCO,
	WALMART,
	WALGREENS,
	KAISER,
	RALPHS,
	OTHER;
	public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}


