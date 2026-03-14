package march14_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig {
	
	//Create object of Properties;
	Properties properties;
	String filepath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";
	
	//Constructor
	public ReadConfig()
	{
		try {
			
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filepath);
			properties.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Create method for browser and url keys.
	
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.property file");
	}
	
	
	
	public String getBaseUrl() 
	{
		String value = properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("BaseUrl is not spacified in config.proprties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
