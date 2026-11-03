package com.practice;

import org.testng.annotations.Test;

public class SampleTestScreipt extends TestNgAnnotationBeforSuite {
	@Test
	void testScreipt1() {
		System.out.println("Executing Test1");
	}
	@Test
	void testScreipt2() {
		System.out.println("Executing Test2");
	}

}
