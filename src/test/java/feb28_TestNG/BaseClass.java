package feb28_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	//Create object of ReadConfig class;
	ReadConfig readconfig = new ReadConfig();
	String browser = readconfig.getBrowser();
	String amazonUrl = readconfig.getAmazonUrl();
	String flipkartUrl = readconfig.getFlipkartUrl();
	String facebookUrl = readconfig.getFacebookUrl();
	//String drishtiUrl = readconfig.getDrishtiUrl();
	
	public static Logger logger;
	public static WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		switch(browser.toLowerCase()) 
		{
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger = LogManager.getLogger("Feb_26-Practice_ArtifactID");
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	public void getScreenshot() throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHssmm").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Screenhsot\\Pass\\screenshot"+timestamp+".png");
		FileUtils.copyFile(source, destination);
	}
	
	
	
	
	public void windowHandles() throws InterruptedException 
	{
		String facebook = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		Set<String> wd = driver.getWindowHandles();
		for(String instagram : wd) 
		{
			Thread.sleep(1000);
			if(!instagram.equals(facebook)) 
			{
				driver.switchTo().window(instagram);
				break;
			}
		}
		
	}
	
	
	public void robotClass() throws AWTException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	
	
	
	
	
	
	
	
	

}
