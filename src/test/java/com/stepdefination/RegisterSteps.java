package com.stepdefination;

import com.demowebshop.base.BaseClass;
import com.demowebshop.pages.RegistrationPage;
import com.demowebshop.util.UtilClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseClass {
	RegistrationPage rp;

	@Given("user is on Homepage")
	public void user_is_on_homepage() {
		setBrowser();
		rp = new RegistrationPage(driver);

	}

	@When("user click the registration button link")
	public void user_click_the_registration_button_link() {
		rp.registerlink();

	}

	@Then("user user enters the following details")
	public void user_user_enters_the_following_details() {
		rp.firstname(UtilClass.getProperty("valid_firstN"));
		rp.lastname(UtilClass.getProperty("valid_lastN"));
		rp.Emailid(UtilClass.getProperty("valid_emailId"));
		rp.Password(UtilClass.getProperty("valid_pass"));
		rp.Cpass(UtilClass.getProperty("valid_C_pass"));
		rp.Registerbtn();
		// rp.SuccessMsg();
		// rp.Continuebtn();
		rp.ExistingIDMsg();

	}

	@Then("user user enters the following invalid details")
	public void user_user_enters_the_following_invalid_details() {
		rp.firstname(UtilClass.getProperty("valid_firstN"));
		rp.lastname(UtilClass.getProperty("valid_lastN"));
		rp.Emailid(UtilClass.getProperty("Invalid_Email"));
		rp.Password(UtilClass.getProperty("valid_pass"));
		rp.Cpass(UtilClass.getProperty("valid_C_pass"));
		rp.Registerbtn();
		rp.InvalidIdMsg();

	}

	@Then("user user enters the differnet confirme password and following  details")
	public void user_user_enters_the_differnet_confirme_password_and_following_details() {
		rp.firstname(UtilClass.getProperty("valid_firstN"));
		rp.lastname(UtilClass.getProperty("valid_lastN"));
		rp.Emailid(UtilClass.getProperty("valid_emailId"));
		rp.Password(UtilClass.getProperty("valid_pass"));
		rp.Cpass(UtilClass.getProperty("Invaild_Pass"));
		rp.Registerbtn();
		rp.Passnotmatch();

	}

	@Then("user user enters the existing emailId and following  details")
	public void user_user_enters_the_existing_email_id_and_following_details() {

		rp.firstname(UtilClass.getProperty("valid_firstN"));
		rp.lastname(UtilClass.getProperty("valid_lastN"));
		rp.Emailid(UtilClass.getProperty("Existing_Email"));
		rp.Password(UtilClass.getProperty("valid_pass"));
		rp.Cpass(UtilClass.getProperty("valid_C_pass"));
		rp.Registerbtn();
		rp.ExistingIDMsg();

	}

}
