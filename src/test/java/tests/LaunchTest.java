package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.DriverFactory;

public class LaunchTest extends BaseTest {
	
	@Test
	public void verifyApplicationLaunch() {
		
		String title = DriverFactory.getDriver().getTitle();
		
		Assert.assertTrue(title.contains("Swag Labs"));
	}

}
