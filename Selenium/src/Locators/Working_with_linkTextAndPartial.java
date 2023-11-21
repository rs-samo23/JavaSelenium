package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_linkTextAndPartial {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//by using linkText
		//must be present inside the <a> tag
//		driver.findElement(By.linkText("Forgot your password?")).click();	
		
		//by using partialLinkText
		driver.findElement(By.partialLinkText("password?")).click();
		
	}

}
