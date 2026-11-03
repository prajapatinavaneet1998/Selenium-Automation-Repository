package com.demowebshop.generic_utilities;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	public WebDriverUtility wdu;
	public String browser;
	public String url;
	public String email ;
	public String password;
	@BeforeSuite
	public void configBeforeSuite() {
		Reporter.log("---Executing Before Suite---",true);
	}
	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("---Executing After Suite---",true);
	}
	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("---Executing Before Suite---",true);
	}
	@AfterTest
	public void configAfterTest() {
		Reporter.log("---Executing After Suite---",true);
	}
	@BeforeClass
	public void configBeforeClass() throws FileNotFoundException, IOException {
		Reporter.log("---Executing Before Suite---",true);
		fileUtility fu=new fileUtility();
		browser =fu.readKeyValueFromPeopertyfile("browser");
		url = fu.readKeyValueFromPeopertyfile("applicationUrl");
		email = fu.readKeyValueFromPeopertyfile("validEmail");
		password =fu.readKeyValueFromPeopertyfile("validPassword");	
	}
	@AfterClass
	public void configAfterClass()  {
		Reporter.log("---Executing After Suite---",true);	
	}
	@Parameters("browser")
	@BeforeMethod
	public void configBeforeMethod(String browser) {
		Reporter.log("---Executing Before Suite---",true);
		//Launching the browser
		
		if (browser.contains("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}else {
			//System.out.println("Enter valid browser");
			Reporter.log("Enter valid browser");
		}
		//Maximize
		wdu=new WebDriverUtility(driver);
		wdu.maximizeBrowser();
		//Wait
		WaitUtility wu=new WaitUtility(driver);
		wu.waitForAllLocatedElements(10);
		//Navigating to app
		wdu.openApplication(url);
	}
	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("---Executing After Suite---",true);
		//Quit browser
		wdu.terminateBrowser();
	}


}