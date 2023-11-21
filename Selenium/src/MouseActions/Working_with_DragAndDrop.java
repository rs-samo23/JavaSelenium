package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		
		WebElement src=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		WebElement trg=driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
//		act.dragAndDrop(src, trg).perform();
		
//		act.clickAndHold(src).perform();
//		act.release(trg).perform();
		
//		act.clickAndHold(src).release(trg).perform();
		
		act.clickAndHold(src).moveToElement(trg).release().perform();
		
			
	}

}
