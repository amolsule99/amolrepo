package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead  
{
	
	
	
	public static String readData()throws IOException, InterruptedException
      {
	   String path=System.getProperty("user.dir")+"\\Utility\\read.xlsx";
	
	   File file=new File(path);
	
	   FileInputStream fis=new FileInputStream(file);
	
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	   XSSFSheet sheet=wb.getSheetAt(0);
	
	 // String value=sheet.getRow(1).getCell(0).getStringCellValue();
	  
	  int value=(int) sheet.getRow(1).getCell(0).getNumericCellValue();//it returns double,so you have to cast it.
	  
	  System.out.println("Excel value= "+value);
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://www.google.co.in/");
	  
	  WebElement searchBox=driver.findElement(By.name("q"));
	  
	  String s=Integer.toString(value);
	  
	  searchBox.sendKeys(s);
	  
	  Thread.sleep(5000);
	  
	  
	  
	  driver.close();
	  
	  System.out.println("Test Complete");
	  
	  return s;
	  
	 
	
     }
		
		public static void main(String args[]) throws IOException, InterruptedException
		{
			readData();
		}
   }
	
	

