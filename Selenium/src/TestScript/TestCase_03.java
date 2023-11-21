package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_03 {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	
	//Step 2 : To perform login
	driver.findElement(By.linkText("Log in")).click();
	
	if(driver.getTitle().equals("Demo Web Shop. Login"))
	{
		System.out.println("Login Page Displayed");
	}
	else
		System.out.println("Login Page not Displayed");
	
	driver.findElement(By.id("Email")).sendKeys("sam@testing.com");
	driver.findElement(By.id("Password")).sendKeys("Sam1234");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
	//Step 3 To navigate to Books page
	driver.findElement(By.partialLinkText("Books")).click();
	
	driver.findElement(By.linkText("Fiction EX")).click();
	
	WebElement wishListButton=driver.findElement(By.xpath("//input[@value='Add to wishlist']"));
	
	System.out.println(wishListButton.isDisplayed());

}
}
