package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_with_PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Sam\\OneDrive\\Documents\\Selenium_UK_batch\\TestData.properties");
		Properties pobj = new Properties();//create object of properties class
		pobj.load(fis);//stored data will be loaded into the pobj
		
		String value1=pobj.getProperty("url");
		System.out.println(value1);
		
		String value2=pobj.getProperty("un");
		System.out.println(value2);
		
		String value3=pobj.getProperty("pwd");
		System.out.println(value3);	
		
	}

}
