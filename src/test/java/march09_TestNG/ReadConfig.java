package march09_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	//Create object of Properties class;
	Properties properties;
	String filePath = "";
	
	//Create method for read config.properties file and load file.
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
	
	
	
	
	//Create method for browser key and Url key
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
			throw new RuntimeException("BaseUrl is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
