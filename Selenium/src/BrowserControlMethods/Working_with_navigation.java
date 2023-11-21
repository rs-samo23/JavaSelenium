package BrowserControlMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_navigation {

	public static void main(String[] args) {

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				
				//To fetch the source code of the webpage
//				String pageSource=driver.getPageSource();//can use this line as well
//				System.out.println(driver.getPageSource());
				
				//To fetch the height and width of the browser
				Dimension size = driver.manage().window().getSize();
				System.out.println("Size: "+size);
				
				//To fetch the position of the browser (X and y coordinates)
				Point position = driver.manage().window().getPosition();
				System.out.println("Position: "+position);
				
				
				driver.close();

		
		
	}

}
