package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "inventory_item_name")
	private WebElement productName;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	@FindBy(className = "title")
	private WebElement cartTitle;
	
	public String getProductName() {
		return productName.getText();
	}
	
	public void clickCheckout() {
		checkoutButton.click();
	}
	
	public String getCartTitle() {
	    return cartTitle.getText();
	}

}
