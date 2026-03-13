package march13_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	//Create Object of  Properties class.
	Properties properties;
	String filepath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";
	
	
	//Constructor
	public ReadConfig()
	{
		try {
			//Call Object of Properties class
			properties = new Properties();
			//Set config.properties file path in inputstream.
			FileInputStream fis = new FileInputStream(filepath);
			//load property file
			properties.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	// create methods for browser key and Url key;
	
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
			throw new RuntimeException("BaseUrl is not spacified in config.property file");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
