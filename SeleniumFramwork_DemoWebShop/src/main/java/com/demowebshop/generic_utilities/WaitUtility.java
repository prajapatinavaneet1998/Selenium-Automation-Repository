package com.demowebshop.generic_utilities;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	WebDriver driver;
	public WaitUtility(WebDriver driver) {
		this.driver=driver;
	}
	//wait for elements to load
	public void waitForAllLocatedElements(long secondsToWait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsToWait));
	}
	//wait for page to load
	public void waitForWebPageToLoad(long secondToWait) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondToWait));
	}
	//wait for element to be clickable
	public void waitForElementToBeClickable(long secondsToWait, WebElement target) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
		wait.until(ExpectedConditions.elementToBeClickable(target));
	}
	//wait for element to be visible
	public void waitForElementToBeVisisble(long secondsToWait, WebElement target) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
	public void maximizeBrowser() {
		// TODO Auto-generated method stub
		
	}
	public void waitForAllLocaredElements(int i) {
		// TODO Auto-generated method stub
		
	}
	public void openApplication(String url) {
		// TODO Auto-generated method stub
		
	}
	public void terminateBrowser() {
		// TODO Auto-generated method stub
		
	}
}
