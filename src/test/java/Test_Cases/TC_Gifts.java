package Test_Cases;

import java.lang.annotation.Target;

import org.testng.annotations.Test;

import Page_Object.Gifts;

public class TC_Gifts extends BaseStart {
     
	 @Test (priority = 1, groups = {"Regression"})
	public void TC_001_List() throws NumberFormatException, InterruptedException
	{
		Gifts run = new Gifts(driver);
		run.list_of_categories();
	}
	
	 @Test(groups = {"Regression"})
	public void TC_002_carousel() throws NumberFormatException, InterruptedException
	{
		Gifts run = new Gifts(driver);
		run.generic();
		run.carousel();
	}
	
	 @Test(groups = {"Smoke"})
	public void TC_003_items() throws NumberFormatException, InterruptedException
	{
		Gifts run = new Gifts(driver);
		run.generic();
		run.all_items();
	}
	
	
}
