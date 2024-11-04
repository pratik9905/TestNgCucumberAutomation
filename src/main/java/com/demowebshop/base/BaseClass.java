package com.demowebshop.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod
	public void setBrowser() {

		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
 @AfterMethod
 public void tearDown() {
     if (driver != null) {
         driver.quit();
     }
 }


	By Loginlink = By.xpath("//a[@class='ico-login']");
	By usernameField = By.id("Email");
	By passwordField = By.id("Password");
	By rememberme = By.id("RememberMe");
	By loginButton = By.xpath("//input[@class='button-1 login-button']");

	public void performLogin(String username, String password) {
		driver.findElement(Loginlink).click();
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(rememberme).click();
		driver.findElement(loginButton).click();
	}
}