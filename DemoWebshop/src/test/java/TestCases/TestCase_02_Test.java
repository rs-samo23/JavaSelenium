package TestCases;

	import java.io.IOException;
import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Library.BaseTest;
import pomrepository.Homepage;
	
	public class TestCase_02_Test extends BaseTest {
	
		@Test (groups="Smoke")
		public void addToCart () throws InterruptedException, IOException {
			
			Homepage hp = new Homepage(driver);
			hp.getDigitalDownloadsLink().click();
			
			Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Digital downloads" );
			Reporter.log("Digital downloads page is didplayed,true");
			
			List<WebElement> allProducts=driver.findElements(By.xpath("//input[@value='Add to cart']"));
					
			for(WebElement product : allProducts )
			{
				product.click();	

				um.waitUntilInvisibilityOfElement(driver,driver.findElement(By.xpath("//a[text()='shopping cart']")));
				Thread.sleep(1000);
			}
						
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			
			Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart");
			Reporter.log("Shopping Cart page displayed", true);
			
			List<WebElement> cartProducts=driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
			
			Assert.assertEquals(allProducts.size(), cartProducts.size());
			Reporter.log("AddToCart Test Case Pass", true);
			um.takeScreenshot(driver, "AddToCartTestCase");
	
		}

	}

