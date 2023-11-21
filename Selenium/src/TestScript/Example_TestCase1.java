package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_TestCase1 {

	public static void main(String[] args) {
		
		//Test Data
		String expTitle="actiTIME - Login";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		if(driver.getTitle().equals(expTitle)) {
			System.out.println("Test Case is Passed");
		}
		else
			System.out.println("Test Case is Failed");
		
		driver.close();
		
			
		
	}

}
