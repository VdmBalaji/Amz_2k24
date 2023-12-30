package Page_Object;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Listeners.ListenHere;
import Test_Cases.BaseStart;
import Utilities.Assist;

public class Footer extends BaseStart{

	public Footer (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		PageFactory.initElements(driver,Header.class);
		
	}
	
	
	@FindBy
    (xpath="//div[@id='navFooter']//span[@class='navFooterBackToTopText']")
    WebElement backtotop;
    
	
	
	@FindBy
    (xpath="//div[@class='navFooterVerticalRow navAccessibility']//li//a[@href]")
	List <WebElement> FootLinks;
	//div[@class='navFooterVerticalRow navAccessibility']//ul//li
	
	
	@FindBy
    (xpath="//div[@class='navFooterColHead']")
    List <WebElement> Heading;

	@FindBy
    (xpath="//a[@aria-label='Amazon India Home']")
    WebElement Footer_Logo;

	@FindBy
    (xpath="//a[@id='icp-touch-link-language']")
    WebElement lang;
	
	
	
	@FindBy
    (xpath="//div[@id='nav-flyout-icp-footer-flyout']//span[@class='nav-text']")
	//div[@id='nav-flyout-icp-footer-flyout']//span
    List <WebElement> langDD;
	
	@FindBy
    (xpath="//a[text()='Conditions of Use & Sale']")
	WebElement bottomelement;

	@FindBy
    (xpath="//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//ul//a")
	 List <WebElement> country;
	
	
	
	@FindBy
    (xpath="//div[@aria-label='More on Amazon']//td[@class='navFooterDescItem']//a")
	 List <WebElement> MoreonAmazon;
	
	
	
	
	
	@FindBy
    (xpath="//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine navFooterCopyright']//a")
	 List <WebElement> last;
	
	
	
    public void BacktoTop()
    {
 
    	Assert.assertTrue(backtotop.isDisplayed());
    	Assist.move(backtotop);
    	backtotop.click();
    	ListenHere.Create.log(Status.INFO, "Back to Top is selected");
    }
    
    public void Foot_Heading()
    {
    	for (WebElement one:Heading)
    	{
    		String name=one.getText();
    		System.out.println(name);
    		if (name.equalsIgnoreCase("Get to Know Us"))
    		{
    			Assist.move(one);
    			Assert.assertTrue(true);
    			ListenHere.Create.log(Status.INFO, name + "is Displayed");
    		}
    		else if (name.equalsIgnoreCase("Connect with Us"))
    		{
    			Assist.move(one);
    			Assert.assertTrue(true);
    			ListenHere.Create.log(Status.INFO, name + "is Displayed");
    		}
    		else if (name.equalsIgnoreCase("Make Money with Us"))
    		{
    			Assist.move(one);
    			Assert.assertTrue(true);
    			ListenHere.Create.log(Status.INFO, name + "is Displayed");
    		}
    		else if (name.equalsIgnoreCase("Let Us Help You"))
    		{
    			Assist.move(one);
    			Assert.assertTrue(true);
    			ListenHere.Create.log(Status.INFO, name + "is Displayed");
    		}
    		
    	}
    	
    }
    
