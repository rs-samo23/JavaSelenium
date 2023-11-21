package TakingScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ParticularWebElement {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com");
		
//		driver.findElement(By.xpath("//input[@id='id=sp-cc-accept']")).click();
		
		WebElement loginButton=driver.findElement(By.xpath("//div[text()='Log in']"));
		
		File src=loginButton.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/loginbutton.png");
		
		FileHandler.copy(src, trg);
		
		driver.close();
	}

		
	}
