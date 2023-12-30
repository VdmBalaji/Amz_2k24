package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object.Header;
import Utilities.Assist;
import Utilities.Data;

public class TC_Header extends BaseStart {

	
	@Test
	public void TC_001_Logo() throws NumberFormatException, InterruptedException
	{
		Header run=new Header(driver);
		run.Amazonlogo();
		
	}
	
	
	@Test (dataProvider="Categories")
	public void TC_002_Dropdown(String one) throws NumberFormatException, InterruptedException
	{
		
		Header run=new Header(driver);
		run.Dropdown(one);
		
	}
	
	@DataProvider (name="Categories") //Data providing for categories list
	public String[] fetch()
	{
		return Assist.Categoryinheader();
	}
	
	@Test (dataProvider="AllLanguages")
	public void TC_004_Languages(String lang) throws NumberFormatException, InterruptedException
	{
		
		Header run=new Header(driver);
		run.languageDropdown(lang);
		
	}
	
	@DataProvider (name="AllLanguages") //Data providing for languages list
	public String []get()
	{
		return Assist.languagedata();
	}
	
	@Test (dataProvider = "ddd")
	public void TC_005_Account_and_AllList (String value) throws NumberFormatException, InterruptedException
	{
		Header run=new Header(driver);
		run.Accounts_List(value);
	}
	
	@DataProvider (name="ddd")
	public String[][] content() throws IOException
	{
		 return Data.Fetchdata2();
		 
	}
	
	@Test
	public void TC_006_searchDropdown() throws NumberFormatException, InterruptedException
	{
		Header run=new Header(driver);
		run.searchDropdown();
	}
	
	@Test (invocationCount =3)
	public void TC_007_Select_a_Item_Dropdown() throws NumberFormatException, InterruptedException
	{
		Header run=new Header(driver);
		run.Select_a_Item_Dropdown();
	}
	
	@Test (invocationCount =3)
	public void TC_008_Select_Location_pincode() throws NumberFormatException, InterruptedException
	{
		Header run=new Header(driver);
		run.selectlocation_Pincode();
	}
	
	@Test
	public void TC_008_Select_Location_Signin() throws NumberFormatException, InterruptedException
	{
		Header run=new Header(driver);
		run.selectlocation_signin();
	}
	
	
	
	
	
	
	
	
}
