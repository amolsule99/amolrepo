package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll1 {

	public static void main(String[] args) throws InterruptedException
	{
		
           /*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
           
           WebDriver driver=new ChromeDriver();
           
           driver.manage().window().maximize();
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           
           driver.get("https://www.selenium.dev/");
           
         	
           
           
          
           JavascriptExecutor js=(JavascriptExecutor)driver;
        
           //Scroll till perticular WeElement
          // js.executeScript("arguments[0].scrollIntoView(true);", charity);
           
           //Scroll window pixel by pixel
           
           //js.executeScript("window.scrollBy(300,200)");
           
           //Scroll till bottom of page
           
           js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
           
           
           
           
           
           Thread.sleep(5000);
           
           driver.close();
           
           System.out.println("Scroll Complete");*/
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//WebElement button=driver.findElement(By.linkText("Delhi to Mumbai (DEL-BOM)"));
		
		//js.executeScript("arguments[0].scrollIntoView()", button);
		
		//js.executeScript("window.scrollBy(200,300)");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		driver.close();
		
           
           
	}

}
