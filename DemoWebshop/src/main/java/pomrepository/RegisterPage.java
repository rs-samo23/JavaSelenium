package pomrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

		@FindBy(xpath="//input[@id='gender-male']")
		private WebElement genderTextField;
		
		@FindBy(xpath="//input[@id='FirstName']")
		private WebElement firstnameTextField;
		
		@FindBy(xpath="//input[@id='LastName']")
		private WebElement lastnameTextField;
		
		@FindBy(xpath="//input[@id='Email']")
		private WebElement emailTextField;
		
		@FindBy(xpath="//input[@id='Password']")
		private WebElement passwordTextField;
		
		@FindBy(xpath="//input[@id='ConfirmPassword']")
		private WebElement confirmPasswordTextField;
		
		@FindBy(xpath="//input[@id='register-button']")
		private WebElement registerButton;
		
		public RegisterPage(WebDriver driver)
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
		
}

