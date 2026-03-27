package march25_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtility {
	
	public ExtentReports getExtentReport() 
	{
		String reportPath = System.getProperty("user.dir") + "/reports/extent-report.html";
		File reportsFolder = new File (System.getProperty("user.dir") + "/reports");
		
		if(!reportsFolder.exists()) 
		{
			reportsFolder.mkdir();
		}
		
		//Configuration to change look & feel of  report
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Automation Test Result");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a ('zzz')");
		
		//Add systme Information / Environment info to reports;
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("tester", "suraj");
		reports.setSystemInfo("OS", "Windows11");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Machine", "testerLP");
		
		
		return reports;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
