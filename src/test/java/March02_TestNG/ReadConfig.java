package March02_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	//Crate Object of Properties
	Properties properties;
	String filepath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";

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




	//Create Method for Url And Browser Key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.propertiesfile");
	}
	
	
	
	public String getAmazonUrl() 
	{
		String value = properties.getProperty("amazonUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Amazon Url is not spacified in config.properties file");
	}


















}
