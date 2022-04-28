package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("Admin");
		//Thread.sleep(5000);
		
		password.sendKeys("admin123");
		//Thread.sleep(5000);
		
		login.click();
		
		//Thread.sleep(5000);
		
		WebElement welcomebtn=driver.findElement(By.linkText("Welcome bittu"));
		welcomebtn.click();
		//Thread.sleep(5000);
		
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		
		
		
		driver.close();
		System.out.println("test completed");
		
		
		
		
	}

}
