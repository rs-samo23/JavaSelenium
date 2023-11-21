package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_Fluent_wait {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='button00']")).click();
		
		driver.findElement(By.xpath("//button[@id='button01']")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Two']")));
		
		driver.findElement(By.xpath("//button[text()='Two']")).click();
		
		FluentWait fluentWait = new FluentWait(driver);
		fluentWait.pollingEvery(Duration.ofSeconds(1));
		fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("button03")));
		
		driver.findElement(By.xpath("//button[@id='button03']")).click();
		
		String message=driver.findElement(By.id("buttonmessage")).getText();
		
		System.out.println(message);
		
		driver.close();
	}

}

