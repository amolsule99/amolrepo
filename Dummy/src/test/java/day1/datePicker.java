package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(iframe);
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		
		searchBox.click();
		
		while(true)
		{
			
			WebElement title=driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]"));
			WebElement previousClick=driver.findElement(By.xpath("//a[@class=\"ui-datepicker-prev ui-corner-all\"]"));
			//WebElement date=driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody/tr/td/a[text()=\"15\"]"));
			
			if(!title.getText().equalsIgnoreCase("December 2021"))
				{
						previousClick.click();
						
				}
			else
			{
				break;
			}
			
		}
		
		int date1=15;
	//	WebElement date=driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]//table/tbody/tr/td/a[text()=\"10\"]"));
		driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]//table/tbody/tr/td/a[text()="+date1+"]")).click();
		//driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody/tr/td/a[text()="+date1+"]")).click();
		
	
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
