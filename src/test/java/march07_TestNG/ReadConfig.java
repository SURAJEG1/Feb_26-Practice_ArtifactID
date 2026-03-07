package march07_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	//Create Object of Properties Class;
	Properties properties;
	//Set Config.properties file path.
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
	
	
	
	//Create methods for browser key and url key.
	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Amazon Url is not spacified in config.properties file");
	}
	
	
	public String getFlipkartUrl() 
	{
		String value = properties.getProperty("flipkartUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Flipkart Url is not spacified in config.properties file");
	}
	
	
	
	
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
