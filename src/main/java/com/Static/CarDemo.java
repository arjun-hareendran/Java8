package com.Static;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car Ferrari = new Car("White", "Ferrari");
		System.out.println("Car count is " + Car.carcount);

		Car Merc = new Car("Black", "Merc");
		System.out.println("Car count is " + Car.carcount);

		// Not Recommended.
		Car Porsche = new Car("Blue", "Porsche");
		System.out.println("Car count is " + Porsche.carcount);

		// Static methods
		System.out.println("Using static method");
		System.out.println("Car count is " + Car.howManyCars());
		System.out.println("Car count is " + Porsche.howManyCars());
	}

}
