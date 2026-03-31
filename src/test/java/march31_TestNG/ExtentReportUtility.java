package march31_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtility {
	
	public ExtentReports getExtentReport() 
	{
		String reportpath = System.getProperty("user.dir") + "/reports/extent-report.html";
		File reportsFolder = new File(System.getProperty("user.dir") + "/reports");
		
		if(!reportsFolder.exists()) 
		{
			reportsFolder.mkdirs();
		}
		
		
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		reporter.config().setReportName("Automation Test Reports");
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a'('zzz')");
		
		
		ExtentReports extentreports = new ExtentReports();
		extentreports.attachReporter(reporter);
		extentreports.setSystemInfo("Tester", "Suraj");
		extentreports.setSystemInfo("OS", "Windows7");
		extentreports.setSystemInfo("Browser", "chrome");
		extentreports.setSystemInfo("machine", "testLP");
		
		return extentreports;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
