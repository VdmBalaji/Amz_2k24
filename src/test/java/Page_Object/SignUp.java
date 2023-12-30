package Page_Object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import Listeners.ListenHere;
import Utilities.Assist;

public class SignUp {

	public WebDriver driver;
	
	 public SignUp (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 @FindBy
	 (xpath ="asasas")
	 WebElement a;
	 
	   @FindBy(xpath = "//a[@id='nav-link-accountList']")

		WebElement signin;

		@FindBy(xpath = "//span[@class='nav-action-inner']")

		WebElement signup;
		
		@FindBy(xpath = "//a[contains(text(),'Create your Amazon account')]")

		WebElement create;
		
		@FindBy(xpath = "//input[@id='ap_customer_name']")

		WebElement yourname;
		
		@FindBy(xpath = "//input[@id='ap_phone_number']")

		WebElement number;
		
		@FindBy(xpath = "//input[@id='ap_email']")

		WebElement email;
		
		@FindBy(xpath = "//input[@id='ap_password']")

		WebElement password;
		
		@FindBy(xpath = "//input[@id='continue']")

		WebElement cont ;

		
		
		@FindBy(xpath = "//span[@class='a-dropdown-container']//select[@name='countryCode']//option")

		WebElement dropdown ;
		
		@FindBy(xpath = "//span[@id='auth-country-picker-container']//span[@class='a-button-inner']")

		WebElement dd ;

		@FindBy(xpath = "//div[@class='a-popover-wrapper']//ul//li")

		List <WebElement> country ;
		
		
		
		@FindBy(xpath = "//span[@class='a-dropdown-container']//select//option")

		List <WebElement> sucks ;
		
		
		public void CreateaAccount (String name,String country,String num,String mailid,String pass) throws NumberFormatException, InterruptedException
		{
			Assist.move(signin);
			ListenHere.Create.log(Status.INFO, "Moved to Sign in");
			Assist.wait.NormalWait();
			signup.click();
			ListenHere.Create.log(Status.INFO, "signup is selected");
			Assist.wait.NormalWait();
			create.click();
			ListenHere.Create.log(Status.INFO, "Create account is selected");
			Assist.wait.NormalWait();
			yourname.sendKeys(name);
			ListenHere.Create.log(Status.INFO, "Name is entered");
			Assist.wait.NormalWait();			
			//dd.click();
			//Assist.wait.NormalWait();
			/*try {
			Select sl=new Select (dropdown);
			sl.selectByVisibleText("Australia");	
			}
			catch (Exception e)
			{
				
			}*/
			for (WebElement wb:sucks)
			{
				String NameofCountry=wb.getText();
				
				//System.out.println(NameofCountry);
				if (NameofCountry.contains(country))
				{
					wb.click();
					ListenHere.Create.log(Status.INFO, "country is selected");
					break;		
				}
				else
				{
					continue;
					
				}
				
			}
			Assist.wait.NormalWait();
			number.sendKeys(num);
			ListenHere.Create.log(Status.INFO, "Mobile number is entered");
			email.sendKeys(mailid);
			ListenHere.Create.log(Status.INFO, "email is entered");
			Assist.wait.NormalWait();
			password.sendKeys(pass);
			ListenHere.Create.log(Status.INFO, "password is entered");
			Assist.wait.NormalWait();
			cont.click();
			String nameofthepage=driver.getTitle();
			
			if(nameofthepage.equalsIgnoreCase("A"))
			{
				ListenHere.Create.log(Status.INFO, "VALID DATA: Account created successfully");
				Assert.assertTrue(true);
				
			}
			else
			{
				ListenHere.Create.log(Status.INFO, "INVALID DATA: Account is not created");
				Assert.assertTrue(false);
				
			}
			
			Assist.wait.NormalWait();
			Assist.wait.NormalWait();
		}
		
		
		
		
		
		
	
		
}
