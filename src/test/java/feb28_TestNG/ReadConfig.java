package feb28_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	//Create Object of Properties;
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




	//Create method for browser and Url keys
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.properties file");
	}
	
	
	
	public String getDrishtiUrl() 
	{
		String value = properties.getProperty("drishtiUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Drishti Url is spacified in config.properties file");
	}
	
	
	
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
	
	
	
	public String getFacebookUrl() 
	{
		String value = properties.getProperty("facebookUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Facebool Url is not  spacifec in config.properties file");
	}
	
	
	
	
	



	
	
	
	
	
	
	
	

}
