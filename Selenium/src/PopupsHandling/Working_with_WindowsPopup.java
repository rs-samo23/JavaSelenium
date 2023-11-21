package PopupsHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_WindowsPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();//(opt)
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println(driver.getTitle());
		
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("//Facebook")).click();
		
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.quit(); //two tabs opened so use quit	
		
		//Fetch session ID of main page
		String mainId=driver.getWindowHandle();
		
		System.out.println(mainId);
		
		driver.findElement(By.linkText("Facebook")).click();
		
		driver.findElement(By.linkText("Twitter")).click();
		
		//Fetch session ID of all tabs
		Set<String>allId=driver.getWindowHandles();
		
		System.out.println(allId);
		
		
		for(String id:allId) {
			
			//used to change the driver focus
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
				
	}

}
