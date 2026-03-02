package feb26_TestNG;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {

	//Created object of ReadConfigclass;
	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.getBrowser();
	String amazonUrl = readconfig.getAmazonUrl();
	String facebookUrl = readconfig.getFacebookUrl();
	String flipkartUrl = readconfig.getFlipkartUrl();
	String rediffmailUrl = readconfig.getRediffmailUrl();


	//Create static object of (Logger and WebDriver) class
	public static Logger logger;
	public static WebDriver driver;

	@BeforeClass
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case"chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--incognito --start-Maximized");
			driver = new ChromeDriver(co);
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//logger calling LogManager method
		//logger = LogManager.getLogger("Feb_26-Practice_ArtifactID");
	}



	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}















}
