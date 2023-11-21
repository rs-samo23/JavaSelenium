package BrowserControlMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Quit {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Sam/OneDrive/Documents/Selenium_UK_batch/Multiple%20Windows.html");
		
		driver.findElement(By.xpath("//button[text()='Open Windows']")).click();
		
		driver.quit();
//		driver.close();
	}

}
