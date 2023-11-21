package BrowserControlMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Navigation_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.get("https://www.ebay.co.uk/");
		
		System.out.println(driver.getTitle());
		
		//To navigate back
		driver.navigate().back();
		Thread.sleep(3000);
		
		//To navigate forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//To refresh the page
		driver.navigate().refresh();
		
		
		
		driver.close();	
		
		
	}

}
