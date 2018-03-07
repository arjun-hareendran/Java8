package com.initilization;

public class InitializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Initilization objWithOutConsutructor = new Initilization();
		Initilization objWithConsutructor = new Initilization("Red", "Ferrari");

		System.out.println("My car colour is " + objWithOutConsutructor.getColor() + " and the type is "
				+ objWithOutConsutructor.getType());
		System.out.println("My mumscar colour is " + objWithConsutructor.getColor() + " and the type is "
				+ objWithConsutructor.getType());

	}

}
