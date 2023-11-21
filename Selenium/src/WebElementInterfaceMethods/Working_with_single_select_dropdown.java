package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_single_select_dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sam/OneDrive/Documents/Selenium_UK_batch/demo.html");
		
		WebElement singleSelectDD=driver.findElement(By.id("standard_cars"));
		
		Select s = new Select(singleSelectDD);
		Thread.sleep(2000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("vol");
		Thread.sleep(3000);
		s.selectByVisibleText("Jaguar");
		
		
		
		
	}

}
