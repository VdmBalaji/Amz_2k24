package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v120.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_Cases.BaseStart;
import Utilities.Assist;

public class logger extends BaseStart{

	public logger (WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver ,this);
		PageFactory.initElements(driver ,Gifts.class);
		
	}
	
	@FindBy
	(xpath ="//a[@id='nav-link-accountList']")
	WebElement one;
	
	@FindBy
	(xpath ="//input[@id='ap_email']")
	WebElement username;
	
	
	
	@FindBy
	(xpath ="//input[@id='continue']")
	WebElement cont;
	
	
	
	@FindBy
	(xpath ="//input[@id='ap_password']")
	WebElement pass;
	
	
	
	@FindBy
	(xpath ="//input[@id='signInSubmit']")
	WebElement signin;
	
	
	
	
	public  void log() throws NumberFormatException, InterruptedException
	{
		Assist.highlightElement(driver, one);
		Assist.NormalWait();
		one.click();
		Assert.assertTrue(true);

	
	}
	
	public void enter(String un , String p ) throws NumberFormatException, InterruptedException
	{
		Assist.highlightElement(driver, username);
		Assist.NormalWait();
		
		try {
		username.sendKeys(un);
		}
		catch (Exception e){
			
			e.printStackTrace();
		}
		
		Assist.highlightElement(driver, cont);
		Assist.NormalWait();
		
		cont.click();
		
		try {
		Assist.highlightElement(driver, pass);
		Assist.NormalWait();
		pass.sendKeys(p);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		try {
		Assist.highlightElement(driver, signin);
		Assist.NormalWait();
		signin.click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
