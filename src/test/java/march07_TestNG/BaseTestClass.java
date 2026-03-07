package march07_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTestClass {
	
	//Step-1
	//Create Object of ReadConfig class;
	ReadConfig readConfig = new ReadConfig();
	String browser = readConfig.getBrowser();
	String amazonUrl = readConfig.getAmazonUrl();
	String flipkartUrl = readConfig.getFlipkartUrl();
	
	
	
	//Step-2
	//Create static object of WebDriver;
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		//Apply switch case for driver actions
		switch(browser.toLowerCase()) 
		{
		case("chrome"):
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--incognito --start-Maximized");
		   driver = new ChromeDriver();
		   //driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	//Step-3
	//Create tearDown method for close and quit browser window
	//@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
