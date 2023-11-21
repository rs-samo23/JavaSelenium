package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_idAndName {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//by using id
		WebElement userNameTF=driver.findElement(By.id("username"));
		userNameTF.sendKeys("admin");
		
		//by using name
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//Login button
		driver.findElement(By.className("initial")).click();
		
	}

}
