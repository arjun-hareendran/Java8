package com.constructor;

public class Car {
	String color;
	String type;

	Car(String c, String t){
		this.color = c;
		this.type = t ;	
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

	Car() {
		super();
	}
}