    public void Footer_Links(String value) throws NumberFormatException, InterruptedException
	{
    	for (WebElement text:FootLinks)
    	{
    		String name = text.getText();
    		System.out.println(name);
    		if (name.equalsIgnoreCase(value))
    		{
    			Assist.move(text);
    			Assist.NormalWait();
    			text.sendKeys(Keys.CONTROL,Keys.RETURN);
    			Assist.windowhandler();
    			String pagetitle=Assist.title();
    			ListenHere.Create.log(Status.INFO,name + ": "+ pagetitle );
    			Assist.NormalWait();
    			break;
    		}
    	}
	}
    
    
    public void footer_logo() throws NumberFormatException, InterruptedException
    {
    	Assist.move(Footer_Logo);
    	Assist.NormalWait();
    	Assert.assertTrue(Footer_Logo.isDisplayed());
    	Footer_Logo.click();
    	
    }
    
    
    public void language() throws NumberFormatException, InterruptedException
    {
    	Assist.move(bottomelement);
    	Assist.NormalWait();
    	Assist.move(lang);
    	Assist.NormalWait();
    	for (WebElement one:langDD)
    	{
    		String lang1=one.getText();
    		System.out.println("value:" +lang1);
    		if (lang1.equalsIgnoreCase("मराठी - MR"))
    		{
    		   Assist.move(one);
    		   one.click();
    		   ListenHere.Create.log(Status.INFO,"मराठी - MR is selected");
    		   Assist.NormalWait();
    		   break; 
    		}	
    	}
    	
    	Header.logo.isDisplayed();
    	Assert.assertTrue(true);

    }
    
    public void country_list(String country_all) throws NumberFormatException, InterruptedException
    {
    	Assist.move(bottomelement);
    	Assist.NormalWait();
    	country.size();
    	for (WebElement one :country)
    	{
    		
    		String name=one.getText();
    		System.out.println("value:" +name);
    		if (name.equalsIgnoreCase(country_all))
    		{
    			Assist.move(one);
    			Assist.NormalWait();
    			one.click();
    			Assist.NormalWait();
    			String pagename= Assist.title();
    			ListenHere.Create.log(Status.INFO,name+ ": " +pagename);
    			break;
    		}
    		
    	}
    	String url=driver.getCurrentUrl();
    	ListenHere.Create.log(Status.INFO,"Given parameter: " +country_all );
    	ListenHere.Create.log(Status.INFO,"URL: " +url );
    	Assert.assertNotEquals(url, "https://www.amazon.in/");
    }
    
 
    
    public void MoreItems (String list) throws NumberFormatException, InterruptedException
    {
    	Assist.move(bottomelement);
    	Assist.NormalWait();
    	System.out.println("size:" +MoreonAmazon.size());
    	for (WebElement one :MoreonAmazon)
    	{
    		
    		String name=one.getText();
    		System.out.println("value:" +name);
    		System.out.println("para:" +list);
    		if (name.startsWith(list))
    		{
    			Assist.move(one);
    			Assist.NormalWait();
    			one.click();
    			Assist.NormalWait();
    			String pagename= Assist.title();
    			ListenHere.Create.log(Status.INFO,name+ ": " +pagename);
    			break;
    		}
 
    }
    	
    	String url=driver.getCurrentUrl();
    	//ListenHere.Create.log(Status.INFO,"Given parameter: " +country_all );
    	ListenHere.Create.log(Status.INFO,"URL: " +url );
    	Assert.assertNotEquals(url, "https://www.amazon.in/");
    
    }   
    
    
    public void terms_privacy_ad() throws NumberFormatException, InterruptedException
    {
    	Assist.move(bottomelement);
    	Assist.NormalWait();
    	System.out.println("size:" +last.size());
    	for (WebElement one :last)
    	{
    		
    		String name=one.getText();
    		System.out.println("value:" +name);
    		if (name.equalsIgnoreCase("a1sdsad"))
    		{
    			//Conditions of Use & Sale
    			one.click();
    			Assist.NormalWait();
    			break;
    		}
    		else if (name.equalsIgnoreCase("Privacy Notice"))
    		{
    			one.click();
    			Assist.NormalWait();
    			break;
    		}
    		else if (name.equalsIgnoreCase("Interest-based advertising"))
    		{
    			one.click();
    			Assist.NormalWait();
    			break;
    		}
    		
      }
    	String url=driver.getCurrentUrl();
    	//ListenHere.Create.log(Status.INFO,"Given parameter: " +country_all );
    	ListenHere.Create.log(Status.INFO,"URL: " +url );
    	Assert.assertNotEquals(url, "https://www.amazon.in/");
	
    }  
}
