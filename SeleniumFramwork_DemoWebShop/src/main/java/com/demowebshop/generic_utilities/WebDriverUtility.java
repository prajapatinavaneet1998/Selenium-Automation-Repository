package com.demowebshop.generic_utilities;



import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	//navigate to application
	public void openApplication(String appURL) {
		driver.get(appURL);
	}
	//fetch URL
		public String fetchURL() {
			return driver.getCurrentUrl();
		}
	//fetch title
	public String fetchTitle() {
		return driver.getTitle();
	}
	//GetWindowHandle
	public  String ID() {
		return driver.getWindowHandle();
	}
	//GetWindowHandles
	public Set<String> AllId() {
		return driver.getWindowHandles();
	}
	//switch to child window
	public void switchControlToWindow(String title) {
		for (String handle : AllId()) {
			driver.switchTo().window(handle);
			if (fetchTitle().contains(title)) {
				break;
			}
		}
	}
	//Open a new Tab
	public void openNewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	//switch to Alert
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public void typeAndAcceptAlert(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	//Quit
	public void terminateBrowser() {
		driver.quit();
	}
	//switch to Frame
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebElement FrameElement) {
		driver.switchTo().frame(FrameElement);
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		
	}
}
