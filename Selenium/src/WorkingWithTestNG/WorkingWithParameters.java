package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingWithParameters {
	
	@Parameters({"email","password"})
	@Test
	public void testCase() {
		
		//Launch browser
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		//perform login
		driver.findElement(By.id("Email")).sendKeys("sam@testing.com");
		driver.findElement(By.id("Password")).sendKeys("Sam1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
