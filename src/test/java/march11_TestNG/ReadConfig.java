package march11_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig {

	//Create object of Properties;
	Properties properties;
	String filePath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";
	
	
	//Constructor
	public ReadConfig() 
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filePath);
			properties.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	//Create Browser and Url keys method
	
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.properties file");
	}
	
	
	
	public String getBaseUrl() 
	{
		String value = properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Base Url is not spacified in config.properties file");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
