package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_contextclick {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		
		//To perform right click
//		act.contextClick(rightClick).perform();
		WebElement doubleClick=driver.findElement(By.xpath("//button[text[()=Double-click Me To See Alert']"));
		
		act.doubleClick(doubleClick).perform();
		
		
	}

}
