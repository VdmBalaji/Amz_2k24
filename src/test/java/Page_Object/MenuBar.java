package Page_Object;

import java.util.Set;

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

public class MenuBar extends BaseStart{

	//public WebDriver driver;
	
	public MenuBar (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy
	(xpath="//a[@id='nav-hamburger-menu']")
	WebElement Menu;
	
	@FindBy
	(xpath="//div[@class='nav-sprite hmenu-close-icon']")
	WebElement closeicon;
	
	@FindBy
	(xpath="//div[asa]")
	WebElement fail;
	
	//div[@id='hmenu-customer-profile']
	
	@FindBy
	(xpath="//div[@id='hmenu-customer-profile']")
	WebElement Hello;

	@FindBy
	(xpath="//i[@aria-label='Amazon']")
	WebElement Amazon;
	
	@FindBy
	(xpath="//li//a[text()='Best Sellers']")
	WebElement BestSeller;
	
	
	@FindBy
	(xpath="//span[text()='Amazon Bestsellers']")
	WebElement BS;
	

	@FindBy
	(xpath="//li//a[text()='New Releases']")
	WebElement release;
	
	
	
	@FindBy
	(xpath="//li//a[text()='Movers and Shakers']")
	WebElement MoversandShakers;
	
	@FindBy
	(xpath="//li//a[text()='Amazon miniTV- FREE entertainment']")
	WebElement MiniTV;

	@FindBy
    (xpath="//img[@data-testid='appnavbar_brandlogo']")
	WebElement Amazonminitvlogo;
	
	@FindBy
    (xpath="//li//a//div[text()='Echo & Alexa'] ")
	WebElement EchoAlexa;

	@FindBy
    (xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[@aria-label='Back to main menu']")
	WebElement Mainmenu;
	
	@FindBy
	(xpath = "//li//a[text()='See all devices with Alexa']")
	WebElement SeeAllDevices;

	@FindBy
	(xpath = "//li//a[text()='Meet Alexa']")
	WebElement MeetAlexa;
	
	@FindBy
	(xpath = "//li//a[text()='Alexa Skills']")
	WebElement AlexaSkills;
	
	@FindBy
	(xpath = "//li//a[text()='Alexa App']")
	WebElement AlexaApp;

	@FindBy
	(xpath = "//li//a[text()='Alexa Smart Home']")
	WebElement AlexaSmartHome;
	
	@FindBy
	(xpath = "//li//a[text()='Amazon Prime Music']")
	WebElement AmazonPrimeMusic;
	
	
	
	
	
	
	
	
	
	
	
	public void hamburgermenuicon() throws NumberFormatException, InterruptedException
	{
		Menu.click();
		Assist.wait.NormalWait();
	}
	
	public void selectMenu() throws NumberFormatException, InterruptedException
	{
		Menu.click();
		ListenHere.Create.log(Status.INFO, "Hamburger icon is clicked");
		Assist.wait.NormalWait();
		closeicon.isDisplayed();
		Assist.SoftAssert.assertTrue(true);
		Assist.SoftAssert.assertAll();
		closeicon.click();
		Assist.wait.NormalWait();
	}
	
	public void hello() throws NumberFormatException, InterruptedException
	{
		Menu.click();
		Assist.wait.NormalWait();
		ListenHere.Create.log(Status.INFO, "Hamburger icon is selected");
		Hello.click();
		ListenHere.Create.log(Status.INFO, "Hello icon is selected");
		Assist.wait.NormalWait();
		Set<String> all =driver.getWindowHandles();
		for (String id:all)
		{
			driver.switchTo().window(id);
			
		}

		Assist.wait.NormalWait();
		Amazon.isDisplayed();
		Assert.assertTrue(true);
	}
	
	public void bestseller() throws NumberFormatException, InterruptedException
	{
		Menu.click();
		BestSeller.isDisplayed();
		BestSeller.isEnabled();
		BestSeller.sendKeys(Keys.CONTROL,Keys.RETURN);
		ListenHere.Create.log(Status.INFO, "Best Seller is verified");
		Assist.wait.NormalWait();
		Assist.windowhandler();
		/*Set<String> all =driver.getWindowHandles();
		for (String id:all)
		{
			driver.switchTo().window(id);
			
		}*/
		Assist.wait.NormalWait();
		BS.isDisplayed();
		String p=BS.getText();
		System.out.println(p);
		Assist.wait.NormalWait();
		Assert.assertTrue(true);
	}
	
	public void Newrelease() throws NumberFormatException, InterruptedException
	{
		release.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.wait.NormalWait();
		Assist.windowhandler();
		//Amazon.in Hot New Releases: The bestselling new and future releases on Amazon
		String title =driver.getTitle();
		Assert.assertEquals(title, "Amazon.in Hot New Releases: The bestselling new and future releases on Amazon");
		ListenHere.Create.log(Status.INFO, "New release is verified");
	}
	
	public void MoviersShakers() throws NumberFormatException, InterruptedException
	{
		MoversandShakers.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.wait.NormalWait();
		Assist.windowhandler();
		String title =driver.getTitle();
		Assert.assertEquals(title, "Amazon.in Movers and Shakers: The biggest gainers in Amazon sales rank over the past 24 hours");
		ListenHere.Create.log(Status.INFO, "Movers and Shakers is verified");
	}
	
	public void MiniTv() throws NumberFormatException, InterruptedException
	{
		MiniTV.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.wait.NormalWait();
		Assist.windowhandler();
		Amazonminitvlogo.isDisplayed();
		Assist.wait.NormalWait();
		ListenHere.Create.log(Status.INFO, "Amazon mini tv is verified");
		
		
		/*Assist.move(Mainmenu);
		Assist.wait.NormalWait();
		Mainmenu.sendKeys(Keys.RETURN);*/
	}

	public void EchoAlexa() throws NumberFormatException, InterruptedException
	{
		EchoAlexa.isDisplayed();
		EchoAlexa.click();
		Assist.wait.NormalWait();
		//ListenHere.Create.log(Status.INFO, "EchoAlexa is verified");

		
	}
	public void seealldevices() throws NumberFormatException, InterruptedException
	{
		Assist.move(SeeAllDevices);
		SeeAllDevices.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		String Title=Assist.title();
		Assert.assertEquals(Title,"Amazon Echo: Buy Amazon Echo & Alexa Devices Online in India - Amazon.in");
		Assist.close();
		Assist.windowhandler();
		ListenHere.Create.log(Status.INFO, "SeeAllDevices is verified");
	}
	
	public void MeetAlexa() throws NumberFormatException, InterruptedException
	{
		Assist.move(MeetAlexa);
		MeetAlexa.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		String Title=Assist.title();
		Assert.assertEquals(Title,"Learn What Alexa Can Do | Amazon Alexa Setup, Features, and Privacy Settings | Amazon India");
		Assist.close();
		Assist.windowhandler();
		ListenHere.Create.log(Status.INFO, "MeetAlexa is verified");
	}
	
	
	public void AlexaSkills() throws NumberFormatException, InterruptedException
	{
		Assist.move(AlexaSkills);
		AlexaSkills.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		String Title=Assist.title();
		Assert.assertEquals(Title,"Amazon.in: Alexa Skills");
		Assist.close();
		Assist.windowhandler();
		ListenHere.Create.log(Status.INFO, "AlexaSkills is verified");
	}
	
	public void AlexaApp() throws NumberFormatException, InterruptedException
	{
		Assist.move(AlexaApp);
		AlexaApp.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		String Title=Assist.title();
		Assert.assertEquals(Title,"Alexa App Settings - Amazon Customer Service");
		Assist.close();
		Assist.windowhandler();
		ListenHere.Create.log(Status.INFO, "AlexaApp is verified");
	}
	
	
	public void AlexaSmartHome() throws NumberFormatException, InterruptedException
	{
		Assist.move(AlexaSmartHome);
		AlexaSmartHome.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		String Title=Assist.title();
		Assert.assertEquals(Title,"Alexa Smart Home Store @ Amazon.in");
		Assist.close();
		Assist.windowhandler();
		ListenHere.Create.log(Status.INFO, "AlexaSmartHome is verified");
	}
	
	
	
	public void AmazonPrimeMusic() throws NumberFormatException, InterruptedException
	{
		Assist.move(AmazonPrimeMusic);
		AmazonPrimeMusic.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		String Title=Assist.title();
		Assert.assertEquals(Title,"Amazon Prime Music | Amazon.in");
		Assist.close();
		Assist.windowhandler();
		ListenHere.Create.log(Status.INFO, "AmazonPrimeMusic is verified");
	}
	
	
	
	
	
	
	
	
	
	
	
}
