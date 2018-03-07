package com.This;

public class Car {
	String color;
	String type;
	// static variable, This is not instance variable
	static int carcount =0;

	Car(){
		carcount = carcount + 1;
	}

	Car(String color, String type) {
		this();  //This calls the Car() constructor and executes the car count 
		this.color = color;
		this.type = type;
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
