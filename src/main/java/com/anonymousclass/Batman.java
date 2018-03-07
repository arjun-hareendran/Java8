package com.anonymousclass;

import com.interfaces.Powers;

public class Batman {

	public void checkPowers() {
		
		Powers batmanpowers = new Powers() {
			@Override
			public void flying() {
				System.out.println("No Flying power");
			}
		};
		
		batmanpowers.flying();
	}
}
