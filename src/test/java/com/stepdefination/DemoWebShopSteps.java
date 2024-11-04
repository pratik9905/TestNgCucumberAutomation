package com.stepdefination;

import com.demowebshop.base.BaseClass;
import com.demowebshop.pages.DemoWebShopPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWebShopSteps extends BaseClass {
	DemoWebShopPage dw;

	@Given("User launch the url")
	public void user_launch_the_url() {
		setBrowser();
		dw = new DemoWebShopPage(driver);

	}

	@When("User login with valid credentials")
	public void user_login_with_valid_credentials() {
		performLogin("pratikkumar734@gmail.com", "Pk577292@");

	}

	@When("User click on books link")
	public void user_click_on_books_link() {
		dw.books();

	}

	@When("User click on add to cart for computing and internet books")
	public void user_click_on_add_to_cart_for_computing_and_internet_books() {
		dw.addtocard();

	}

	@When("Click on shopping cart on the top")
	public void click_on_shopping_cart_on_the_top() {
		dw.shoppingcart();

	}

	@When("User Enable the check box I agree then click on check out")
	public void user_enable_the_check_box_i_agree_then_click_on_check_out() {
		dw.Agree();
		dw.Checkoutbtn();

	}

	@When("User click on continue until all the steps complete")
	public void user_click_on_continue_until_all_the_steps_complete() throws InterruptedException {
		dw.Continuebtn1();
		Thread.sleep(3000);
		dw.Pickup();
		Thread.sleep(3000);
		dw.Continuebtn2();
		Thread.sleep(3000);
		dw.Continuebtn3();
		Thread.sleep(3000);
		dw.Continuebtn4();
		Thread.sleep(3000);
		dw.Confirmeorder();
		Thread.sleep(3000);

	}

	@When("Click on order link Validate same order number should be available")
	public void click_on_order_link_validate_same_order_number_should_be_available() throws InterruptedException {
		dw.orderdetails();
		Thread.sleep(3000);

	}

	@When("Verify the generated pfd details and click on PDF button")
	public void verify_the_generated_pfd_details_and_click_on_pdf_button() {

		dw.PdfInvoice();

	}

	@Then("Click on logout")
	public void click_on_logout() {

	}

}
