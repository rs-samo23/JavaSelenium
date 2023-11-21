package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_multi_select {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sam/OneDrive/Documents/Selenium_UK_batch/demo.html");
		
		WebElement dropdown=driver.findElement(By.id("multiple_cars"));
		
		Select s=new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("min");
		Thread.sleep(3000);
		s.selectByVisibleText("Ford");
		
//		To deselect the options from the dropdown:	
//		s.deselectByIndex(1);
		s.deselectAll();
		
		List<WebElement>allOptions=s.getOptions();
		
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
			Thread.sleep(2000);
			option.click();
		}
		System.out.println("Multi-select: " + s.isMultiple());
		driver.close();
	}

}
