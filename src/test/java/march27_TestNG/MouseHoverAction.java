package march27_TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

@Listeners(Listener.class)
public class MouseHoverAction {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	
	@Test(priority=1)
	public void mouseHoverAction() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		WebElement insta = driver.findElement(By.linkText("Instagram"));
		Actions action = new Actions(driver);
		action.moveToElement(insta).contextClick().build().perform();
	}
	
	
	@Test(priority=2)
	public void robotClass() throws AWTException, InterruptedException 
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	
	
	
	@Test(priority=3)
	public void windowHandle() throws InterruptedException 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		
		String facebook = it.next();	
		String instagram = it.next();
		
		driver.switchTo().window(facebook);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.switchTo().window(instagram);
		System.out.println(driver.getTitle());	
	}
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException 
	{
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
