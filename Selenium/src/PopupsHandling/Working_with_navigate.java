package PopupsHandling;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_navigate {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.ebay.co.uk/");
		
//		driver.navigate().to("https://www.ebay.co.uk/");
		
		URL url=new URL("https://www.ebay.co.uk/");
		
		driver.navigate().to(url);

	}

}
