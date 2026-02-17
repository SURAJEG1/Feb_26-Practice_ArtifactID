package feb17_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	String path = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";

	public ReadConfig() 
	{
		try {
			
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}




//Method for browser Key		
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in configfile");
	}
	
	
	
	
//Method for Url Key	
	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Url is not spacified in configfile");
	}
	
	
	
	
	public String getFacebookUrl() 
	{
		String value = properties.getProperty("facebookUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Url is not spacified in configfile");
	}
	
	
	

	



}
