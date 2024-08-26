package Trail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	   /*TakesScreenshot take = driver;
	   File  one = take.getScreenshotAs(OutputType.FILE);
	   File two = new File(".//SP//one.png");
	   FileUtils.copyFile(one, two);*/
		try {
		TakesScreenshot take = (TakesScreenshot)driver;
		File click = take.getScreenshotAs(OutputType.FILE);
		File SNAP = new File(".//SP//amz.png");
		FileUtils.copyFile(click, SNAP);
		}
		catch (Exception A) 
		{
			System.out.println(A.getMessage());
		}
		
		
		
		
	   
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   driver.quit();
	   
	   
	   
	   
		
		
		

	}

}
