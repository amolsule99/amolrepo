package day1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ISTQBAutomate
{

	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://istqb.in/");
		
		WebElement foundation=driver.findElement(By.xpath("//ul[@class=\"uk-navbar-nav uk-hidden-small\"]//li[@class=\"uk-parent\"]//a[text()=\"Foundation\"]"));
		Actions action=new Actions(driver);
		
		action.moveToElement(foundation).perform();
		
		
		
		
		WebElement certifiedTester=driver.findElement(By.xpath("//div[@class=\"uk-width-1-2\"]//a[text()=\"CERTIFIED TESTER\"]"));
		
		WebDriverWait wait =new WebDriverWait(driver,15);
		
		wait.until(ExpectedConditions.visibilityOf(certifiedTester));
		
		/*FluentWait<WebDriver>fwait=new FluentWait<WebDriver>(driver);
		
		fwait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(50)).ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.visibilityOf(certifiedTester));*/
		
		certifiedTester.click();
	}

}
