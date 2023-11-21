package LearningJavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_scrollIntoView {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement news=driver.findElement(By.xpath("//h2[text()='News']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].scrollIntoView(false);",news);
		
	}

}
