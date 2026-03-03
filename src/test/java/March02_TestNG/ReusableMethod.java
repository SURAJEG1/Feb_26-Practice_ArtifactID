package march02_TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReusableMethod {
	
	WebDriver driver;
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	
	public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileUtils.copyFile(source, destination);
	}
	
	
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	
	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void windowHandles_Parent() {
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parent = it.next();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}
	
	
	public void windowHandles_Child() {
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	

}
