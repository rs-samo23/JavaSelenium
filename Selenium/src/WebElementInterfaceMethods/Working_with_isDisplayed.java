package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_isDisplayed {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		boolean book=driver.findElement(By.partialLinkText("Books")).isDisplayed();
		System.out.println("Book : "+book);
		
		WebElement searchButton=driver.findElement(By.xpath("//input[@value='Search']"));
		System.out.println("Search Button displayed: "+searchButton.isDisplayed());
		System.out.println("Search Button enabled: "+searchButton.isEnabled());
		
		driver.close();

	}

}
