package com.qa.maps;

public class Spider extends Pet {

	private boolean venomous;

	public Spider(String name, boolean venomous) {
		super(name);
		this.venomous = venomous;
	}

	public boolean isVenomous() {
		return this.venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

	@Override
	public String toString() {
		return "Spider [venomous=" + this.venomous + ", name=" + this.getName() + "]";
	}

}
