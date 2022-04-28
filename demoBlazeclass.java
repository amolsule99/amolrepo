package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBlazeclass 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoblaze.com/#");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,300)");
		
		WebElement laptopButton=driver.findElement(By.linkText("Laptops"));
		
		laptopButton.click();
		
		
		//WebElement price=driver.findElement(By.xpath("//div[@class=\"card-block\"]//h5"));
		
		WebElement price=driver.findElement(By.xpath("//div[@class=\"card-block\"]//h5[text()=\"$790\"]"));
		
		System.out.println("price="+price.getText());
		
		String value=price.getText();
		
		String path=("D:\\Users\\WFH\\Desktop\\traning\\Excel\\write.xlsx");
		
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		sheet.createRow(1).createCell(0).setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream(file);
		
		wb.write(fos);
		
		wb.close();
		
		driver.close();
		System.out.println("Test Completed");
		
		

	}

}
