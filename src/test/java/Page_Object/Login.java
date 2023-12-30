package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import Listeners.ListenHere;
import Utilities.Assist;

public class Login {

	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='nav-link-accountList']")

	WebElement signin;

	@FindBy(xpath = "//span[@class='nav-action-inner']")

	WebElement login;

	// h2[normalize-space()='Welcome to Tata CLiQ']

	// button[@class='mobile-number-login__loginCloseBtn']

	@FindBy(xpath = "//i[@aria-label='Amazon']")

	WebElement logo;

	@FindBy(xpath = "//input[@type='email']")

	WebElement EmailorPhonenumber;

	@FindBy(xpath = "//input[@id='continue']")

	WebElement proceed;

	@FindBy(xpath = "//input[@id='ap_password']")

	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")

	WebElement submit;
	
	
	@FindBy(xpath = "//a[@id='nav-logo-sprites']")

	WebElement Amazonhomelogo;

	public void selectlogin() throws NumberFormatException, InterruptedException {

		Assist.move(signin);
		ListenHere.Create.log(Status.INFO, "Moved to Sign in");
		Assist.wait.NormalWait();
		login.click();
		ListenHere.Create.log(Status.INFO, "Signin is selected");
		Assist.wait.NormalWait();
		boolean value = logo.isDisplayed();
		System.out.println(value);
		Assert.assertTrue(value);
		System.out.println("executing");
		logo.click();

	}

	public void Signin(String user , String pass) throws NumberFormatException, InterruptedException {

		Assist.move(signin);
		ListenHere.Create.log(Status.INFO, "Moved to Sign in");
		Assist.wait.NormalWait();
		login.click();
		ListenHere.Create.log(Status.INFO, "Signin is selected");
		Assist.wait.NormalWait();

		boolean value = logo.isDisplayed();

		EmailorPhonenumber.isDisplayed();

		EmailorPhonenumber.sendKeys(user);
		
		Assist.wait.NormalWait();

		ListenHere.Create.log(Status.INFO, "Value is entered in emailormobilenumber field");

		proceed.click();

		ListenHere.Create.log(Status.INFO, "Continue button clicked");
		
		Assist.wait.NormalWait();

		try {
			password.sendKeys(pass);
			
			if (password.isDisplayed())
			{
				ListenHere.Create.log(Status.INFO, "password is entered");
			}
		} catch (Exception e) {
			
			ListenHere.Create.log(Status.INFO, "password field is not displayed because of invalid email or mobile");
			
		}
	
		Assist.wait.NormalWait();

		try {
			submit.click();
			
			if (submit.isDisplayed()) 
			{
				ListenHere.Create.log(Status.INFO, "Submit is clicked");
			} 
		} catch (Exception e) {
			
			ListenHere.Create.log(Status.INFO, "Submit is not displayed because of invalid email or mobile");
		}
		


		Assist.wait.NormalWait();
		
		try {
			
		if (Amazonhomelogo.isDisplayed())
		{
			ListenHere.Create.log(Status.INFO, "VALID DATA: Home page is displayed");
			Assert.assertTrue(true);
		} 
		}
		catch (Exception e)
		{
				ListenHere.Create.log(Status.INFO, "INVALID DATA: Login denied");
				Assert.assertTrue(false);
		}
		

		
		Assist.wait.NormalWait();
	
		}
		
}
