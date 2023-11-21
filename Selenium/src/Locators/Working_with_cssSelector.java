package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_cssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		
		//advanced way
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		
//		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("[for='keepLoggedInCheckBox']")).click();
		
		driver.findElement(By.cssSelector("[class='initial']")).click();
		
		driver.findElement(By.cssSelector("#loginButton")).click();
		
		
	}

}
