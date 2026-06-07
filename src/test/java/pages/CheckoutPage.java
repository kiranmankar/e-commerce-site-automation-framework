package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	@FindBy(id = "finish")
	private WebElement finishButton;
	
	@FindBy(className = "complete-header")
	private WebElement successMessage;
	
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void enterPostalCode(String code) {
		postalCode.sendKeys(code);
	}
	
	public void clickContinue() {
		continueButton.click();
	}
	
	public void clickFinish() {
		finishButton.click();
	}
	
	public String getSuccessMessage() {
		return successMessage.getText();
		}
	
	public void completeCheckout(
            String fname,
            String lname,
            String code) {

        enterFirstName(fname);
        enterLastName(lname);
        enterPostalCode(code);
        clickContinue();
        clickFinish();
    }
	}


