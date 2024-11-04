package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*** LoginLink ***/
	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginlnk;

	public void clickloginlink() {
		loginlnk.click();
	}

	/*** UserEmailId ***/
	@FindBy(id = "Email")
	 public WebElement EmailID;

//	public void EmailId(String email) {
//		EmailID.sendKeys(email);
//	}

	/*** UserPassword ***/
	@FindBy(id = "Password")
	public WebElement password;

//	public void Password(String pass) {
//		password.sendKeys(pass);
//	}

	/*** Remembercheckbox ***/
	@FindBy(id = "RememberMe")
	WebElement remember;

	public void Remember() {
		remember.click();
	}

	/*** Loginbutton ***/
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginbtn;

	public void clickloginbtn() {
		loginbtn.click();
	}

	/*** WrongCredintial ***/
	@FindBy(xpath = "//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")
	WebElement error1;

	public void ErrorMsg1() {
		String expectedHeading = "Login was unsuccessful. Please correct the errors and try again.";
		String actualHeading = error1.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println(error1.getText());
	}

	/*** InvalidPass ***/
	@FindBy(xpath = "//li[contains(text(),'The credentials provided are incorrect')]")
	WebElement error2;

	public void InvalidPass() {
		String expectedHeading = "The credentials provided are incorrect";
		String actualHeading = error2.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println(error2.getText());

	}

	/*** InvalidEmailId ***/
	@FindBy(xpath = "//li[contains(text(),'No customer account found')]")
	WebElement error3;

	public void InvalidEmail() {
		String expectedHeading = "No customer account found";
		String actualHeading = error3.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println(error3.getText());

	}
	
	/*** Logoutbutton ***/
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logoutbtn;

	public void Logoutbtn() {
		logoutbtn.click();
	}

}
