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

public class Gifts extends BaseStart{

	public Gifts (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, Header.class);
		
	}
	
	@FindBy
	(xpath = "//span[@class='a-size-base a-color-base']")
	List <WebElement> all_list;
	
	//a[@id='nav-hamburger-menu']
	
	@FindBy
	(xpath = "//a[@id='nav-hamburger-menu']")
	WebElement Ham;
	
	@FindBy
	(xpath = "//div[normalize-space()='Gift Cards & Mobile Recharges']")
	WebElement prr;
	
	@FindBy
	(xpath = "//a[normalize-space()='All Gift Cards']")
	WebElement allgiftscards;
	

	@FindBy
	(xpath = "//button[contains(text(),'❯')]")
	WebElement but1;
	

	
	@FindBy
	(xpath = "//button[contains(text(),'❮')]")
	WebElement but2;
	

	@FindBy
	(xpath = "//section[@id='sobe_d_b_2']")
	WebElement Sec;
	
	
	
	@FindBy
	(xpath = "//a//span[@class='sl-sobe-carousel-sub-card-title']")
	List <WebElement> items;
	
	public void generic () throws NumberFormatException, InterruptedException
	{
		
		Ham.click();
		Assist.NormalWait();
		Assist.move(prr);
		prr.click();
		Assist.NormalWait();
		Assist.move(allgiftscards);
		Assist.highlightElement(driver, allgiftscards);
		allgiftscards.sendKeys(Keys.RETURN);
	}

	public void list_of_categories() throws NumberFormatException, InterruptedException
	{
		Ham.click();
		Assist.NormalWait();
		Assist.move(prr);
		prr.click();
		Assist.NormalWait();
		Assist.move(allgiftscards);
		Assist.highlightElement(driver, allgiftscards);
		allgiftscards.sendKeys(Keys.RETURN);
	
		
		System.out.print("Size:" + all_list.size());
		
		for (WebElement one: all_list)
		{
			String name = one.getText();
			System.out.println("name:" + name);
			
			
			if (name.equals("Max")) {
			    // Actions to perform when name is "max"
			    Assist.NormalWait();
			    Assist.highlightElement(driver, one);
			    Assist.NormalWait();
			    one.click();
			    ListenHere.Create.log(Status.INFO, name + " is selected");
			    Assert.assertTrue(true); // Replace with a meaningful assertion
			    break;
			    
			} else if (!name.equals("max"))
			{
			    continue;
			}
			
		}
		
	}
	
	
	
	public void carousel() throws NumberFormatException, InterruptedException
	{
		Assist.move(Sec);
		Assist.NormalWait();
		Assist.highlightElement(driver, but1);
		Assist.NormalWait();
		Assist.move(but1);
		but1.click();
		Assert.assertTrue(true);
		ListenHere.Create.log(Status.INFO, "Arrow is selected");
		
	}
	
	public void all_items() throws NumberFormatException, InterruptedException
	{
		Assist.move(Sec);
		Assist.NormalWait();
		//Assist.highlightElement(driver, but1);
	
		for (WebElement one : items)
		{
			String name = one.getText();
			System.out.println(name);
			if (name.equals("Amazon Vouchers"))
			{
				Assist.NormalWait();
			    Assist.highlightElement(driver, one);
			    Assist.NormalWait();
			    one.click();
			    ListenHere.Create.log(Status.INFO, name + " is selected");
			    Assert.assertTrue(true); // Replace with a meaningful assertion
			    break;
			}
			
			else if (!name.equals("Alicia Souza Designed"))
				
			{
				continue;
			}
				
				
		}
		
	}
	
	
	
}
