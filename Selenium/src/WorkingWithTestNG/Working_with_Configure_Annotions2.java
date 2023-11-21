package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Working_with_Configure_Annotions2 {
	WebDriver driver;// make it global to access everywhere in the code
	
	@BeforeClass
	public void launchBrowser()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void performLogin()
	{
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("sam@testing.com");
		driver.findElement(By.id("Password")).sendKeys("Sam1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Test
	public void testCase01() throws InterruptedException
	{
		System.out.println("TestCase 01");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void testCase02() throws InterruptedException
	{
		System.out.println("TestCase 02");
		Thread.sleep(5000);
	}	
	
	@AfterMethod
	public void performLogout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
