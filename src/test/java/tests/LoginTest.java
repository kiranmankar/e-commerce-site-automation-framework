package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;
import pages.LoginPage;
import pages.ProductPage;
import utils.LoginDataProvider;

public class LoginTest extends BaseTest {
	
	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void verifyValidLogin(String username, String password) {
		
		LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
		
		loginPage.login(username, password);
		
		ProductPage productPage = new ProductPage(DriverFactory.getDriver());
		
		Assert.assertEquals(productPage.getPageTitle(), "Products");
		
	}

}
