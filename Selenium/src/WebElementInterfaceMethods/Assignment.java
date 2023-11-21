package WebElementInterfaceMethods;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("rakesh1111@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rakesh1111@gmail.com");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		
		WebElement singleSelectDropdown=driver.findElement(By.id("products-orderby"));
		
		Select s = new Select(singleSelectDropdown);
		Thread.sleep(2000);
		s.selectByIndex(3);
		
		List<WebElement>allProductPrice = driver.findElements(By.xpath("//span[@class='price actual-price']"));
		
		for(WebElement productPrice : allProductPrice) {
			
			System.out.println(productPrice.getText());
			
		}

		driver.close();

	}
	
}
