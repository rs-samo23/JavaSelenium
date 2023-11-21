package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_task {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.findElement(By.xpath("//a[text()='Ok']")).click();
		
		driver.switchTo().frame(0);
		
//		WebElement frameWebElement=driver.findElement(By.xpath("//iframe[@//name='iframe_a']"));
		
		driver.findElement(By.xpath("(//a[text()='Free Mock Tests'])[2]")).click();
		
//		driver.switchTo().frame(1).getTitle();
		
//		driver.switchTo().defaultContent().getTitle();
		
		Set<String> allId=driver.getWindowHandles();
		
		for(String id:allId) {
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(3000);
		}
		
		driver.close();
			
		
	}

}
