package feb17_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.getBrowser();
	String amazonUrl = readconfig.getAmazonUrl();
	String facebookUrl = readconfig.getFacebookUrl();
	

	
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case"chrome":
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	
	
	
	
	

}
