package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_01 {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sam");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sam@testing.com");

		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sam1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sam1234");
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	}

}
