package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Generic_Library.BaseTest;
import pomrepository.Homepage;

public class TestCase_04_Test extends BaseTest {
	
public void testcase04() throws InterruptedException

{
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	
	Homepage hp=new Homepage(driver);
	hp.getShoppingCartLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");
	Reporter.log("Shopping Cart page displayed",true);
//	SoftAssert sa = new SoftAssert();
//	sa.assertNotEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart");

	List<WebElement> allRemoveCheckBox = driver.findElements(By.xpath("//tr[@class='cart-item-row'//input[@type='checkbox']"));

	for(WebElement removeCheckBox : allRemoveCheckBox)
	{
		removeCheckBox.click();		
	}
	
	driver.findElement(By.name("updatecart")).click();
	allRemoveCheckBox = driver.findElements(By.xpath("//tr[@class='cart-item-row'//input[@type='checkbox']"));
	
//	sa.assertEquals(allRemoveCheckBox.size(), 0);
	Assert.assertEquals(allRemoveCheckBox.size(),0);
	Reporter.log("Empty Cart Test Case Pass",true);
	
//	sa.assertAll();
	
}

}
