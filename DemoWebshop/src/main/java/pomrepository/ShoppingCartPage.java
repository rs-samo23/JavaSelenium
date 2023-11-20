package pomrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ShoppingCartPage {

	@FindBy(partialLinkText="Digital downloads")
	private WebElement digitaldownloadsTextField;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCartbutton;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShoppingCartButton;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath="//input[@id='register-button']")
	private WebElement registerButton;
	
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getgenderTextField() {
		return genderTextField;
	}	
	public WebElement getfirstnameTextField() {
		return firstnameTextField;
	}		
	public WebElement getlastnameTextField() {
		return lastnameTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getpasswordTextField() {
		return passwordTextField;
	}
	public WebElement getconfirmPasswordTextField() {
		return confirmPasswordTextField;	
	}
	public WebElement getregisterButton() {
		return registerButton;
		
	}
	
	
	
	

	
//	
//	for(WebElement product : allProducts )
//	{
//		product.click();	
//		um.waitUntilInvisibilityOfElement(driver,driver.findElement(By.xpath("//a[text()='shopping cart']")));
//		Thread.sleep(1000);
//	}
//	
//	
//	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
//	
//	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart");
//	Reporter.log("Shopping Cart page displayed", true);
//	
//	List<WebElement> cartProducts=driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
//	
//	Assert.assertEquals(allProducts.size(), cartProducts.size());
//	Reporter.log("AddToCart Test Case Pass", true);
//	um.takeScreenshot(driver, "AddToCartTestCase");


}
