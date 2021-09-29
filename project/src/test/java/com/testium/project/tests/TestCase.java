package com.testium.project.tests;

import com.testium.project.Log4j;
import com.testium.project.managers.PageManagerSingleton;
import com.testium.project.models.User;
import com.testium.project.pages.HomePage;
import com.testium.project.pages.LoginPage;
import com.testium.project.pages.ProductDetailsPage;
import com.testium.project.pages.SearchPage;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class TestCase {
	
	private static final String EMAIL = "@gmail.com";
	private static final String PASSWORD = "xxx";

	@Test
	public void test() throws InterruptedException {
		
		User user = new User(EMAIL, PASSWORD);
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		SearchPage searchPage = new SearchPage();
		ProductDetailsPage productDetailsPage = new ProductDetailsPage();
		Log4j.info("Go to Home Page");
		homePage.goToHomePage();	
        	assertEquals(PageManagerSingleton.getInstance().webDriverGetTitle() , PageManagerSingleton.getInstance().getWebsite());   
        	Log4j.info("Go to Login Page");
		homePage.openLoginPopUp().goToLoginPage();
		loginPage.setEmailAddressToTextbox(user.getEmail()).setPasswordAddressToTextbox(user.getPassword());
		loginPage.clickLoginButton();
        	//Giris Yaptiktan Sonra Ana Sayfaya Yonlendirilir
		Log4j.info("Go to Search Page");
		homePage.setSearchedValueToTextbox();
		homePage.clickSearchButton();
		Log4j.info("Go to Next Page");
		searchPage.goToNextPage();
		assertEquals(PageManagerSingleton.getInstance().webDriverGetTitle(), "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
		searchPage.selectItem();
		PageManagerSingleton.getInstance().scrollPage(500);
		Log4j.info("Go to Product Details Page");
		productDetailsPage.addToBasket();
		PageManagerSingleton.getInstance().scrollPage(500);
		Thread.sleep(3000);
		String pageComputerPrice = productDetailsPage.getPageComputerPrice();
		productDetailsPage.clickBasketButton();
		String basketComputerPrice = productDetailsPage.getBasketComputerPrice();
		assertEquals(basketComputerPrice, pageComputerPrice);
		productDetailsPage.addToBasket2();
		assertEquals(productDetailsPage.getBasketComputerNumber(), "2");
		productDetailsPage.deleteFromBasket();
		Thread.sleep(10000);
		System.out.println(productDetailsPage.isBasketEmpty());
		assertEquals(productDetailsPage.isBasketEmpty(), "Sepetinizde ürün bulunmamaktadır.");
	}	
	@After
	public void after() {
		PageManagerSingleton.getInstance().getWebDriver().quit();
		Log4j.info("Test is ending.");
	}
}
