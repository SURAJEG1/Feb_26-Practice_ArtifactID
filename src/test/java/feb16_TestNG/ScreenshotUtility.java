package feb16_TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	WebDriver driver;
	
	public ScreenshotUtility(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void takeScreenshot() throws IOException 
	{
		TakesScreenshot  ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\src\\test\\java\\feb16_TestNG\\screenshot\\screenshot"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
