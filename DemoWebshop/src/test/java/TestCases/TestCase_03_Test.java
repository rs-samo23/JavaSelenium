package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_Library.BaseTest;
import pomrepository.Homepage;

public class TestCase_03_Test extends BaseTest {
	
	
	@Test(groups="System")
	public void wishList() throws InterruptedException {
	
		Homepage hp = new Homepage(driver);
	
	driver.findElement(By.partialLinkText("Books")).click();
	
	driver.findElement(By.linkText("Fiction EX")).click();
	
	WebElement wishListButton=driver.findElement(By.xpath("//input[@value='Add to wishlist']"));
	
	System.out.println(wishListButton.isDisplayed());

}
}
