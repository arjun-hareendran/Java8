package com.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mycar = new Car("White","Maruti");
		Car mumscar = new Car();
		mumscar.setColor("Black");
		mumscar.setType("Toyota");
		
		System.out.println("My car colour is " + mycar.getColor() + " and the type is " + mycar.getType());
		System.out.println("My mumscar colour is " + mumscar.getColor() + " and the type is " + mumscar.getType());
		
		
	}

}
