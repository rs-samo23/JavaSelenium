package LearningJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		WebElement userNameTF=driver.findElement(By.id("user-name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='standard_user';",userNameTF);
		
		WebElement loginButton=driver.findElement(By.id("login-button"));
		
		js.executeScript("arguments[0].click();",loginButton);
		
		
	}

}
