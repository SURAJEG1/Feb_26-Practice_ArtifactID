package march30_TestNG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

	public ExtentReports getExtentReports() 
	{
		String reportPath = System.getProperty("user.dir") + "/Reports/extent-report.html";
		File reportFolder =  new File(System.getProperty("user.dir") + "/Reports");
		
		if(!reportFolder.exists()) 
		{
			reportFolder.mkdirs();
		}
		
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
		htmlReporter.config().setReportName("Automation Test Reports");
		htmlReporter.config().setDocumentTitle("Extent Reports");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("");
		
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Tester", "Suraj");
		reports.setSystemInfo("OS", "Wondows11");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("Machine", "TesterLaptop");
		
		
		return reports;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
