package Assignment;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Assignment {

		
	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testpages.eviltester.com/styled/dynamic-buttons-simple.html");
			
			driver.findElement(By.xpath("//button[@id='button00']")).click();
			
			driver.findElement(By.xpath("//button[@id='button01']")).click();
			
			driver.findElement(By.xpath("//button[@id='button02']")).click();
			
			driver.findElement(By.xpath("//button[@id='button03']")).click();
			
			List<WebElement> Waitingmessage=driver.findElements(By.xpath("//p[@id='waitmessage']"));
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
				try {
					
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@id='buttonmessage']"))));
				
				}catch(TimeoutException e) {
					System.out.println("Condition not satisfied");
			}

		}

	}

