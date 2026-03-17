package march16_TestNG;

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
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : Successfully Execute");
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : Got failed & screenshot captured");
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHssmm").format(new Date());
			File scource = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("");
			FileUtils.copyFile(scource, destination);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	

}
