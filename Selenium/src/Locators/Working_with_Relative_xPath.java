package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Relative_xPath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sam/OneDrive/Documents/Selenium_UK_batch/RegistrationPage.html");
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[2]")).sendKeys("Manager");
		driver.findElement(By.xpath("//input[3]")).sendKeys("RelativexPath@Email.com");
		driver.findElement(By.xpath("//input[4]")).click();//gender Male
		driver.findElement(By.xpath("//input[7]")).click();//click T&C checkbox
		
	}

}
