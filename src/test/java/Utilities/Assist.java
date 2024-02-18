package Utilities;

import java.time.Duration;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import Test_Cases.BaseStart;

public class Assist extends BaseStart {
   
	//public static WebDriver driver;
	
	
	
	public static Assist wait = new Assist();
	
	public static SoftAssert SoftAssert=new SoftAssert();

	public static void NormalWait() throws NumberFormatException, InterruptedException
	{
		Thread.sleep(3000);
		
	}
	
	public static void CustomWait(int seconds) throws NumberFormatException, InterruptedException
	{
		Thread.sleep(seconds*1000);
		
	}
	
	public static void move(WebElement dynamic)
	{
		Actions act=new Actions(driver);
		act.moveToElement(dynamic).build().perform();
		
	}
	public static void lowassert ()
	{
		SoftAssert SoftAssert=new SoftAssert();
	}
	
	public static void windowhandler() throws NumberFormatException, InterruptedException
	{
		Set <String> All_ID=driver.getWindowHandles();
		for (String New_ID:All_ID)
		{
			driver.switchTo().window(New_ID);
			
		}
		Assist.wait.CustomWait(5);
		
	}
	
	public static void close()
	{
		driver.close();
	}
	
	public static  String title()
	{
		String name=driver.getTitle();
		return name;
		
	}
	
	
	public static String [] Categoryinheader()
	{
		String [] name= {"Apps & Games","Amazon Pharmacy" ,"Shoes & Handbags","Video Games","Watches"};
		return name;
	}
	
	
	public static String []languagedata()
	{
		String [] a= {"English - EN" , "हिन्दी - HI" , "தமிழ் - TA" , "తెలుగు - TE" , "ಕನ್ನಡ - KN" , "മലയാളം - ML" , "বাংলা - BN" ,"मराठी - MR"};
				
		return a;
	}
	
	public static void DragandDrop(WebElement dynamic , int a,int b)
	{
		Actions act=new Actions(driver);
		act.dragAndDropBy(dynamic, a, b).build().perform();
	
	}
	public static void back()
	{
		driver.navigate().back();
	}
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	public static String []carousel()
	{
		String [] carouseldata= {"Lenovo IdeaPad Gaming 3 AMD Ryzen 5 6600H 15.6\" (39.62cm) FHD IPS 120Hz Gaming", 
				"HP Victus Gaming Laptop 11th Gen Intel Core i5-11400H",
				"Lenovo Ideapad Slim 1 AMD Ryzen 5 5500U",
				"MSI Bravo 15 Gaming Laptop, AMD Ryzen 5 7535HS, 40CM FHD",
				"MSI GF63 Thin, Intel Core i5-11260H, 40CM FHD 144Hz Gaming"};
		return carouseldata;
		
	}
	

	public static String[] country_list()
	{
		String []a= {"Australia","sgfsfgsg","Brazil","88","Netherlands","Singapore","United States of America"};
		return a;
		
	}
	/*"Canada","China",
    "France","Germany","Italy","Japan",
    "Mexico","Netherlands","Poland",
    "Singapore","Spain","Türkiye","United Arab Emirates",
    "UK","United States of America"**/
	
	public static String[] MoreonAmazon()
	{
		String []a= {"Amazon Web Services",
				     "sgfsfgsg","Audible","88","Prime Now",
				     "Amazon Prime Music",
				     "IMDb"};
		return a;
		
	}
	
	public static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background:red; border: 1px solid red;');", element);
        
     // List of few others colurs 
        /* Honeydew: rgba(240, 255, 240, 0.5)
         LightSteelBlue: rgba(176, 196, 222, 0.5)
         Sky Blue: rgba(135, 206, 235, 0.5)
          MediumVioletRed: rgba(199, 21, 133, 0.5)
          HotPink: rgba(255, 105, 180, 0.5)
          Tomato: rgba(255, 99, 71, 0.5)
          DarkMagenta: rgba(139, 0, 139, 0.5)
         */
    }
	
}
