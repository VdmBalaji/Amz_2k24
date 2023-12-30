package Test_Cases;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object.Product_Detail;
import Utilities.Assist;

public class TC_Product_Detail extends BaseStart{

	@Test
	public void TC_001() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.Logo_test();
	}
	
	
	@Test
	public void TC_002() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.order();
		
	}
	
	@Test
	public void TC_003_search_product() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.Search_a_product();
	}
	
	@Test
	public void TC_004_product_page() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.product_page();
	}
	
	@Test
	public void TC_005_EMI() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.product_page();
		run.EMI();
	}
	
	@Test
	public void TC_006_SeeMore() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.product_page();
		run.seemore();
	}
	
	@Test (dataProvider="carouseldata")
	public void TC_007_carousel(String laptopname) throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.product_page();
		run.carousel(laptopname);
	}
	
	@DataProvider (name="carouseldata")
	public String[] data_provider_for_carousel()
	{
		return Assist.carousel();
	}
	
	@Test
	public void TC_008_pagenation_next() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		run.pagenation();
	}
	
	@Test
	public void TC_009_pagenation_previous() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		//run.pagenation();
		run.pagenation_previous();
	}
	
	@Test
	public void TC_0010() throws NumberFormatException, InterruptedException
	{
		Product_Detail run=new Product_Detail(driver);
		//run.pagenation();
		run.pagenation_previous();
	}

}
