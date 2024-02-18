package Test_Cases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Listeners.ListenHere;
import Page_Object.Login;

public class TC_Login extends BaseStart{

	@Test
	public void TC_001_SigninPopup () throws NumberFormatException, InterruptedException
	{
		Login run=new Login(driver);
		run.selectlogin();
		
	}
	
	@Test (dataProvider ="AllData")
	public void TC_002_SignIn(String user , String password) throws NumberFormatException, InterruptedException
	{
		Login run=new Login(driver);
		run.Signin(user , password);
		
	}
	
	
	  @DataProvider (name = "AllData")
	  public String[][] getdata()
	  {
	  String data[][] = {{"1212" , "sdffdf"},
			             {"s@w.w" , "1111"},
			             {" " , " "},
	                     {"skbalaji285@gmail.com" , "1234qwerty"},
	                     {"skbalaji285@gmail.com" , "333"} };
	  return data;
	  
	  }
}

