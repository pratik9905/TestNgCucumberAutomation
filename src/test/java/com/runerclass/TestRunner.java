package com.runerclass;

import com.demoShop.extent.ExtentManager;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\Features" },

		glue = { "com.stepdefination", "hooks" }, monochrome = true,

		plugin = { "pretty", "html:target/Cucumber_Reports/report.html",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunner extends AbstractTestNGCucumberTests {
	// Initialize extent report
	static {
		ExtentManager.getInstance();
	}
}