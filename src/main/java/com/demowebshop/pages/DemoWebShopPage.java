package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.util.UtilClass;

public class DemoWebShopPage {
	UtilClass uc;

	public DemoWebShopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*** BooksLink ***/
	@FindBy(xpath = "(//a[@href='/books'])[3]")
	WebElement booklnk;

	public void books() {
		booklnk.click();
	}

	/*** AddtoCardbutton ***/
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	WebElement addbtn;

	public void addtocard() {
		addbtn.click();
	}

	/*** Shoppingcartbutton ***/
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	WebElement shoppingbtn;

	public void shoppingcart() {
		shoppingbtn.click();
	}

	/*** AgreeCheckBox ***/
	@FindBy(id = "termsofservice")
	WebElement agree;

	public void Agree() {
		agree.click();
	}

	/*** ChekoutButton ***/
	@FindBy(id = "checkout")
	WebElement checkout;

	public void Checkoutbtn() {
		checkout.click();
	}

	/*** CompanyName ***/
	@FindBy(id = "BillingNewAddress_Company")
	WebElement company;

	public void Companyname(String c_name) {
		company.sendKeys(c_name);
	}

	/*** CountryDropDown ***/
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement country;

	public void Country(String c_ountry) {
		country.click();
		UtilClass uc = new UtilClass();
		uc.dropdown(country, c_ountry);
	}

	/*** CityName ***/
	@FindBy(id = "BillingNewAddress_City")
	WebElement city;

	public void City(String city_n) {
		city.sendKeys(city_n);
	}

	/*** Address1 ***/
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement add;

	public void Address1(String add_rs) {
		add.sendKeys(add_rs);
	}

	/*** Zipcode ***/
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zipcode;

	public void Zipcode(String zip_c) {
		zipcode.sendKeys(zip_c);
	}

	/*** PhoneNumber ***/
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement no;

	public void Phonenumber(String P_num) {
		no.sendKeys(P_num);
	}

	/*** Continuebutton ***/
	@FindBy(xpath = "(//input[@title='Continue'])[2]")
	WebElement con1;

	public void Continuebtn2() {
		con1.click();
	}

	/*** Continuebutton ***/
	@FindBy(xpath = "(//input[@class='button-1 new-address-next-step-button'])[1]")
	WebElement con2;

	public void Continuebtn1() {
		con2.click();
	}

	/*** Continuebutton ***/
	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	WebElement con3;

	public void Continuebtn3() {
		con3.click();
	}

	/*** Continuebutton ***/
	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	WebElement con4;

	public void Continuebtn4() {
		con4.click();
	}

	/*** Pickupcheckbox ***/
	@FindBy(id = "PickUpInStore")
	WebElement pick;

	public void Pickup() {
		pick.click();
	}

	// callcontinuebtn

	/*** Paymentmethod ***/
	@FindBy(id = "paymentmethod_0")
	WebElement pay;

	public void Cashon() {
		pay.click();
	}
	// callcontinuebtn
	// callcontinuebtn

	/*** Confirmeorder ***/
	@FindBy(xpath = "(//input[@class='button-1 confirm-order-next-step-button'])[1]")
	WebElement order;

	public void Confirmeorder() {
		order.click();
	}

	/*** orderdetailslink ***/
	@FindBy(xpath = "//a[contains(text(),'Click here for order details.')]")
	WebElement orderlnk;

	public void orderdetails() {
		orderlnk.click();
	}

	/*** PDFinvoicebutton ***/
	@FindBy(xpath = "//a[contains(text(),'PDF Invoice')]")
	WebElement pdfbtn;

	public void PdfInvoice() {
		pdfbtn.click();
	}

	/*** Logoutbutton ***/
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logoutbtn;

	public void Logoutbtn() {
		logoutbtn.click();
	}

}
