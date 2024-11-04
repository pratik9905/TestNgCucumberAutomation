package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage {

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*** RegistrationLink ***/
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement registerbut;

	public void registerlink() {
		registerbut.click();
	}

	/*** MaleorFemaleCheckBox ***/
	@FindBy(id = "gender-female")
	WebElement Female;

	public void Gender() {
		Female.click();
	}

	/*** FirstName ***/
	@FindBy(id = "FirstName")
	WebElement firstname;

	public void firstname(String f_name) {
		firstname.sendKeys(f_name);
	}

	/*** LastName ***/
	@FindBy(id = "LastName")
	WebElement lastname;

	public void lastname(String l_name) {
		lastname.sendKeys(l_name);
	}

	/*** EmailID ***/
	@FindBy(id = "Email")
	WebElement email;

	public void Emailid(String E_Id) {
		email.sendKeys(E_Id);
	}

	/*** Password ***/
	@FindBy(id = "Password")
	WebElement pass;

	public void Password(String pas) {
		pass.sendKeys(pas);
	}

	/*** ConfirmePassword ***/
	@FindBy(id = "ConfirmPassword")
	WebElement cpass;

	public void Cpass(String C_pass) {
		cpass.sendKeys(C_pass);
	}

	/*** RegisterButton ***/
	@FindBy(id = "register-button")
	WebElement Registerbtn;

	public void Registerbtn() {
		Registerbtn.click();
	}

	/*** RegSucessMsg ***/
	@FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
	WebElement msg;

	public void SuccessMsg() {
		String expectedHeading = "Your registration completed";
		String actualHeading = msg.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println(msg.getText());
	}

	/*** ContinueButton ***/
	@FindBy(xpath = "//input[@class='button-1 register-continue-button']")
	WebElement continuebtn;

	public void Continuebtn() {
		continuebtn.click();
	}

	/*** ExistingEmailID ***/
	@FindBy(xpath = "//li[contains(text(),'The specified email already exists')]")
	WebElement error1;

	public void ExistingIDMsg() {
		String expectedHeading = "The specified email already exists";
		String actualHeading = error1.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println(error1.getText());
	}

	/*** InvalidEmailID ***/
	@FindBy(xpath = "//span[contains(text(),'Wrong email')]")
	WebElement error2;

	public void InvalidIdMsg() {
		String expectedHeading = "Wrong email";
		String actualHeading = error2.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println(error2.getText());
	}

	/*** DiffConfirmePass ***/
	@FindBy(xpath = "//span[contains(text(),'The password and confirmation password do not match.')]")
	WebElement error3;

	public void Passnotmatch() {
		String expectedHeading = "The password and confirmation password do not match.";
		String actualHeading = error3.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println(error3.getText());
	}

}
