package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	
       @BeforeSuite
       public void initilization1()
       {
    	   WebDriverManager.chromedriver().setup();
   		
   		driver=new ChromeDriver();
   		
   		driver.manage().window().maximize();
   		
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		
       }
	  

}
