package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
	//creating dataprovider method
	@DataProvider(name="LonginCreds")
	public Object[][]getData(){
		return new Object[][] {{"user1","pass1"},
			{"user2","pass2"},{"user3","pass3"}};
		//return data;
	}
	
	@Test(dataProvider = "LonginCreds")
	public void testMethod(String username,String password) {
		System.out.println("the username is:"+username);
		System.out.println("the password is:"+password);
		System.out.println("------------------------------");
	}

}
