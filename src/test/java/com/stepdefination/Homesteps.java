package com.stepdefination;

import java.time.Duration;

import com.demowebshop.base.BaseClass;
import com.demowebshop.pages.HomePage;

import io.cucumber.java.en.*;

public class Homesteps extends BaseClass {
		
	HomePage hp;
	@Given("User is on DemoWebShop WebPage")
	public void user_is_on_demo_web_shop_web_page() {
	   setBrowser();
	}

    // Scenario: Verify The Logo of Home Page
   
    
    @When("User verify the Logo Of The Page")
    public void user_verify_the_logo_of_the_page() {
    	hp = new HomePage(driver);
    	hp.verifyLogo();
    }
    @Then("user Verify the Category List")
    public void user_verify_the_category_list() throws InterruptedException {
    	hp = new HomePage(driver);
    	hp.categorieslist();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    // Scenario: Verify Register Button is Clickable
    @When("User Click on Register Button")
    public void userClicksOnRegisterButton() throws InterruptedException {
    	hp = new HomePage(driver);
    	hp.clickOnRegister();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Then("Verify the Register Page")
    public void verifiesTheRegisterPage() {
    	hp = new HomePage(driver);
    	hp.verifyRegisterPge();
    }

    // Scenario: Verify Login Button is Clickable
    @When("User Click on Login Button")
    public void userClicksOnLoginButton() {
    	hp = new HomePage(driver);
    	hp.clickOnLogInBtn();
    }

    @Then("Verify The Login Page")
    public void verifiesTheLoginPage() {
    	hp = new HomePage(driver);
    	hp.verifyLoginPge();
    }

    // Scenario: Verify Shopping Cart Button Is Clickable
    @When("User Click on Shoping Cart Button")
    public void userClicksOnShoppingCartButton() {
    	hp = new HomePage(driver);
    	hp.clickOnShopngCrt();
    }

    @Then("Verify The Shoping Cart Button")
    public void verifiesTheShoppingCartButton() {
    	hp = new HomePage(driver);
    	hp.verifyWhisListPge();
    }
    

    // Scenario: Verify Search Functionality with Valid Keyword
    @When("User enters {string}")
    public void userEntersKeyword(String keyword) throws InterruptedException{
    	hp = new HomePage(driver);
    	hp.verifyOnSearchBar(keyword);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	}

    @When("User Should click Search Button")
    public void userShouldClickSearchButton() throws InterruptedException {
    	hp = new HomePage(driver);
    	hp.clickOnSearchBtnWithInputs();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Then("Verify the display of The Search Results")
    public void verifiesTheDisplayOfTheSearchResults() {
    	hp = new HomePage(driver);
    	hp.listOfProduct();
    }

    // Scenario: Verify the Search Functionality with Empty Keyword
    @Then("User Should click button")
    public void userShouldClickSearchButtonForEmptyKeyword() {
    	hp = new HomePage(driver);
    	hp.clickOnSearchBtnWithoutInputs();
    	
    }

    @Then("user accept the Prompt Message")
    public void user_accept_the_Prompt_Message() {
    	
    	driver.switchTo().alert().accept();
		 System.out.println("Succesfully Clicked on SearchBtn and accepted the Prompt");
	 
    }
}
