package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sam");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("samtest@email.com");
		
		driver.findElement(By.xpath("//input[@data-val-length='The password should have at least 6 characters.']")).sendKeys("PassWord");
		driver.findElement(By.xpath("//input[@data-val-equalto='The password and confirmation password do not match.']")).sendKeys("PassWord");
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
				
	}

}
