package com.demowebshop.object_repository;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WellcomePage {

	WebDriver driver;
	public WellcomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log in")
	private WebElement logInLink;
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(xpath = "//div[@class='header-links']//a[@href='/customer/info']")
	private WebElement getRegisteredEmailText;
	
	//Getters
	public WebElement getLogInLink() {
		return logInLink;
	}
	public WebElement getRegisterLink() {
		return RegisterLink;
	}
	public WebElement getRegisteredEmailText() {
		return getRegisteredEmailText;
	}
	//Bussiness Logic
	public void clickOnLogin() {
		logInLink.click();
	}
	public void clickOnRegister() {
		RegisterLink.click();
	}
}