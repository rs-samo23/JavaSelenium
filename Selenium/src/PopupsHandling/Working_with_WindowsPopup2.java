package PopupsHandling;

	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
//	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Working_with_WindowsPopup2 {

		public static void main(String[] args) throws InterruptedException {
			
//			WebDriver driver = new FirefoxDriver();
			WebDriver driver = new EdgeDriver();//(opt)
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.linkText("Facebook")).click();
			driver.findElement(By.linkText("Twitter")).click();			
			driver.findElement(By.linkText("Youtube")).click();				
			driver.findElement(By.linkText("Google+")).click();
			
			Set<String>allId=driver.getWindowHandles();
					
			for(String id:allId) {
				
				driver.switchTo().window(id);
				System.out.println(driver.getTitle());
				
				if(driver.getTitle().equals("NopCommerce | Facebook")) {
				
				driver.close();
			}
		}

	}
}
