package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class PurchaseTest extends BaseTest {
	
	private static final Logger logger =
	        LogManager.getLogger(
	                PurchaseTest.class);
	
	@Test
	public void verifyCompletePurchaseFlow() {
		
		LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
		
		logger.info("Logging into application");
		loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
		
		ProductPage productPage = new ProductPage(DriverFactory.getDriver());
		
		logger.info("Adding backpack to cart");
		productPage.addBackpackToCart();
		
		logger.info("Opening cart");
		productPage.openCart();
		System.out.println(
		        DriverFactory.getDriver().getCurrentUrl());
		
		CartPage cartPage = new CartPage(DriverFactory.getDriver());
		
		Assert.assertEquals(cartPage.getProductName(), "Sauce Labs Backpack");
		
		logger.info("Clicking checkout");
		cartPage.clickCheckout();
		
		CheckoutPage checkoutPage = new CheckoutPage(DriverFactory.getDriver());
		
		logger.info("Completing checkout");
		checkoutPage.completeCheckout("Kiran", "Mankar", "444303");
		
		logger.info("Validating order success message");
		
		Assert.assertEquals(checkoutPage.getSuccessMessage(), "Thank you for your order!");
	}

}
