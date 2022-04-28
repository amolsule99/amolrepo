package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(iframe);
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		
		WebElement droppable=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(draggable, droppable).perform();
		
		Thread.sleep(10000);

		System.out.println("Test Completed");
		
		driver.close();
	}

}
