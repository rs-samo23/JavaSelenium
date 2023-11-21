package Synchronisation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_2 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//applicable for just findElement(s) method
		driver.get("https://demowebshop.tricentis.com/");

//		driver.findElement(By.xpath("//button[text()='Allow all cookies']")).click();
		
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		
		List<WebElement> allAddCart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		for(WebElement addCart:allAddCart) {
			addCart.click();
			
			try {
				
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.partialLinkText("Digital downloads"))));
			
			}catch(TimeoutException e) {
				System.out.println("Condition not satisfied");
		}

	}

}

}
