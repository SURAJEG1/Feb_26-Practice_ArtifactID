package march13_TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	WebDriver driver;
	
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getMethod().getMethodName() + " : Successfully Execute");
	}

	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getMethod().getMethodName() + " : Got failed & Screenshot Captured");
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			String timestamp = new SimpleDateFormat("yyyyddmm_HHmmss").format(new Date());
			File Source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("");
			FileUtils.copyFile(Source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
