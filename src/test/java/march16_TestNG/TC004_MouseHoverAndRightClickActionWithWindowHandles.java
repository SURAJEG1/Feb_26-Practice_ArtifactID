package march16_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class TC004_MouseHoverAndRightClickActionWithWindowHandles {
	//Create object of WebDriver interface;
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1)
	public void mouseHoverRightClickAction() throws InterruptedException 
	{
		WebElement insta = driver.findElement(By.linkText("Instagram"));
		Actions action = new Actions(driver);
		action.moveToElement(insta).contextClick().build().perform();
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void robotClass() throws AWTException, InterruptedException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void windowHandlesforwardAndBackwardCursor() throws InterruptedException 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String facebook = it.next();
		String instagram = it.next();
		
		Thread.sleep(2000);
		driver.switchTo().window(facebook);
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(instagram);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
