package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jewelry_Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.xpath("//a[text()='jewelry']")).click();
		driver.findElement(By.partialLinkText("jewelry']")).click();
		
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		
		Select s=new Select(dropdown);
			
		List<WebElement>allOptions=s.getOptions();
		
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
			Thread.sleep(2000);
			option.click();
		}
//		System.out.println("Multi-select: " + s.isMultiple());
		
	}

}
