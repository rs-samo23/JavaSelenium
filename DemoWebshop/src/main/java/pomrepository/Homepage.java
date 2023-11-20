package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	
	@FindBy(partialLinkText="Digital Downloads")
	private WebElement digitalDownloadsLink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	
	
	

}
