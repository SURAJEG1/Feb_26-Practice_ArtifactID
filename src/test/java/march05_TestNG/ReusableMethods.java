package march05_TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableMethods {
	
	//create object of WebDriver;
	WebDriver driver;
	
	public void maximizeWindow() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void implicitilyWait(int sec) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	
	public void screenshot() throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyddMM_HHmmss").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileUtils.copyFile(source, destination);
	}
	
	
	
	public void scroll500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void scroll200() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
	}
	
	public void scroll300() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	
	public void scrollTopToBotom() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void incognitoMode() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
	}
	
	
	
	
	
	
	
	
	
	
	

}
