package com.practice;

import org.testng.annotations.Test;

public class InvocationCount {

	public class invocationCount {
		
		@Test(priority  = 1,invocationCount = 20)
		public void register() {
			System.out.println("New user Registered");
		}
		@Test(priority  = 2,invocationCount = 5)
		public void ligin() {
			System.out.println("New user Registered");
		}
	}
}