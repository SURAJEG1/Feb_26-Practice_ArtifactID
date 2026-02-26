package feb26_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	//Create Object of Properties properties;
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




	//Create method for Url and Browser Key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.properties file");
	}


	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("AmazonUrl is not spacified in config.properties file");
	}


	public String getFacebookUrl() 
	{
		String value = properties.getProperty("facebookUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("FacebookUrl is not spacified in config.properties file");
	}


	public String getFlipkartUrl() 
	{
		String value = properties.getProperty("flipkartUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("FlipkartUrl is  not spacified in config.properties file");
	}
	
	
	public String getRediffmailUrl() 
	{
		String value = properties.getProperty("rediffmailUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("RediffmailUrl is not spacified in config.properties file");
	}














}
