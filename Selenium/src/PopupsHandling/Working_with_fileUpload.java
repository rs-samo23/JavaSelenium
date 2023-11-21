package PopupsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_fileUpload {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		
		//always remember the file name.pdf at the end of the file location
		driver.findElement(By.xpath("//input['file']")).sendKeys("C:\\Users\\Sam\\Downloads\\Day12.pdf");
	}

}
