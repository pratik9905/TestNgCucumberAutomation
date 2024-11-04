package com.demowebshop.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	public WebDriver driver;

	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Sho']")
	private WebElement DemoWebShopLogo;

	@FindBy(xpath = "//a[@class='ico-register']")
	private WebElement RegisterBtn;

	@FindBy(xpath = "//h1[normalize-space()='Register']")
	private WebElement RegisterPage;

	@FindBy(xpath = "//div[@class='']")
	private List<WebElement> AllSearchProduct;

	@FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
	private WebElement LoginPage;

	@FindBy(className = "ico-login")
	private WebElement LoginBtn;

	@FindBy(className = "cart-label")
	private WebElement CartBtn;

	@FindBy(xpath = "//*/a[contains(text(),'Books')][1]")
	private WebElement BooksBtn;

	@FindBy(xpath = " //span[normalize-space()='Shopping cart']")
	private WebElement ShoppingCart;

	@FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
	private WebElement WhisListPage;

	@FindBy(xpath = "//span[normalize-space()='Wishlist']")
	private WebElement WishList;

	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchBox;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyLogo() {
		return DemoWebShopLogo;
	}

	public void clickOnRegister() {
		RegisterBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Clicked on Register button");
	}

	public void verifyRegisterPge() {
		String Expected = "Register";
		String Actual = RegisterPage.getText();
		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual);
	}

	public void clickOnLogInBtn() {
		LoginBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Clicked on LoginBtn");
	}

	public void verifyLoginPge() {
		String Expected = "Welcome, Please Sign In!";
		String Actual = LoginPage.getText();
		Assert.assertEquals(Expected, Actual);
	}

	public void verifyWhisListPge() {
		String Expected = "Shoping cart";
		String Actual = WhisListPage.getText();
		Assert.assertEquals(Expected, Actual);
	}

	public void listOfProduct() {
		for (WebElement product : AllSearchProduct)
			System.out.println(product.getText());
	}

	public void clickOnShopngCrt() {
		CartBtn.click();
		System.out.println("Clicked on Shopping Cart");
	}

	public void clickOnWhishlist() {
		WishList.click();
		System.out.println("Clicked on Whistlist");
	}

	public void verifyOnSearchBar(String value) {
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys(value);
		System.out.println("Entered the " + value + " in search Bar");
	}

	public void clickOnSearchBtnWithoutInputs() {
		searchBox.click();
		searchBox.clear();
		searchButton.click();
	}

	public void clickOnSearchBtnWithInputs() {
		searchButton.click();
		System.out.println("Successfully clicked on searchBtn");
	}

	// check all items in list category should print
	public void categorieslist() throws InterruptedException {
		List<WebElement> lists = driver.findElements(By.xpath("//li[@class='inactive']"));
		for (WebElement listproduct : lists) {
			String text = listproduct.getText();
			Thread.sleep(4000);
			System.out.println(text);
		}
	}
}
