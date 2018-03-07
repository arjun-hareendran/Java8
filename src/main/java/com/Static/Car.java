package com.Static;

public class Car {
	String color;
	String type;
	// static variable, This is not instance variable
	static int carcount;

	// Static initialization block
	static {

		carcount = 0;
	}

	Car(String c, String t) {
		this.color = c;
		this.type = t;
		carcount = carcount + 1;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Static method
	public static int howManyCars() {
		// System.out.println("Testing instance variables" + color); // Cannot do this
		return carcount;
	}
}
