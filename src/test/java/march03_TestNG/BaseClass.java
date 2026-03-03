package march03_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	//create object of ReadConfig class;
	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.browser();
	String orangeHRMSUrl = readconfig.orangeHrmsUrl();


	public static WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case("chrome"):
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--incognito --start-Maximized");
		   driver = new ChromeDriver(co);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}





























}
