package BrowserControlMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingToUrl {

	public static void main(String[] args) throws InterruptedException {

		//To launch the browser
		WebDriver driver = new ChromeDriver();
		
		//To navigate to any URL
		driver.get("https://www.google.com/");
		
		//To maximise the browser window
		driver.manage().window().maximize();
		
		//To fetch the title
		String title=driver.getTitle();
		System.out.println(title);
		
		//To fetch the URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		
		// To close the browser
		driver.close();
		
		
	}

}
