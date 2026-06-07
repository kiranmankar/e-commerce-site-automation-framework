package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement backpackAddBtn;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement cartIcon;
	
	@FindBy(className = "title")
	private WebElement productsTitle;
	
	public String getPageTitle() {
		return productsTitle.getText();
	}
	
	public void addBackpackToCart() {
		backpackAddBtn.click();
	}
	
	public void openCart() {
		cartIcon.click();
	}

}
