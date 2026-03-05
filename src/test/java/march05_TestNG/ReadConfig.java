package march05_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	//Crate Object of Properties Class
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
	
	
	
	//Create method for browser and Url Key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException ("Browser is not spacified in config.properties file");
	}
	
	
	public String getAmazonUrl()
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException ("Amazon Url is not spacifed in config.properties file");
	}
	
	
	
	public String getFlipkart() 
	{
		String value = properties.getProperty("flipkartUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException ("Flipkart url is not spacifed in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
