package march27_TestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	//Create Object of ExtentSpartReporter, ExtentReports and ExtentTest class
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	
	public void configureReport() 
	{
		htmlReporter = new ExtentSparkReporter("ExtentListenerReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		
		//Add system Information / Environment info to reports
		reports.setSystemInfo("Tester", "Suraj");
		reports.setSystemInfo("OS", "Windows11");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Matchine", "TesterLaptop");
		
		//Configuration to change look and feel of report
		htmlReporter.config().setReportName("Automation test report");
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a '('ZZZ')");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
