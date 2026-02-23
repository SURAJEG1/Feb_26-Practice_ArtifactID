package feb22_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	String path = "config.properties";
	
	//Constructor
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
	
	
	
	
	
	// Create methods for set URL key and browser key.  
	
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in configFile");
	}
	
	
	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("amazonUrl is not spacified in configFile");
	}
	
	
	public String getFacebookUrl() 
	{
		String value = properties.getProperty("facebookUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("facebookUrl is not spacified in configFile");
	}
	
	
	public String getFlipkartUrl() 
	{
		String value = properties.getProperty("flipkartUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("flipkartUrl is not spacified in configFile");
	}
	
	
	public String getRediffmailUrl() 
	{
		String value = properties.getProperty("rediffmailUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("rediffmailUrl is not spacified in configFile");
	}
	
	
	public String getOrangehrmUrl() 
	{
		String value = properties.getProperty("orangehrmUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("orangehrmUrl is not spacified in configFile");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
