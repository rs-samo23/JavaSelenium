package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.co.uk/");
		
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		
		//Object creation of Actions class
		Actions act=new Actions(driver);
		
		//To take the mouse cursor to a particular web element
		act.moveToElement(electronics).build().perform();
		
		WebElement desktop=driver.findElement(By.xpath("(//a[text()='Desktops & All-in-ones'])[1]"));
		Thread.sleep(3000);
//		act.moveToElement(desktop).click().perform();
		act.click(desktop).perform();
		
	}

}
