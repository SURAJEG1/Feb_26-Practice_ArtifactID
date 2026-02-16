package feb16_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class MouseHoverRobotClassAndWindowHandles {
	WebDriver driver;
	ScreenshotUtility screenshot;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	//Annotation and (parameter)
	@Test(priority=1)
	public void mouseHoverActionRightClick() throws InterruptedException, IOException 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		WebElement insta = driver.findElement(By.linkText("Instagram"));
		Actions action = new Actions(driver);
		action.moveToElement(insta).contextClick().build().perform();
		screenshot = new ScreenshotUtility(driver);
		screenshot.takeScreenshot();
	}
	
	
	@Test(priority=2)
	public void robotClass() throws AWTException, IOException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		screenshot = new ScreenshotUtility(driver);
		screenshot.takeScreenshot();
	}
	
	
	
	@Test(priority=3)
	public void windowHandles() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String facebook = it.next();
		String instagram = it.next();
		
		driver.switchTo().window(facebook);
		System.out.println(driver.getTitle());
		screenshot = new ScreenshotUtility(driver);
		screenshot.takeScreenshot();
		
		driver.switchTo().window(instagram);
		System.out.println(driver.getTitle());
		screenshot.takeScreenshot();
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	

}
