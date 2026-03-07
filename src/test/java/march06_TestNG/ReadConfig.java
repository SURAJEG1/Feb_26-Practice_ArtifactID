package march06_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
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
	
	
	
	
	//Create method for  browser key and Url key
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
