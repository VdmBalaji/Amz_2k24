package Utilities;

import java.io.File;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.TestListenerAdapter;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport extends TestListenerAdapter {

	
	
	
	public static ExtentReports GenerateReport()
	{
	Date today=new Date();
	SimpleDateFormat sm=new SimpleDateFormat("dd-MM-hh-mm");
    String date = sm.format(today);

	ExtentReports report = new ExtentReports();
	//D:\PathofEC\TATA_cliQ\ExtentReport
	
	String userdir = System.getProperty("user.dir");
	//String path = File.separator+"ExtentReport"+File.separator+ "Report " +date+".html";
	String path = File.separator+"ExtentReport"+File.separator+ "Report " +".html";
	
	
	File filename = new File(userdir +File.separator+ path);
	
	ExtentSparkReporter ext=new ExtentSparkReporter(filename);
	
	ext.config().setTheme(Theme.DARK);
	
	ext.config().setReportName("Testing Report 2023");
	
	ext.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
	
	report.attachReporter(ext);
	report.setSystemInfo("Application URL","https://www.amazon.in/");
	
	report.setSystemInfo("Browser","Chrome");
	report.setSystemInfo("OS",System.getProperty("os.name"));
	report.setSystemInfo("User","Balaji");
      
		
	return report;
	
	}
	
}
