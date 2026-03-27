package march27_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	//Create object of Properties class;
	Properties properties;
	String filePath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";
	
	public void ReadConfig() 
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filePath);
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//create methods for browser and url keys
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
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
