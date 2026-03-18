package march17_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass2 {
	
	String filepath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Resources\\config.properties";
	
	WebDriver driver;
	public WebDriver initializerDriver() throws IOException 
	{
		
		Properties properties  = new Properties();
		FileInputStream fis = new FileInputStream(filepath);
		properties.load(fis);
		
		String browserName = properties.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		
		return driver;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
