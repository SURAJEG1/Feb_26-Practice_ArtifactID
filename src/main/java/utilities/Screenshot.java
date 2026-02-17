package utilities;

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
	
	public void screenshot() throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileUtils.copyFile(source, destination);
		
	}
	
	
	
	
	
	
	

}
