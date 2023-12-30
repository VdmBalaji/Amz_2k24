package Test_Cases;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object.SignUp;
import Utilities.Data;

public class TC_CreateAccount extends BaseStart {

	@Test (dataProvider="data")
	public void TC_001_CreateAccount(String name,String country,String num,String mailid,String pass) throws NumberFormatException, InterruptedException
	{
		SignUp run=new SignUp(driver);
		run.CreateaAccount(name,country, num, mailid, pass);
	}

	
	
	@DataProvider (name = "data")
	public String[][] getdata() throws IOException
	{
		return Data.Fetchdata();
		
	}
	/*@DataProvider (name = "data")
	public String [][] Fetchdata() throws IOException
	{
		String one = System.getProperty("user.dir");
		String two = File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"Test_Data"+File.separator+"AccInfo.xlsx";
		String PathOfFile = one + File.separator+two;
		
		XSSFWorkbook File=new XSSFWorkbook(PathOfFile);
		
		XSSFSheet page=File.getSheet("Sheet1");
		int row=page.getLastRowNum();
		int coloumn =page.getRow(0).getLastCellNum();
		
		System.out.println("total row " +row);
		System.out.println("total col " + coloumn);

       String Auth [][] = new String [row][coloumn];
		
		
		for (int i=1 ; i<=row ; i++)  
		{
			for (int j=0 ; j<coloumn ; j++) 
			{
				DataFormatter df = new DataFormatter();
				
				Auth [i-1][j] = df.formatCellValue(page.getRow(i).getCell(j));
	
			}
		}
		
		System.out.println(Arrays.toString(Auth));
		return Auth ;
		
		
		
	}*/
	
	
	

}
