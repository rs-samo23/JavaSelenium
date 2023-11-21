package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_implicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//applicable for entire script, no need for thread.sleep
		driver.get("https://www.instagram.com/");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		
//		Thread.sleep(3000);
			
		driver.findElement(By.name("username")).sendKeys("Sam");
		driver.findElement(By.name("password")).sendKeys("Sam123");
		
	}

}
