package com.anonymousclass;

import com.interfaces.Powers;

public class Superman {
	
	public void powers() {
		
		Powers supermanpowers = new Powers() {
			@Override
			public void flying() {
				System.out.println("Up Up and Away");
			}
		};
		supermanpowers.flying();
	}
	

}
