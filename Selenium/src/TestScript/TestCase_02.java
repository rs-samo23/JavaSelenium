package TestScript;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class TestCase_02 {
		
	public static void main(String[] args) throws InterruptedException {
			
			//Step 1 : To launch the browser
			
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
			
			//Step 3 : To navigate to Digital downloads
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			
			if(driver.getTitle().equals("Demo Web Shop. Digital downloads"))
			{
				System.out.println("Digital downloads page is displayed");
			}
			else
				System.out.println("Digital downloads page is not displayed");
			
			//Step 4: Located all AddToCart buttons
			List<WebElement> allProducts=driver.findElements(By.xpath("//input[@value='Add to cart']"));
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			//Step 5: To Add all the products to the cart
			for(WebElement product : allProducts )
			{
				product.click();	
				wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//a[text()='shopping cart']"))));
				Thread.sleep(1000);
			}
			
			//Step 6: To navigate to shopping cart
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			
			if(driver.getTitle().equals("Demo Web Shop. Shopping Cart"))
			{
				System.out.println("Shopping Cart page displayed");
			}
			else
				System.out.println("Shopping cart page not displayed");
			
			List<WebElement> cartProducts=driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
			
			//Step 7: Validate the number of products in shopping cart
			if(allProducts.size()==cartProducts.size())
			{
				System.out.println("AddToCart Test Case Pass");
			}
			else
				System.out.println("AddToCart Test Case Fail");
			
			//Step 8: To close the browser
			driver.close();
		}

	}

