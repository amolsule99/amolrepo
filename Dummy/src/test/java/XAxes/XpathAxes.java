package XAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa ");
		
		/*self select the current node
		
		//driver.findElements(By.xpath("//a[contains(text(),\"Mahindra Holidays\")]"));
		
		String text=driver.findElement(By.xpath("//a[contains(text(),\"Mahindra Holidays\")]/self::a ")).getText();
		
		System.out.println(text);//Mahindra Holidays
		
		//Select the Parent of current node  (Always one)
		
		String text1=driver.findElement(By.xpath("//a[contains(text(),\"Mahindra Holidays\")]/parent::td")).getText();
		System.out.println(text1);//Mahindra Holidaysl
		
		//Child of self
		// //a[contains(text(),"Mahindra Holidays")]/child::* shows 0 (zero) elements means no child to current node
		
		//Select all children of the current node(one or many)
		List<WebElement>childs=driver.findElements(By.xpath("//a[contains(text(),\"Mahindra Holidays\")]/ancestor::tr/child::td "));
		System.out.println("Number of Childs of Self Node= "+childs.size());// 5
		
		for(WebElement ele :childs)
		{
			System.out.println(ele.getText());
		}
		
		//Ancestor -Select all ancestors(parent,grandparent etc.) 
		
		String text2=driver.findElement(By.xpath("//a[contains(text(),\"Mahindra Holidays\")]/ancestor::tr")).getText();
		System.out.println("Ancestors are "+text2);
		
		//Descentant :-Select all descendant(children,grandchildren,etc) of the current node
		
		List<WebElement> descendant=driver.findElements(By.xpath("//a[contains(text(),\"Mahindra Holidays\")]/ancestor::tr/descendant::td "));
		System.out.println("No of Descendant Nodes "+descendant.size());
		System.out.println("Descendant are as below");
		for(WebElement ele:descendant)
		{
			System.out.print(ele.getText()+" " );
			
		}*/
		
		//Following : selects everything in the document after the closing tag of current node
		List<WebElement>followings=driver.findElements(By.xpath("//a[contains(text(),\"ACC\")]//ancestor::tr//following::tr "));
		System.out.println("number of following nodes "+followings.size());
		/*for(WebElement ele:followings)
		{
			System.out.println(ele.getText());
		}*/
		
		//Following-sibling : Selects all siblings after the current node
		
		    List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(text(),\"ACC\")]//ancestor::tr//following-sibling::tr"));
		    System.out.println("Number of following-siblings = "+followingsiblings.size());
		    
		 //preceding : Select all nodes that appear before the current node in the document 
		    
		    List<WebElement>precedings=driver.findElements(By.xpath("//a[contains(text(),\"ACC\")]//ancestor::tr//preceding::tr "));
		    System.out.println("Number of precidings ="+precedings.size());
		    
		    for(WebElement ele:precedings)
		    {
		    	System.out.println(ele.getText());
		    }
		    
		    //preciding-siblings :
		    
		    List<WebElement>precedingsibling=driver.findElements(By.xpath("//a[contains(text(),\"ACC\")]//ancestor::tr//preceding-sibling::tr"));
		    System.out.println("Number of preceding-siblings "+precedingsibling.size());
		    for(WebElement ele:precedingsibling)
		    {
		    	System.out.println(ele.getText());
		    }
		    
		    
		    
		    
		    
		    driver.close();

	}

}
