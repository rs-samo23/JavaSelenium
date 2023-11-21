package WebElementInterfaceMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_findElements3 {

	public static void main(String[] args) {


		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.co.uk/");
		
		List<WebElement>allLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement link:allLinks) {
			
			System.out.println(link.getText());
		}
		
		driver.close();		
		
		
	}

}
