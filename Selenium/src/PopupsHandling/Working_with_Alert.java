package PopupsHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		Alert alt=driver.switchTo().alert();
		
		//To fetch the message
//		String message=alt.getText();
//		System.out.println(message);
		
		//To click on OK button
//		alt.accept();
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
//		String message=driver.switchTo().alert().getText();
//		System.out.println(message);
		
//		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		driver.switchTo().alert().sendKeys("Selenium123");
		
		driver.switchTo().alert().accept();
		
				
	}

}
