package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.hssf.record.chart.DataFormatRecord;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data {
	
	
	public static String [][] Fetchdata() throws IOException
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
		
		/*String Auth[][]=new String [7][5];
		
		
		for (int i=0;i<7;i++)
		{
			for (int j=0;j<5;j++)
			{
				DataFormatter df = new DataFormatter();
				Auth [i][j]=df.formatCellValue(page.getRow(i).getCell(j));
				
			System.out.println(i);
			System.out.println(j);
			System.out.println(Auth [i][j]);
			}
		}
	
		System.out.println(Arrays.toString(Auth));
		return Auth;*/
		
		
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

	}
	
	
	
	
	public static String [][] Fetchdata2() throws IOException
	{
		String one =System.getProperty("user.dir");
		String two=File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"Test_Data"+File.separator+"Latest.xlsx";
		String path = one+File.separator+two;
		XSSFWorkbook file = new XSSFWorkbook(path);
		XSSFSheet page= file.getSheet("Sheet1");
		int totalrow = page.getLastRowNum();
		int totalcolumn = page.getRow(0).getLastCellNum();
		

		System.out.println("total row " +totalrow);
		System.out.println("total col " + totalcolumn);
		
		String data[][] = new String [totalrow][totalcolumn];
		

		for (int i=1 ; i<=totalrow ; i++)  
		{
			for (int j=0 ; j<totalcolumn ; j++) 
			{
				DataFormatter df = new DataFormatter();
				
				data [i-1][j] = df.formatCellValue(page.getRow(i).getCell(j));
				
	
			}
		}
			
		return data;
	}
	
	public static String [][] footerdata() throws IOException
	{
		String one = System.getProperty("user.dir");
		//D:\PathofEC\Amazon_23\src\test\java\Test_Data\Footer.xlsx
		String two = File.separator + "src"+ File.separator + "test"+ File.separator + "java"+ File.separator + "Test_Data"+ 
		             File.separator + "F_1.xlsx";
		String way=one + File.separator+two;
		
		XSSFWorkbook file=new XSSFWorkbook(way);
		XSSFSheet name=file.getSheet("Footer Data");
		int totalrow = name.getLastRowNum();
		int totalcolumn = name.getRow(0).getLastCellNum();
		
		System.out.println("total row " +totalrow);
		System.out.println("total col " + totalcolumn);
		
		String [][] data =new String [totalrow][totalcolumn];
		
		for (int i=1;i<=totalrow;i++)
		{
			for (int j=0;j<totalcolumn;j++)
			{
				DataFormatter df=new DataFormatter();
				data [i-1][j]= df.formatCellValue(name.getRow(i).getCell(j));
				
				System.out.println(i);
				System.out.println(j);
				System.out.println(data [i-1][j]);
			}
		}
		System.out.println(Arrays.toString(data));
		return data;
	}
	
	
}
