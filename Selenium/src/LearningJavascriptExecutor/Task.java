package LearningJavascriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		
		WebElement allrights=driver.findElement(By.xpath("//small[@class= 'text-white']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].scrollIntoView(false);",allrights);
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/selenium.png");
		
		FileHandler.copy(src, trg);
		
		driver.close();
			
	}

}
