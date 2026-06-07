package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.DriverFactory;

public class ActionUtils {
	
	public void hover(WebElement element) {

        Actions actions =
                new Actions(DriverFactory.getDriver());

        actions.moveToElement(element)
               .perform();
    }

    public void doubleClick(WebElement element) {

        Actions actions =
                new Actions(DriverFactory.getDriver());

        actions.doubleClick(element)
               .perform();
    }

    public void rightClick(WebElement element) {

        Actions actions =
                new Actions(DriverFactory.getDriver());

        actions.contextClick(element)
               .perform();
    }
}
