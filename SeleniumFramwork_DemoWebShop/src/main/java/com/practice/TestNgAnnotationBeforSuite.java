package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class TestNgAnnotationBeforSuite {
	//Config Annotations
	@BeforeSuite
	void configBeforeSuite() {
		System.out.println("---Executing Before Suite---");
	}
	@AfterSuite
	void configAfterSuite() {
		System.out.println("---Executing After Suite---");
	}
	@BeforeTest
	void configBeforeTest() {
		System.out.println("---Executing Before Test---");
	}
	@AfterTest
	void configAfterTest() {
		System.out.println("---Executing After Test---");
	}
	@BeforeClass
	void configBeforeCalss() {
		System.out.println("---Executing Before class---");
	}
	@AfterClass
	void configBeforeclass() {
		System.out.println("---Executing After Class---");
	}
	@BeforeMethod
	void configBeforeMethod() {
		System.out.println("---Executing Before Method---");
	}
	@AfterMethod
	void configafterMethod() {
		System.out.println("---Executing After Method---");
	}
//	@Test
//	void testMethod1() {
//		System.out.println("Executing Test Method1");
//	}
//	@Test
//	void testMethod2() {
//		System.out.println("Executing Test Method2");
//	}

}