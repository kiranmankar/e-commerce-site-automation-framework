package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseTest {
	
	@BeforeMethod
    public void setup() {

        DriverFactory.initDriver(
                ConfigReader.getProperty("browser"));

        DriverFactory.getDriver().get(
                ConfigReader.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}
