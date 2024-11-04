package com.stepdefination;

import com.demowebshop.base.BaseClass;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.util.UtilClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends BaseClass {
	LoginPage lp;

	@Given("user launch Url")
	public void user_launch_url() {
		setBrowser();
		lp = new LoginPage(driver);
	}

	@When("Click the login link")
	public void click_the_login_link() {
		lp.clickloginlink();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		lp.EmailID.sendKeys(string);
		lp.password.sendKeys(string2);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		lp.Remember();
		lp.clickloginbtn();
	}

	@Then("click the logout button")
	public void click_the_logout_button() {
		lp.Logoutbtn();
	}

}
