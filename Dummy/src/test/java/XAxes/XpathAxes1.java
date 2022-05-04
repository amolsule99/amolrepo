package XAxes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes1 {

	public static void main(String[] args)
	
	{

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa ");
		
		//List<WebElement> topgainers=driver.findElements(By.xpath(" //a[contains(text(),\"Religare Enterprises\")]//following::tr "));
		
		
		//printing TopGainners
		List<WebElement> topgainers=	driver.findElements(By.xpath("//a[contains(text(),\"GHCL\")]//ancestor::tr/ancestor::tbody/child::* "));
		
		System.out.println("Top gainers are");
		
		for(WebElement ele : topgainers)
		{
			System.out.println(ele.getText());
		}
		
		
		//Use of HashMap
		
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		
		int i=1;
		
		for(WebElement ele:topgainers)
		{
			map.put(i,ele.getText());
			i++;
		}
		
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the key number of company");
		
		Object x=sc.nextInt();
		
		
		
		for(Map.Entry m :map.entrySet())
		{
			if(m.getKey()==x)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
			
			
		}
		
		/*Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the company name");
		
		String company=sc1.nextLine();
		
		for(Map.Entry m:map.entrySet())
		{
			if(m.getValue().equals(company))
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
	
		
		//print only company names
		
		List<WebElement>companynames=driver.findElements(By.xpath("//a[contains(text(),\"GHCL\")]//ancestor::tbody/child::tr/child::td/a "));
		List<WebElement>preclose=driver.findElements(By.xpath("//a[contains(text(),\"Mangalam Cement\")]//ancestor::tbody/child::tr/child::td[3] "));
		
		for(WebElement ele : companynames)
		{
			System.out.println(ele.getText());
		}
		
		//Store Company names using HashMap
		HashMap<Integer,String>map1=new HashMap<Integer,String>();
		
		int y=1;
		
		for(WebElement ele : companynames)
		{
			map1.put(y, ele.getText());
			y++;
		}
		
		
		
		for(Map.Entry m : map1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		} */
		
		driver.close();
		

	}

}
