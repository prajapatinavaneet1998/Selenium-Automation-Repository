package com.practice;


import org.testng.annotations.Test;

//public class EnabledTest {
//	@Test(priority = 1,invocationCount = 20,threadPoolSize = 10)
//	public void method1() {
//		System.out.println("New user Registered");
//	}
//	@Test(priority = 2,invocationCount = 5)
//	public void method2() {
//		System.out.println("New user Logged in");
//}
//	
//}


public class EnabledTest {
	@Test(timeOut = 1000)
	public void method1() {
		System.out.println("New user Registered");
	}
	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("New user Logged in");
}
	
}