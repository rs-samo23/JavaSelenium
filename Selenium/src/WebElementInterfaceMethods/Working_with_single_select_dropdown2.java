package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_single_select_dropdown2 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sam/OneDrive/Documents/Selenium_UK_batch/demo.html");
		
		WebElement dropdown=driver.findElement(By.id("standard_cars"));
		
		Select s = new Select(dropdown);
		
		List<WebElement> allOptions=s.getOptions();
		
		for(WebElement option:allOptions) {
			
			System.out.println(option.getText());
			
		}
		driver.close();
	}

}
