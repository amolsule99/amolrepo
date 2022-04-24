package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	//Welcome on login page
	
			@FindBy(id="txtUsername")
			private WebElement username;
			
			@FindBy(id="txtPassword")
			private WebElement password;
			
			@FindBy(id="btnLogin")
			private WebElement loginbutton;
			
			public LoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);//(ElementLocatorFactory,ObjectPage)
				
				
			}
			
			public void login()
			{
				username.sendKeys("admin");
				password.sendKeys("admin123");
				loginbutton.click();
			}
		
}
