package com.interfaces;

public interface Fly {

	default public void flying() {
		System.out.println("Flying !!!! ");
	}
	
	public static void timeCheck() {
		System.out.println(System.currentTimeMillis());
	}
	
}
