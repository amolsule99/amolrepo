package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EaseMyTrip {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		
		WebElement sourceTextBox=driver.findElement(By.id("FromSector_show"));
		
		sourceTextBox.click();
		
		Thread.sleep(5000);
		
		
		WebElement from=driver.findElement(By.xpath("//div[@id=\"fromautoFill\"]//span[@id=\"spn12\"]"));
		from.click();
		Thread.sleep(5000);
		
		WebElement destTextBox =driver.findElement(By.id("Editbox13_show"));
		destTextBox.click();
		Thread.sleep(10000);
		
		
    /*	WebElement to=driver.findElement(By.xpath("//div[@id=\"toautoFill\"]//span[@id=\"spn12\"]"));//Delhi
		to.click();
		Thread.sleep(5000);*/
		
		WebElement to=driver.findElement(By.xpath("//div[@id=\"toautoFill\"]//span[@id=\"spn3\"]"));//Mumbai
		to.click();
		
		WebElement checkBoxDefence=driver.findElement(By.xpath("//input[@id=\"chkArmy\"]"));
		checkBoxDefence.click();
		Thread.sleep(5000);
		
		WebElement searchButton=driver.findElement(By.xpath("//input[@class=\"src_btn\"]"));
		searchButton.click();
		Thread.sleep(5000);
		
        String message=driver.switchTo().alert().getText();
		System.out.println(message);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		
		
		
		
		//Actions action=new Actions(driver);
		
		//action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		//Thread.sleep(10000);
		
        driver.close();
		
		System.out.println("Test Completed");
		
		
	}

}
