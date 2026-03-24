package march23_TestNG;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener{

	//Create Object of ExtentSpartReporter, ExtentReports ExtentTest class
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	
	public void configureReport() 
	{
		htmlReporter = new ExtentSparkReporter("ExtentListenerReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		//Add System Information/Environment info to reports
		reports.setSystemInfo("", "");
		reports.setSystemInfo("", "");
		reports.setSystemInfo("", "");
		reports.setSystemInfo("", "");

		//configuration to change look and feel of report
		htmlReporter.config().setReportName("Automation Test Report");
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a '('zzz')");
	}



	public void onStart(ITestContext result) 
	{
		configureReport();
		System.out.println("On start method invoked.....");
	}
	
	
	public void onFinish(ITestContext result) 
	{
		System.out.println("On finished method invoked....");
		reports.flush();
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Name of test method failed" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed testcase is: " + result.getName(), ExtentColor.RED));
		
		String screenShotPath = System.getProperty("user.dir") + "\\screenshot\\" + result.getName() + ".png";
		File screenShotFile = new File(screenShotPath);
		
		if(screenShotFile.exists()) 
		{
			test.fail("Captured screenshot is below: " + test.addScreenCaptureFromPath(screenShotPath));
		}
	}

	
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Name of the method skipped: " + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip testcase is: " + result.getName(), ExtentColor.YELLOW));
	}


	public void onTestStart(ITestResult result) 
	{
		System.out.println("Name of test method started: " + result.getName());
	} 

	
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Name of test method successfully executed: " + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of passed testcase is: " + result.getName(), ExtentColor.GREEN));
	}
	
	
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}



	@AfterTest
	public void tearDown() 
	{
		reports.flush();
	}


















}
