package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_Library.BaseTest;
import pomrepository.Homepage;

public class TestCase_01_Test extends BaseTest {

	@Test(groups="Functional")
	public void Registration() {
		
		driver.findElement(By.linkText("Log out")).click();// due to logging in the base test
		
		Homepage hp = new Homepage(driver);
		hp.getRegisterLink().click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sam");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sam@testing.com");

		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sam1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sam1234");
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	}

}
