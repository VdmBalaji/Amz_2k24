package Page_Object;

import java.util.List;
import java.util.Random;
import java.util.stream.LongStream;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Listeners.ListenHere;
import Test_Cases.BaseStart;
import Utilities.Assist;

public class Header extends BaseStart{

	public Header(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy
    (xpath="//a[@aria-label='Amazon.in']")
	public static WebElement logo;
	
	//select[@id='searchDropdownBox']//option
	
	@FindBy
    (xpath="//select[@id='searchDropdownBox']//option")
	List <WebElement> dd;
	
	@FindBy
    (xpath="//select[@id='searchDropdownBox']")
	WebElement dropdown2;
	
	
	@FindBy
    (xpath="//div[@id='nav-flyout-icp']//a//span")
	List <WebElement> langDD;
	
	
	@FindBy
    (xpath="//a[@id='icp-nav-flyout']")
	WebElement langmove;
	
	
	
	@FindBy
    (xpath="//a[@id='nav-link-accountList']")
	WebElement Acc_List;
	
	//div[@id='nav-flyout-anchor']//div//a
	
	@FindBy
    (xpath="//div[@id='nav-flyout-anchor']//div//a")
	List <WebElement> All_List;
	

	@FindBy
    (xpath="//input[@id='twotabsearchtextbox']")
	public static WebElement Searchbar;
	
	
	
	@FindBy
    (xpath="//input[@id='nav-search-submit-button']")
	public static WebElement submiticon;
	
	//div[@class='autocomplete-results-container']//div[@class='s-suggestion-container']
	//div[@class='autocomplete-results-container']//span[@class='s-heavy'] - text
	
	
	@FindBy
    (xpath="//div[@class='autocomplete-results-container']//span[@class='s-heavy']")
	List <WebElement> Search_Results;
	
	//a[@id='nav-global-location-popover-link']
	
	@FindBy
    (xpath="//a[@id='nav-global-location-popover-link']")
	WebElement location;
	
	
	@FindBy
    (xpath="//input[@aria-label='Sign in to see your addresses']")
	WebElement signin;
	

	@FindBy
    (xpath="//input[@class='GLUX_Full_Width a-declarative']")
	WebElement NumberField;
	
	@FindBy
    (xpath="//div[@class='a-column a-span4 a-span-last']")
	WebElement Apply;
	
	//i[@aria-label='Amazon']
	
	@FindBy
    (xpath="//i[@aria-label='Amazon']")
	WebElement logo_Signin;
	
	
	public void Amazonlogo() throws NumberFormatException, InterruptedException
	{
		logo.isDisplayed();
		logo.isEnabled();
		logo.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		Assist.wait.NormalWait();
		Assist.close();
		Assist.windowhandler();
		Assist.wait.NormalWait();
		ListenHere.Create.log(Status.INFO, "Logo is verified");
	}
	
	
	public void Dropdown(String two) throws NumberFormatException, InterruptedException
	{
		for (WebElement categories:dd)
		{
			String name=categories.getText();
			if (name.equalsIgnoreCase(two))
			{
				categories.click();
				Assist.wait.NormalWait();
				ListenHere.Create.log(Status.INFO, two+" is selected");
				break;
			}
			else
			{
				continue;
			}
			
		}
	}


	
	
	/*public void SelectDropDown(String one)
	{
		Select sl=new Select(dropdown2);
		System.out.println(one);
		sl.selectByVisibleText(one);	
			
				
	}
	
	public void SelectDropDown2()
	{
		Select sl=new Select(dropdown2);
		
		sl.selectByValue("search-alias=amazon-pharmacy");	
			
		System.out.println("done");		
	}*/
	
	public void languageDropdown(String lang) throws NumberFormatException, InterruptedException
	{
		Assist.move(langmove);
		Assist.wait.NormalWait();
		
		for (WebElement all:langDD)
		{
			String AllLanguages=all.getText();
			if (AllLanguages.equalsIgnoreCase(lang))
			{
				all.click();
				ListenHere.Create.log(Status.INFO, lang+" is selected and verified");
				break;
			}
			else
			{
				continue;
			}
			
		}
		
	}
	
	
	public void Accounts_List(String value) throws NumberFormatException, InterruptedException
	{
		Assist.move(Acc_List);
		Assist.wait.NormalWait();
		ListenHere.Create.log(Status.INFO,"Moved to Account and List");
	    
		for (WebElement all:All_List)
		{
			String title=all.getText();
			//System.out.println(value);
			if (title.equalsIgnoreCase(value))
			{
				all.click();
				Assist.wait.NormalWait();
				System.out.println(title);
				String PageTitle=Assist.title();
				ListenHere.Create.log(Status.INFO, title+" is verified " + " Name of the page: " + PageTitle);
				break;
			}
			else
			{
				continue;
			}
		}
	}
	
	public void searchDropdown () throws NumberFormatException, InterruptedException
	{
		String name = "A";
		String All_listed_Items = null;
		Searchbar.sendKeys(name);
		Assist.wait.NormalWait();
		//submiticon.click();
		//Assist.wait.NormalWait();
		
		for (WebElement searchlist:Search_Results)
		{
			  All_listed_Items =searchlist.getText();
			  
			if (All_listed_Items.equals(null))
			{
				
		        break;
			}
			else
			{
				System.out.println(All_listed_Items);
				ListenHere.Create.log(Status.INFO, "Listed items from DropDown: " + name+All_listed_Items);
				
				continue;
			}	  

		}
		
	    Assist.wait.NormalWait();
		ListenHere.Create.log(Status.INFO, "Search dropdown is verifed");
	
	}
	
	public void Select_a_Item_Dropdown () throws NumberFormatException, InterruptedException
	{
		Random rand=new Random();
		char char_randomvalue = (char) (rand.nextInt(26) + 'A');
		//char randomChar =(char) rand.nextInt(26);
		String word = String.valueOf(char_randomvalue);
		String All_listed_Items = null;
		Searchbar.sendKeys(word);
		Assist.wait.NormalWait();
		
		for (WebElement searchlist:Search_Results)
		{
			
			  All_listed_Items =searchlist.getText();
			  
			if (All_listed_Items.equals(null))
			{
				
		        break;
			}
			else
			{
				System.out.println(All_listed_Items);
				searchlist.click();
				Assist.wait.NormalWait();
				String Pagename=Assist.title();
				ListenHere.Create.log(Status.INFO, "LISTED ITEM: " + word+All_listed_Items  );
				ListenHere.Create.log(Status.INFO, "ACTUAL PAGE TITLE: "+Pagename);
				
				 break;
				
			}	  

		}
		
	    Assist.wait.NormalWait();
		ListenHere.Create.log(Status.INFO, "Search dropdown is verifed");
	
	}
	
	
	public void selectlocation_Pincode() throws NumberFormatException, InterruptedException
	{
		location.click();
		Assist.wait.NormalWait();
	    Random rand=new Random();
	    int one=rand.nextInt(1000)+600000;
		String value=String.valueOf(one);
		System.out.println(value);
		NumberField.sendKeys(value);
		Assist.wait.NormalWait();
		Apply.click();
		ListenHere.Create.log(Status.INFO, "Pincode used: " + value);
		Assist.wait.NormalWait();
		
		
		
	}
	
	public void selectlocation_signin() throws NumberFormatException, InterruptedException
	{
		location.click();
		
		Assist.wait.NormalWait();
		
		signin.click();
		
		logo_Signin.isDisplayed();
		Assert.assertTrue(true);
		
		Assist.wait.NormalWait();
		
		
	}

	
	
}
