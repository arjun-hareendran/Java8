package com.lambda;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MylambdaSquare multiplylambda = (int a) -> a * a;
		MylambdaPrint printlamdba = () -> System.out.println("HelloWorld");

		printlamdba.foo();
	}
}

interface MylambdaSquare {
	int foo(int a);
}

interface MylambdaPrint {
	void foo();
}
