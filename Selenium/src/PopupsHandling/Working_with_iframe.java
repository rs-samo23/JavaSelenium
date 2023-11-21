package PopupsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_iframe {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
//		driver.switchTo().frame(0);
		
//		driver.switchTo().frame("mce_0_ifr");
		
		WebElement frameWebElement=driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		
		//To change the driver focus by using Web element
		driver.switchTo().frame(frameWebElement);
		
		String message=driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(message);
		
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
//		driver.close();
	}

}
