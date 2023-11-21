package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAsssignment {

	public static void main(String[] args) {

				String expTitle="Electronics, Cars, Fashion, Collectibles &amp; More | eBay";

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.ebay.co.uk/");
				
				if(driver.getTitle().equals(expTitle)) {
					System.out.println("Test Case is Passed");
				}
				else
					System.out.println("Test Case is Failed");
				
				driver.close();
				
	}

}
