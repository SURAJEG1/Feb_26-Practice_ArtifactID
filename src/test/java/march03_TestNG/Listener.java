package march03_TestNG;

import java.io.File;
import java.io.IOException;

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
		System.out.println(result.getMethod().getMethodName() + " : Successfully Executed");
	}


	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getMethod().getMethodName() + " : Got Failed & Screehshot Captured");
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver; 
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("");
			FileUtils.copyFile(source, destination);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}















}
