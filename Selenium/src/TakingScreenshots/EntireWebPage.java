package TakingScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireWebPage {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.co.uk/");
		
//		driver.findElement(By.xpath("//input[@id='id=sp-cc-accept']")).click();
		
		//To take screenshot of entire web page
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//method to take the screenshot
		ts.getScreenshotAs(OutputType.FILE);
		
		//path of the folder to store the screenshot
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/amazon123.png");
		
		//To copy from source to target
		FileHandler.copy(src, trg);
		
		driver.close();

	}

}
