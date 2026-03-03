package march03_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	//Create Object of Properties;
	Properties properties;
	String filePath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";


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





	//Create browser and Url key method
	public String browser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.properties file");
	}

	
	
	public String orangeHrmsUrl() 
	{
		String value = properties.getProperty("orangeHRMSUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Browser is not spacified in config.properties file");
	}





















}
