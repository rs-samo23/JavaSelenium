package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcases {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Books")).click();
		
		WebElement singleSelectDropdown=driver.findElement(By.id("products-orderby"));
		
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(4);
			
		List<WebElement>allOptions=s.getOptions();
		
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
			
			option.click();
			
		}

		driver.close();
		
		
	}

}
