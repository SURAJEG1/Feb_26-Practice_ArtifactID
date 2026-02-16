package feb16_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class IframeAndWindowHandles {
	WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void iframe() 
	{
		driver.switchTo().frame("moneyiframe");
		WebElement bse = driver.findElement(By.xpath("//span[contains(@id,'bseindex')]"));
		System.out.println(bse.getText());
		
		WebElement nse = driver.findElement(By.xpath("//span[contains(@id,'nseindex')]"));
		System.out.println(nse.getText());
		
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@id,'query')]"));
		searchBox.sendKeys("T20 World Cup");
		searchBox.sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	@Test(priority=2)
	public void windowHandles() 
	{
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String patent = it.next();
		String child = it.next();
		
		driver.switchTo().window(patent);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
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
