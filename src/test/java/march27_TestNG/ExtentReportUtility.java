package march27_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtility {
	
	public ExtentReports getExtentReports() 
	{
		
		//Step-1
		String reportPath = System.getProperty("user.dir") + "/reports /extent-reports.html";
		File reportsFolder = new File (System.getProperty("user.dir") + "/reports");
		
		if(!reportsFolder.exists()) 
		{
			reportsFolder.mkdir();
		}
		
		
		//Step-2
		//Configuration to change look and feel of report.
		ExtentSparkReporter htmlReports = new ExtentSparkReporter(reportPath);
		htmlReports.config().setReportName("Automation test report");
		htmlReports.config().setDocumentTitle("Extent Report");
		htmlReports.config().setTheme(Theme.STANDARD);
		htmlReports.config().getTimeStampFormat();
		
		
		//Step-3
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReports);
		reports.setSystemInfo("Tester", "Suraj");
		reports.setSystemInfo("OS", "Windows11");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Machine", "testerLaptop");
		
		//Step-4
		return reports;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
