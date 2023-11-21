package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Hover_Over {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement checkBox=driver.findElement(By.xpath("//div[@ id='keepMeLoggedInCaptionContainer']"));
		
	//	To fetch the h-over message
		System.out.println(checkBox.getAttribute("title"));
		
		driver.close();
		
	}

}
