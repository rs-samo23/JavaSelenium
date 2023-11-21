package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_dependent {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		
	//	Steps to locate the static and dynamic WebElement
	//	Fetching the price of the product
		String price=driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']/../..//span")).getText();
		
		if(price.equals("11.00"))
		{
			System.out.println("Test case passed");
		}
		else
			System.out.println("Test case failed");
		
	//	System.out.println(price);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
