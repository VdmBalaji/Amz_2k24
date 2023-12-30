package Test_Cases;


import org.testng.annotations.Test;

import Page_Object.MenuBar;

public class TC_MenuBar extends BaseStart{

	
	
	@Test(priority=0)
	public void TC_001_Menuicon() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.selectMenu();
	}
	
	@Test(priority=1)
	public void TC_002_Hello() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hello();
	}
	
	@Test(priority=2)
	public void TC_003_BestSeller() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		
		run.bestseller();
	}
	
	@Test(priority=4)
	public void TC_004_NewReleases() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.Newrelease();
	}
	
	@Test(priority=3)
	public void TC_005_MoversAndShakers() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.MoviersShakers();
	}
	
	@Test(priority=3)
	public void TC_006_AmazonMiniTV() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.MiniTv();
	}
	
	@Test
	public void TC_007_EchoandAlexa_Seealldevices() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.EchoAlexa();
		run.seealldevices();
	}
	
	@Test
	public void TC_008_EchoandAlexa_MeetAlexa() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.EchoAlexa();
		run.MeetAlexa();
	}
	
	@Test
	public void TC_009_EchoandAlexa_AlexaSkills() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.EchoAlexa();
		run.AlexaSkills();
	}
	
	@Test
	public void TC_0010_EchoandAlexa_AlexaApp() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.EchoAlexa();
		run.AlexaApp();
	}
	
	@Test
	public void TC_0011_EchoandAlexa_AlexaSmartHome() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.EchoAlexa();
		run.AlexaSmartHome();
	}
	
	
	@Test
	public void TC_0012_EchoandAlexa_AmazonPrimeMusic() throws NumberFormatException, InterruptedException
	{
		MenuBar run=new MenuBar(driver);
		run.hamburgermenuicon();
		run.EchoAlexa();
		run.AmazonPrimeMusic();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
