package com.initilization;

public class Initilization {

	// This executes first
	String color = "Blue";
	String type;

	// **********************************************
	// This executes second
	//The color will be set to white by default , but if the initialization block is before the data type declaration
	//the value will be overridden
	{
		color = "White";
		type = "Maruti";
	}

	// **********************************************

	// Constructor runs third
	// if you have n number of constructors, the position of the constructors doesnt matter
	Initilization(String c, String t) {
		this.color = c;
		this.type = t;
	}

	// Constructor runs third
	Initilization() {
		super();
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

}
