package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*WebElement loginButton=driver.findElement(By.xpath("//div[@class=\"makeFlex hrtlCenter prependTop5 appendBottom40\"]//li[contains(@class,\"makeFlex hrtlCenter font10 \")]"));
		
		loginButton.click();*/
		
		//WebDriverWait wait=new WebDriverWait(driver,10);
		
		WebElement from=driver.findElement(By.xpath("//div[@class=\"fsw_inputBox searchToCity inactiveWidget \"]//input[@class=\"fsw_inputField lineHeight36 latoBlack font30\"]"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(from)).click();
		
		
		from.click();
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
		
		

	}

}
