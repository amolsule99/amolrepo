package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactoryMMT 
{
	public WebDriver driver;
	
	static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser Value ="+browser);
	
	
	      if(browser.equals("chrome"))
	         {
		       WebDriverManager.chromedriver().setup();
		       tlDriver.set(new ChromeDriver());
	         }
	
	      else if(browser.equals("firefox"))
	       {
		      WebDriverManager.firefoxdriver().setup();
	       }
	
	      else
	        {
		      System.out.println("Pass the correct browser");
	         }
	
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
	
	}
	
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get(); //get webdriver
	}

}
