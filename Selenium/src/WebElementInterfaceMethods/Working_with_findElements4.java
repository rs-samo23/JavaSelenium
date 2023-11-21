package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_findElements4 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("rakesh1111@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rakesh1111@gmail.com");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.partialLinkText("Books")).click();
		
	//	List<WebElement>allProductName = driver.findElement(By.xpath("//h2[@class='product-title']//a"));
	//	List<WebElement>allProductPrice = driver.findElements(By.xpath("//div[@class='prices']"));
		List<WebElement>allProductPrice = driver.findElements(By.xpath("//span[@class='price actual-price']"));
		
		
		for(WebElement productPrice : allProductPrice) {
			
			System.out.println(productPrice.getText());
		}
		
		driver.close();
	}

}
