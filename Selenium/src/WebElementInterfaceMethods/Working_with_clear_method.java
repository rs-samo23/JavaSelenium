package WebElementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_clear_method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Trainee");
		
		//Best practice for writing multiple lines for a single webElement
		WebElement UserNameTF=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		UserNameTF.sendKeys("admin");
		Thread.sleep(3000);
		UserNameTF.clear();
		Thread.sleep(3000);
		UserNameTF.sendKeys("Trainee");
	}

}
