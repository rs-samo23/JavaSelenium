package Generic_Library;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomrepository.LoginPage;

public class BaseTest {
	
public WebDriver driver;
public UtilityMethods um=new UtilityMethods();
	
//	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
//	public void launchBrowser(String browser)
	public void launchBrowser() throws IOException
	{
//		if(browser.equals("Edge"))
//		{
//			driver = new EdgeDriver();
//			
//		}
//		else if(browser.equals("Chrome"))
//		{
//			driver = new ChromeDriver();
//		}
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demowebshop.tricentis.com/");
		driver.get(um.getDataProperties("url"));
	}
	
	@BeforeMethod(alwaysRun=true)
	public void performLogin() throws IOException
	{	
		driver.findElement(By.linkText("Log in")).click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys(um.getDataProperties("un"));
		lp.getPasswordTextField().sendKeys(um.getDataProperties("pwd"));
		lp.getLoginButton().click();
		
		
//		driver.findElement(By.id("Email")).sendKeys("sam@testing.com");
//		driver.findElement(By.id("Email")).sendKeys(um.getDataProperties("un"));
		
//		driver.findElement(By.id("Password")).sendKeys("Sam1234");
//		driver.findElement(By.id("Password")).sendKeys(um.getDataProperties("pwd"));
		
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}
	
	@AfterMethod(alwaysRun=true)
	public void performLogout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
}

