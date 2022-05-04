package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class configReader
{

	private Properties prop;
	
	public Properties init_prop()
	{
		prop=new Properties();
		
		try
		{
			FileInputStream fis=new FileInputStream("src/main/resources/config/config.properties");
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return prop;
		
		
	}
	
}
