package march25_TestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManagerUtility {
	//Create Object
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	
	public void configureExtentReport() 
	{
		//Step-1
		htmlReporter = new ExtentSparkReporter("ExtentListenerReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//step-2
		//Add system information/Environment info to reports
		reports.setSystemInfo("teter", "Suraj");
		reports.setSystemInfo("OS", "Windows11");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("machine", "testerLp");
		
		//step-1
		//Configuration to change look & feel of report
		htmlReporter.config().setReportName("Automation Test Report");
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a ('zzz')");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
