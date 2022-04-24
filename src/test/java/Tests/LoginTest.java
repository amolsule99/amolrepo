package Tests;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners (utilities.TestNGListner.class)

public class LoginTest extends BaseTest {

	
	//String url="https://opensource-demo.orangehrmlive.com";
	
	LoginPage lpg;
	
	//public WebDriver driver;
	
	@Test
	public void initialization()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Browser Drives\\Chrome Driver 96 Version\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		//driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		lpg=new LoginPage(driver);
		
	}
	
	@Test
	public void navigate()
	{
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	@Test(dependsOnMethods="navigate")
	public void login()
	{
		//Assert.assertEquals(false, true);
		lpg.login();
	
		
		
	}
	
	
	
}

