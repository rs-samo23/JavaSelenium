package LearningJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_Scrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//To perform scrolling down
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		
		//To perform scrolling up
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
