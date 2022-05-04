package utilities;
import Tests.LoginTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGListner extends LoginTest  implements ITestListener

{

	//It is simple java class not TestNG class
	//right click here select source-->override/implements methods

	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		ITestListener.super.onTestFailure(result);
         System.out.println("On Test Failure");
		
       // System.setProperty("webdriver.chrome.driver", "C:\\Browser Drives\\Chrome Driver 96 Version\\chromedriver.exe");
		
       // WebDriverManager.chromedriver().setup();
        
        
		//WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		//
		//driver.get("https://opensource-demo.orangehrmlive.com");
         
         
		//Step-2 call Interface TakesScreenshot
		
         TakesScreenshot tsc=(TakesScreenshot)driver;//Down-Casting
 		
 		File source=tsc.getScreenshotAs(OutputType.FILE);
 		
 		File destination=new File("C:\\Users\\vitthal\\eclipse-workspace\\Maven1\\Screenshott\\snap6.png");
 		
 		//(Filefrom,FileTo)
 		try {
 			FileHandler.copy(source, destination);
 			System.out.println("Screen Shot Completed");
 		
 		} 
 		catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} 
		
		driver.close();
		
		
	}
	
		

			
			
			
		

}
