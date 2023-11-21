package PopupsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Working_with_Notifications {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
//		EdgeOptions opt=new EdgeOptions();
//		opt.addArguments("--disable-notification");

		WebDriver driver = new EdgeDriver();//(opt)
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com");
		
//		Robot r = new Robot();
		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(3000);
		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(3000);
		
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(3000);
		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
