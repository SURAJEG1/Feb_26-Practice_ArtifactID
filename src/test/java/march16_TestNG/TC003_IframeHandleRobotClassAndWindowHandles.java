package march16_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class TC003_IframeHandleRobotClassAndWindowHandles {
	//Create object of WebDriver Interface;
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void switchToiFrame() 
	{
		driver.switchTo().frame("moneyiframe");
		WebElement bse = driver.findElement(By.id("bseindex"));
		WebElement nse = driver.findElement(By.id("nseindex"));
		WebElement searchBox = driver.findElement(By.id("query"));
		
		System.out.println(bse.getText());
		System.out.println(nse.getText());
		searchBox.sendKeys("virat kohli");
		searchBox.sendKeys(Keys.ENTER);
		driver.navigate().refresh();
	}
	
	
	
	
	@Test(priority=2)
	public void windowHandles() throws InterruptedException 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String parentWindow = it.next();
		String childWindow =  it.next();
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
	
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	

}
