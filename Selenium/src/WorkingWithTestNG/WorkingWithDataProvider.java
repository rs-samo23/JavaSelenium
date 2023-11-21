package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	
	@Test
	public void testCase() throws InterruptedException {
	
			//Launch browser
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/");
			
			//Login
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("sam@testing.com");
			driver.findElement(By.id("Password")).sendKeys("Sam1234");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
			Thread.sleep(4000);
			driver.close();
	}
	
	@DataProvider(name="dataSupply")
	public Object[][] dataSupply()
	{
		Object [][] arr=new Object [3][2];
		arr[0][0]="admin";
		arr[0][1]="password";
		arr[1][0]="admin1";
		arr[1][1]="password1";
		arr[2][0]="admin2";
		arr[2][1]="password2";
		return arr;
	}
	
}
