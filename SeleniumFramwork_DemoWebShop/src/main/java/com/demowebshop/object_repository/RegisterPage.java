package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	@FindBy(id = "FirstName")
	private WebElement firstnameTextfield;
	@FindBy(id = "LastName")
	private WebElement lastnameTextfield;
	@FindBy(id = "Email")
	private WebElement emailTextField;
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	//getter
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}
	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void registerAsNewUser(String gender,String firstname,String lastname,String emailA, int randomNo, String emailB,String password) {
		if (gender.contains("Male")) {
			maleRadioButton.click();
		} else {
			femaleRadioButton.click();
		}
		firstnameTextfield.sendKeys(firstname);
		lastnameTextfield.sendKeys(lastname);
		emailTextField.sendKeys(emailA+randomNo+emailB);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(password);
		registerButton.click();
	}

	



}
