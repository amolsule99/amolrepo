package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {

	
	@Test
	public void titleCheck()
	{
 
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		String expecTitle="SeleniumDev";
		
		String actualTitle=driver.getTitle();
		
		//Assert.assertEquals(actualTitle, expecTitle);//hard assert
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualTitle, expecTitle);
		
		
		WebElement charity=driver.findElement(By.linkText("Charity supporting the Ukrainian army"));
		  
		  charity.click();
		  
		   driver.close();
		  
		  System.out.println("Test Complete");
		
		  softAssert.assertAll();
		
	}
	public static void main(String[] args)
	{
		
		
		
		
	}

}
