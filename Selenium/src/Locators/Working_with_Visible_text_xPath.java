package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Visible_text_xPath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		
		WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		
		if(checkBox.isSelected())
		{	
		System.out.println("CheckBox is selected");
	    }
		else
		System.out.println("CheckBox is NOT selected");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("actiTIME - Login"))	
		{
			System.out.println("Testcase Passed");
		}
		else
			System.out.println("TestCase Failed");
		
		driver.close();
	}

}
