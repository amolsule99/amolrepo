package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Utility.configReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driverFactory.driverFactoryMMT;

public class AppliHooks 
{
	private driverFactoryMMT driverFactory;
	private configReader config;
	private WebDriver driver;
	private Properties prop;
	
	@Before(order=0)
	public void getProperty()
	{
		config=new configReader();
		prop=config.init_prop();
	}
	
	@Before(order=1)
	public void launchBrowser()
	{
		String browserName=prop.getProperty("browser");//search key "browser" in property list
		driverFactory=new driverFactoryMMT();
		driver=driverFactory.init_driver(browserName);
	}
	
	/*@After(order=0)
	public void closeBrowser()
	{
		driver.close();
	}*/

}
