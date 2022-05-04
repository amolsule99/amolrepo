package day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class failureScreenShot
{
	WebDriver driver;
	@BeforeClass
	public void lauchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void login() throws InterruptedException
	{
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		Thread.sleep(5000);
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin121"); //Sending wrong password ,so method will get failed
		Thread.sleep(5000);
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		Thread.sleep(5000);
		
		WebElement AssignLeave=driver.findElement(By.linkText("Assign Leave"));
		AssignLeave.click();
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void screenShot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			
			String screenshotName=result.getName().replaceAll(" ","_");
			TakesScreenshot tsc=(TakesScreenshot)driver;
			
			File source=tsc.getScreenshotAs(OutputType.FILE);
			
			File destination=new File("D:\\Users\\WFH\\Desktop\\traning\\Sacreenshot\\"+screenshotName+".png");
			
			FileHandler.copy(source, destination);
		}
		
		driver.close();
	}
}
