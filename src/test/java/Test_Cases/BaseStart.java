package Test_Cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.Assist;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStart {

	public static WebDriver driver;
	
	
	Properties prop = new Properties ();
	
	@Parameters ("browser")
	
	@BeforeMethod (alwaysRun=true)
	//@BeforeClass (alwaysRun=true)
	public void Allbrowser(String browser) throws InterruptedException, IOException 
	
	{
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			/*ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");*/
			
			driver=new ChromeDriver();
			
			
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			driver=null;
			System.out.println("Driver value is empty");
			Assert.fail();
		}
		
		
		
		
		//Properties prop = new Properties ();
		
		String filename = File.separator +"src"+File.separator +"test"+File.separator +"java"+
		File.separator+"Utilities"+File.separator+"Base_data";
		
		String userdir= System.getProperty("user.dir");
		
		FileInputStream file = new FileInputStream(userdir + File.separator +filename);
		
		
		//FileInputStream file = new FileInputStream(System.getProperty("User.dir")+ \src\test\java\Utilities\List.properties);
		//FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ File.separator +"src"+File.separator +"test"+
		//File.separator +"java"+File.separator+"Utilities"+File.separator+"List.properties");
		driver.manage().deleteAllCookies();
		
		driver.manage().deleteAllCookies();
		
		prop.load(file);
		
		driver.get(prop.getProperty("BaseURL"));
		
        driver.manage().window().maximize();
        
        
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("ImplicitWait"))));
		
		
		Assist.wait.NormalWait();
		
		
		
	}
	
	
	
	@AfterMethod (alwaysRun=true)
	//@AfterGroups (alwaysRun=true)
	public void quit()
	{
		
		driver.quit();
		
	}
	
	
}
