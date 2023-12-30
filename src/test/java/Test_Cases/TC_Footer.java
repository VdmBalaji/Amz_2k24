package Test_Cases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object.Footer;
import Utilities.Assist;
import Utilities.Data;

public class TC_Footer extends BaseStart{
	
	@Test
	public void TC_001_BacktoTop()
	{
		
		Footer run=new Footer(driver);
		run.BacktoTop();
		
	}
	
	@Test
	public void TC_002_Foot_categories()
	{
		
		Footer run=new Footer(driver);
		run.Foot_Heading();
		
	}
	
	@Test (dataProvider="Foot_data")
	public void TC_003_Footer_Links(String value) throws NumberFormatException, InterruptedException
	{
		
		Footer run=new Footer(driver);
		run.Footer_Links(value);
		
	}
	
	@DataProvider (name="Foot_data")
	public  String[][] Data_for_Footer() throws IOException
	{
		return Data.footerdata();
	  	
	}
	
	@Test 
	public void TC_004_Footer_Logo() throws NumberFormatException, InterruptedException
	{
		
		Footer run=new Footer(driver);
		run.footer_logo();
		
	}
	
	@Test 
	public void TC_005_Language_Dropdown() throws NumberFormatException, InterruptedException
	{
		
		Footer run=new Footer(driver);
		run.language();
		
	}
	
	@Test (dataProvider = "All country name")
	public void TC_006_Country(String country_all) throws NumberFormatException, InterruptedException
	{
		
		Footer run=new Footer(driver);
		run.country_list(country_all);
		
	}
	
	@DataProvider (name="All country name")
	public  String[] dataproviderfor_Country_name()
	{
		return Assist.country_list();
	}
	
	@Test (dataProvider="All list")
	public void TC_007_MoreonAmazon (String list) throws NumberFormatException, InterruptedException  
	{
		
		Footer run=new Footer(driver);
		run.MoreItems(list);
		
	}
	
	@DataProvider (name="All list")
	public  String[] dataproviderfor_More_Amazon()
	{
		return Assist.MoreonAmazon();
	}
	
	

	@Test 
	public void TC_006_Terms_Privacy_Ad() throws NumberFormatException, InterruptedException
	{
		
		Footer run=new Footer(driver);
		run.terms_privacy_ad();
		
	}

}
