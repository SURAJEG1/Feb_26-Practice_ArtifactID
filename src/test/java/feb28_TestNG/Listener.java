package feb28_TestNG;

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
		System.out.println(result.getMethod().getMethodName() + " " +"Successfully Executed");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " " +"Got Failed & Screenshot Captured");
		
		try {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHssmm").format(new Date());
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Screenhsot\\Pass\\faiedTestcase"+timestamp+".png");
			FileUtils.copyFile(source, destination);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}















}
