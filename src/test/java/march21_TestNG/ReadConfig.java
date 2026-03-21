package march21_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	//Create object of Properties class;
	Properties properties;
	String filepath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";
	
	//Constructor
	public ReadConfig() 
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filepath);
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//Create methods for Browser and URL keys
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
			throw new RuntimeException("baseUrl is not spacified in config.properties file");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
