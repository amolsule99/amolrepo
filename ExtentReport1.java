package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport1 
{
	
	

	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
	//report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html",true);
	report = new ExtentReports("D:\\Users\\WFH\\Desktop\\traning\\ExtentReportResults.html",true);
	test = report.startTest("ExtentDemo");
	
	//test = report.startTest("extentReportsDemo");
	
	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	String title=driver.getTitle();
	   if(title.equals("Google"))
	    {
	     test.log(LogStatus.PASS, "Navigated to the specified URL");
	    }
	  else
	   {
		test.log(LogStatus.FAIL, "Test Failed");
		}
	}
	
  
		
	    @AfterClass
		public static void endTest()
		{
		report.endTest(test);
		report.flush();
		}

}
