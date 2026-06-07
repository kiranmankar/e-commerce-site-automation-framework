package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverFactory;

public class WaitUtils {
	
	private WebDriverWait wait;

    public WaitUtils() {

        WebDriver driver = DriverFactory.getDriver();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));
    }

    public void waitForVisibility(WebElement element) {

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickable(WebElement element) {

        wait.until(
                ExpectedConditions.elementToBeClickable(element));
    }
}
