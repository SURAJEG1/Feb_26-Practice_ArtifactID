package march07_TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	WebDriver driver;
	
	public Screenshot(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	
	public void screenshot() 
	{
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			String timestamp = new SimpleDateFormat("yyyyddmm_HHmmss").format(new Date());
			File cource = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("");
			FileUtils.copyFile(cource, destination);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
