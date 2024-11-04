package com.demowebshop.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilClass {
	WebDriver driver;
	Actions actions;

	public void Selenium(WebDriver driver) {
		this.driver = driver;
	}

	private static Properties properties;
	static {
		try {
			String filePath = "src/main/resources/Credential.properties";
			FileInputStream fis = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public void dropdown(WebElement coun, String text) {
		Select drpCountry = new Select(coun);
		drpCountry.selectByVisibleText(text);
	}

	public void alertHandle() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
}
