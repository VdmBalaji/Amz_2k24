package Test_Cases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object.logger;
import Utilities.Assist;

public class TC_logger extends BaseStart {
	
	@Test (priority =1 , groups="Regression")
	public void TC_001() throws NumberFormatException, InterruptedException
	{
		logger run = new logger(driver);
		run.log();
		
	}
	
	
	@Test (dataProvider = "vdm", groups="smoke")
	public void TC_002(String ur , String p) throws NumberFormatException, InterruptedException
	{
		logger run = new logger(driver);
		run.log();
		run.enter(ur, p);
	}
	
	@DataProvider (name = "vdm")
	public String[][] giver()
	{
		
		return Assist.ware();
	}
	

}
