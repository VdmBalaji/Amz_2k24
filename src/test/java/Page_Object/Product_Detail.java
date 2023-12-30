package Page_Object;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.sym.Name;

import Listeners.ListenHere;
import Test_Cases.BaseStart;
import Utilities.Assist;

public class Product_Detail extends BaseStart{

	public Product_Detail(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, Header.class);
		PageFactory.initElements(driver, this);
	}
	
	//a[@id='nav-orders']
	@FindBy
	(xpath="//a[@id='nav-orders']")
	WebElement order;
	
	//form//input[@id='low-price']

	@FindBy
	(xpath="//form//input[@id='low-price']")
	WebElement low_price;
	
	@FindBy
	(xpath="//form//input[@id='high-price']")
	WebElement high_price;
	@FindBy
	(xpath="//span[@id='a-autoid-1']//span[@id='a-autoid-1-announce']")
	WebElement Go;
	@FindBy
	(xpath="//div[@class='a-section s-range-input-container s-upper-bound']")
	WebElement lowrange0;
	
	
	@FindBy
	(xpath="//div[@class='a-section s-range-input-container s-lower-bound aok-relative']//input[@max='50']")
	WebElement lowrangemax;
	
	@FindBy
	(partialLinkText ="Pavilion Gaming Laptop AMD Ryzen 5 5600H 15.6 inch(39.6cm) FHD Micro-edge IPS Laptop (8GB RAM /512GB SSD/NVIDIA GeForce GTX 1650 4GB Graphics/Win 11/144 Hz/MSO 2019/Backlit Keyboard/B&O)15-EC2144AX")
	WebElement lap;
	
	@FindBy
	(xpath ="//span[@id='productTitle']")
	WebElement title;
	
	//
	
	@FindBy
	(xpath ="//span[@id='a-autoid-8']//span[@class='a-button-inner']")
	WebElement Img1;
	
	
		
	@FindBy
	(xpath ="//span[@id='a-autoid-9']//span[@class='a-button-inner']")
	WebElement Img2;
	
	
	
	@FindBy
	(xpath ="//img[@id='landingImage']")
	public static WebElement LandingImage;
	
	
	
	@FindBy
	(xpath ="//div[@id='ivImage_0']")
	WebElement Img3;
	
	//div[@id='ivImage_1']
	
	@FindBy
	(xpath ="//div[@id='ivImage_1']")
	WebElement Img4;
	
	
	
	@FindBy
	(xpath ="//button[@class=' a-button-close a-declarative a-button-top-right']//i[@class='a-icon a-icon-close']")
	WebElement close;

	
	@FindBy
	(xpath ="//a[@id='bylineInfo'][text()='Brand: HP']")
	WebElement BrandHp;
	
	
	@FindBy
	(xpath ="//div[@id='averageCustomerReviews_feature_div']//i[@class='a-icon a-icon-popover']")
	WebElement Rating;
	
	
	
	@FindBy
	(xpath ="//a[@id='acrPopoverLink']")
	WebElement Seecustomerreviews;
	
	//h3[@id='cr-media-carousel-heading'][text()='Reviews with images']
	
	@FindBy
	(xpath ="//h3[@id='cr-media-carousel-heading'][text()='Reviews with images']")
	WebElement review;
	
	
	//div[@id='averageCustomerReviews_feature_div']//span[@id='acrCustomerReviewText']
	
	@FindBy
	(xpath ="//div[@id='averageCustomerReviews_feature_div']//span[@id='acrCustomerReviewText']")
	WebElement Rating2;
	
	
	
	@FindBy
	(xpath ="//a[@id='askATFLink']//span[@class='a-size-base']")
	WebElement Answer;
	
	
	@FindBy
	(xpath ="//h2[@class='a-color-base askWidgetHeader']")
	WebElement Anssection;
	
	//div//i[@class='a-icon a-accordion-radio a-icon-radio-active']
	
	@FindBy
	(xpath ="//div[@id='buyBackAccordionRow']//div[@role='button']")
	WebElement rado1;
	
	
	
	@FindBy
	(xpath ="//div[@id='newAccordionRow_0']")
	WebElement rado2;
	
	
	
	@FindBy
	(xpath ="//a[@id='mbbPopoverLink'][text()='2 Years Total Protection Plan']")
	WebElement TwoYearproplan;
	
	
	@FindBy
	(xpath ="//div[@class='a-column a-span4 a-span-last']//span[@class='a-button-inner']//button[@id='a-autoid-1-announce']")
	WebElement buttonskip;
	
	
	
	@FindBy
	(xpath ="//label[@for='mbb-offeringID-1']//input[@id='mbb-offeringID-1']")
	WebElement checkbox1;
	
	
	
	@FindBy
	(xpath ="//label[@for='mbb-offeringID-2']//a[text()='Extended Warranty by Acko']")
	WebElement Extended;
	
	
	
	@FindBy
	(xpath ="//div[@class='a-column a-span4 a-span-last']//span[@class='a-button-inner']//button[@id='a-autoid-2-announce']")
	WebElement Addprotection;
	
	//label[@for='mbb-offeringID-3']//input[@id='mbb-offeringID-3']
	
	@FindBy
	(xpath ="//label[@for='mbb-offeringID-3']//input[@id='mbb-offeringID-3']")
	WebElement checkbox3;
	
	
	
	@FindBy
	(xpath ="//span[@id='submit.add-to-cart']")
	//span[@id='submit.add-to-cart-announce']
	WebElement AddtoCart;
	
	

	@FindBy
	(xpath ="//a[@aria-label='Exit this panel and return to the product page. ']")
	WebElement close2;
	
	
	
	
	@FindBy
	(xpath ="//div[@id='buyNow']")
	WebElement BuyNow;
	
	
	
	
	@FindBy
	(xpath ="//a[@id='trigger_emioptions']")
	WebElement EMIOptions;
	
	
	
	@FindBy
	(xpath ="//span[@class='a-size-base inemi-installment-plan-tab-title']")
	List <WebElement> Threeoptions;
	
	
	
	@FindBy
	(xpath ="//h4[@class='a-size-base a-color-base a-text-center inemi-installment-plan-table-title a-text-bold']")
	WebElement Heading;
	
	
	@FindBy
	(xpath ="//table[@class='a-bordered inemi-plans-table']//tr")
	WebElement Tablecontents;
	
	@FindBy
	(xpath ="//span[@class='a-list-item a-size-small a-color-secondary']")
	WebElement Ptag;

	
	@FindBy
	(xpath ="//div[@id='debit-toggle-switch']//div[@data-action='a-switch']")
	WebElement Toggle;

	@FindBy
	(xpath ="//span[@class='a-expander-prompt']//p[@id='inemi-bank-name'][contains(.,'HDFC Bank Debit Card')]")
	WebElement Bank;
	
	
	
	@FindBy
	(xpath ="//div[@class='inemi-footer-note']//p//a[text()='Learn more']")
	WebElement LearnMore;
	
	
	@FindBy
	(xpath ="//span[@class='a-expander-prompt']//p[@id='inemi-bank-name']")
	List <WebElement> AllBank;
	
	
	
	@FindBy
	(xpath ="//div[@class='inemi-footer-note']//span//a[text()='click here']")
	WebElement clickhere;
	
	
	@FindBy
	(xpath ="//div[@id='credit-toggle-switch']//div//a[@class='a-switch-control']")
	WebElement Toggle2;
	
	//span[@class='a-expander-prompt'][text()='See more']
	
	@FindBy
	(xpath ="//div[@id='poToggleButton']//a[@role='button']")
	WebElement SeeMore;
	
	
	
	
	@FindBy
	(xpath ="//a[@id='seeMoreDetailsLink']")//a[@id='seeMoreDetailsLink']
	WebElement detail;
	
	
	
	
	@FindBy
	(xpath ="//div[@id='prodDetails']//h2[text()='HP Pavilion Gaming Laptop Information']")
	WebElement ProdInfo;
	
	//a[@id='a-autoid-16']//span[@class='a-button-inner']
	
	@FindBy
	(xpath ="//a[@id='a-autoid-16']//span[@class='a-button-inner']")
	WebElement carousel;
	
	
	//li[@class='a-carousel-card']//div//a[@class='a-link-normal']//div[@title]   ------1
	//a[@class='a-link-normal'][@title]//div[@aria-hidden='true']-----2
	//a[@class='a-link-normal'][@title]---3
	
	@FindBy
	(xpath ="//a[@class='a-link-normal'][@title]")
	List <WebElement> carouselItems;
	
	
	@FindBy
	(xpath ="//span[@class='s-pagination-strip']//a[@href][text()='Next']")
	WebElement Next;
	

	@FindBy
	(xpath ="//span[@class='s-pagination-item s-pagination-selected'][@aria-label][text()]")
	WebElement pagenumber;
	
	
	
	@FindBy
	(xpath ="//a[text()='Previous']")
	WebElement Previous;
	
	
	
	
	public void Logo_test() throws NumberFormatException, InterruptedException
	{
		Header.logo.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.wait.NormalWait();
	}
	
	public void order() throws NumberFormatException, InterruptedException
	{
		order.click();
		Assist.wait.NormalWait();
	}
	public void Search_a_product() throws NumberFormatException, InterruptedException
	{
		Header.Searchbar.sendKeys("hp pavilion ryzen 5 5600h");
		ListenHere.Create.log(Status.INFO, "Product name is typed");
		Assist.NormalWait();
		Header.submiticon.click();
		ListenHere.Create.log(Status.INFO, "Product is searched");
		Assist.wait.NormalWait();
		/*low_price.sendKeys("63000");
		ListenHere.Create.log(Status.INFO, "MIN value is entered");
		Assist.wait.NormalWait();
		high_price.sendKeys("65000");
		ListenHere.Create.log(Status.INFO, "MAX value is entered");
		Assist.wait.NormalWait();*/
		//Go.click();
		Assist.move(lowrange0);
		System.out.println("done");
		Assist.wait.NormalWait();
		lowrange0.getLocation();
		System.out.println(lowrange0.getLocation());
		Assist.DragandDrop(lowrange0,13,0);
		Assist.wait.NormalWait();
		
	}
	public void product_page() throws NumberFormatException, InterruptedException
	{
		Header.Searchbar.sendKeys("hp pavilion ryzen 5 5600h");
		ListenHere.Create.log(Status.INFO, "TC_001: PRODUCT NAME IS TYPED");
		Assist.wait.NormalWait();
		Header.submiticon.click();
		ListenHere.Create.log(Status.INFO, "TC_002: PRODUCT IS SEARCHED");
		Assist.NormalWait();
		Assist.move(lap);
		lap.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.wait.NormalWait();
		Assist.windowhandler();
		
		Assist.wait.NormalWait();
		String productname=title.getText();
		if (productname.contains("15-EC2144AX"))
		{
			ListenHere.Create.log(Status.INFO, "TC_003: " + productname +" IS DISPLAYED");
		}
		/*LandingImage.click();
		Assist.wait.NormalWait();
		ListenHere.Create.log(Status.INFO, "TC_004: " +LandingImage +" IS SELECTED");
		Img3.click();
		ListenHere.Create.log(Status.INFO, "TC_005: Thumbnail image 1 IS SELECTED");
		Assist.wait.NormalWait();
		Img4.click();
		ListenHere.Create.log(Status.INFO, "TC_005: Thumbnail image 2 IS SELECTED");
		Assist.wait.NormalWait();
		//close.click();
		Assist.refresh();
		ListenHere.Create.log(Status.INFO, "TC_006: Close IS SELECTED");
		BrandHp.sendKeys(Keys.CONTROL,Keys.RETURN);
		Assist.windowhandler();
		String hp=Assist.title();
		System.out.print(hp);
		Assist.SoftAssert.assertEquals(hp, "Amazon.in : HP");
		ListenHere.Create.log(Status.INFO, "TC_007: HP is verified");
		Assist.close();
		Assist.windowhandler();
		Assist.move(Rating);
		Rating.click();
		Assist.wait.NormalWait();
		Assist.move(Seecustomerreviews);
		Seecustomerreviews.click();
		Assist.wait.NormalWait();
		String b=review.getText();
		Assist.SoftAssert.assertEquals(b, "Reviews with images");
		ListenHere.Create.log(Status.INFO, "TC_008: Review is passed");
		Assist.back();
		//Rating2
		Assist.SoftAssert.assertTrue(Rating2.isDisplayed());
		Rating2.click();
		ListenHere.Create.log(Status.INFO, "TC_009: Rating is verfied");
		Assist.NormalWait();
		Assist.back();*/
		/*Answer.click();
		Assist.NormalWait();
		Assist.SoftAssert.assertEquals("Looking for specific info?", Anssection.getText());
		ListenHere.Create.log(Status.INFO, "TC_0010: Answer is verfied");
		
		Assist.NormalWait();
		Assist.SoftAssert.assertTrue(rado1.isEnabled());
		rado1.click();
		ListenHere.Create.log(Status.INFO, "TC_0011: rado1 is verfied");
		Assist.NormalWait();
		Assist.SoftAssert.assertTrue(rado2.isEnabled());*/
		/*rado2.click();
		ListenHere.Create.log(Status.INFO, "TC_0012: rado2 is verfied");
		Assist.NormalWait();
		/*TwoYearproplan.click();
		Assist.NormalWait();
		Assist.move(buttonskip);
		Assist.SoftAssert.assertEquals("Skip", buttonskip.getText());
		buttonskip.click();
		Assist.NormalWait();
		ListenHere.Create.log(Status.INFO, "TC_0013: skip is verfied");
		Assist.SoftAssert.assertTrue(checkbox1.isEnabled());
		checkbox1.click();
		ListenHere.Create.log(Status.INFO, "TC_0014: checkbox is verfied");
		Assist.NormalWait();
		Assist.SoftAssert.assertEquals(Extended.getText(), "Extended Warranty by Acko");
		Extended.click();
		Assist.NormalWait();
		Assist.move(Addprotection);
		Assist.NormalWait();
		Addprotection.click();
		ListenHere.Create.log(Status.INFO, "TC_0016: Add protection is verfied");
		Assist.NormalWait();
		checkbox3.click();*/
		/*Assist.move(AddtoCart);
		Assist.SoftAssert.assertEquals(AddtoCart.getText(), "Add to Cart");
		AddtoCart.click();
		ListenHere.Create.log(Status.INFO, "TC_0016: Add to Cart is verfied");
		Assist.NormalWait();
		close2.click();
		Assist.NormalWait();
		Assist.SoftAssert.assertEquals(BuyNow.getText(), "Buy Now");
		BuyNow.click();
		Assist.NormalWait();
		Assist.SoftAssert.assertEquals(Assist.title(), "Amazon Sign In");
		Assist.back();*/
		
		Assist.SoftAssert.assertAll();
	}
	
	
	public void EMI() throws NumberFormatException, InterruptedException
	{
		Assist.move(EMIOptions);
		EMIOptions.click();
		Assist.NormalWait();
		
		for (WebElement one: Threeoptions)
		{
			String name =one.getText();
			System.out.println(name);
			if (name.equalsIgnoreCase("Debit Card EMI"))
			{
				one.click();
				/*Assist.NormalWait();
				Bank.click();
				Assist.NormalWait();
				Assert.assertTrue(Toggle.isEnabled());
				Toggle.click();
				Assist.NormalWait();
				Assist.move(LearnMore);
				LearnMore.sendKeys(Keys.CONTROL,Keys.RETURN);
				Assist.windowhandler();
				Assist.NormalWait();
				Assert.assertEquals(Assist.title(), "Amazon.in: Debit Card EMI");
				ListenHere.Create.log(Status.INFO, "Debit Card EMI is verfied");
				Assist.close();
				Assist.windowhandler();	
				Assist.NormalWait();
				EMIOptions.click();*/
			}
			else if (name.equalsIgnoreCase("Amazon Pay Later"))
			{
				one.click();
				Assist.NormalWait();
				/*String Heading1=Heading.getText();
				System.out.print(Heading1);
				ListenHere.Create.log(Status.INFO, "Amazon Pay Later-" + "Heading: " + Heading1);
				String content = Tablecontents.getText();
				System.out.print(content);
				ListenHere.Create.log(Status.INFO, "Amazon Pay Later-" + "Contents Displayed: " + content);
				String p = Ptag.getText();
				System.out.print(p);
				ListenHere.Create.log(Status.INFO, "Amazon Pay Later-" + "others: " + p);*/
				Assist.NormalWait();
				ListenHere.Create.log(Status.INFO, "Amazon pay later is displayed");
				
				
			}
			else if (name.equalsIgnoreCase("Other EMIs"))
			{
				one.click();
				Assist.NormalWait();
				//Toggle.click();
				for (WebElement get:AllBank)
				{
					String n=get.getText();
					System.out.println(get.getText());
					if (n.startsWith("SBI Credit Card"))
					{
						Assist.move(get);
						Assist.NormalWait();
						get.click();
						ListenHere.Create.log(Status.INFO, "SBI detail is displayed");
					}
				}
				Assist.move(Toggle2);
				Toggle2.click();
				Assist.NormalWait();
				ListenHere.Create.log(Status.INFO, "Toggle is enabled");
				Assist.move(clickhere);
				clickhere.click();
				Assist.NormalWait();
				ListenHere.Create.log(Status.INFO, "clickhere is selected");
			
			}
			
			else
			{
				break;
			}
		}
	}
	
	public void seemore() throws NumberFormatException, InterruptedException
	{
	    Assist.move(SeeMore);
		SeeMore.click();
		Assist.NormalWait();
		Assist.move(detail);
		detail.click();
		Assist.NormalWait();
		Assert.assertEquals(ProdInfo.getText(), "HP Pavilion Gaming Laptop Information");
		ListenHere.Create.log(Status.INFO, "SeeMore is Verified");
		
	}
	
	public void carousel (String laptopname) throws NumberFormatException, InterruptedException
	{
		//System.out.println("NAMMMMMMMMMMMM: " +laptopname );
		String name = null;
		Assist.move(carousel);
		Assist.NormalWait();
		int size=carouselItems.size();
		System.out.println("SIZE OF ITEMS:" +size);
			int i=1;
		do
		{
			i++;
		for (WebElement laptop: carouselItems)
		{
			name=laptop.getText();
			System.out.println( name);
			if (name.startsWith(laptopname))
			{
				Assist.move(laptop);
				Assist.NormalWait();
				laptop.click();
				Assist.windowhandler();
				Assist.NormalWait();
				Assist.close();
				Assist.windowhandler();
				ListenHere.Create.log(Status.INFO,name+ " IS DISPLAYED");
				Assist.NormalWait();
				break;
			}
			
			
			
		}
		
		carousel.click();
		Assist.NormalWait();
		System.out.println(i);
		
		}while(!name.startsWith(laptopname)&& i<13);
		
	}
	
	public void pagenation() throws NumberFormatException, InterruptedException
	{
		Header.Searchbar.sendKeys("hp");
		Assist.NormalWait();
		Header.submiticon.click();
		
		for (int i=2;i<7;i++)
		{
			Assist.move(Next);
			Assist.NormalWait();
			Next.click();
			Assist.NormalWait();
			ListenHere.Create.log(Status.INFO,"Next button is selected");
			String number = pagenumber.getText();
			System.out.println(number);
			if (i==Integer.parseInt(number))
			{
				ListenHere.Create.log(Status.INFO,"Current page value is: " + number);
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
	}
	
	public void pagenation_previous () throws NumberFormatException, InterruptedException
	{
		Header.Searchbar.sendKeys("hp");
		Assist.NormalWait();
		Header.submiticon.click();
		/*Assist.move(Next);
		Next.click();
		Assist.NormalWait();
		//Assist.move(Next);
		//Assist.NormalWait();
		Assist.move(Previous);
		Previous.click();
		Assist.NormalWait();*/
		
		for (int i=2;i<7;i++)
		{
			Assist.move(Next);
			Assist.NormalWait();
			Next.click();
			Assist.NormalWait();
			ListenHere.Create.log(Status.INFO,"Current page value is: " + i);
		}
		
		for (int i=5;i>=1;i--)
		{
			System.out.println(i);
			Assist.move(Previous);
			Assist.NormalWait();
			Previous.click();
			Assist.NormalWait();
			//ListenHere.Create.log(Status.INFO,"Previous is selected");
			String number = pagenumber.getText();
			System.out.println(number);
			if (i==Integer.parseInt(number))
			{
				ListenHere.Create.log(Status.INFO,"Previous is selected and current page value is: " + number);
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
	}
	
}
