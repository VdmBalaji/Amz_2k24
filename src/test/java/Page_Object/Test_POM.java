package Page_Object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_Cases.BaseStart;
import Utilities.Assist;


public class Test_POM extends BaseStart{
	

	public WebDriver driver;
	
	
	public Test_POM (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy
	(xpath = "//div[@class='DesktopHeader__luxeryTab']")
	WebElement luxury;
	
	@FindBy (xpath ="//button[@class='No thanks']")
	WebElement Askmelater;
	
	//div[@class='DesktopHeader__luxeryTab']
	
	
	public void selectlux() throws NumberFormatException, InterruptedException 
	{
		luxury.click();
		Assist.wait.CustomWait(10);
        String name =driver.getTitle();
		
		Assert.assertEquals(name, "XASASAS");
		
	
	}
	
	
	public void Askmelater() throws NumberFormatException, InterruptedException
	{
		Askmelater.click();
		Assist.wait.CustomWait(4);
		System.out.println("4000");
		
		
		
	
	}
	
}
