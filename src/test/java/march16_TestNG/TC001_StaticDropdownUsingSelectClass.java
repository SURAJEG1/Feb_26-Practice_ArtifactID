package march16_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class TC001_StaticDropdownUsingSelectClass {
	//Create object of WebDriver interface;
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1)
	public void staticDropdownSelectByIndex() throws InterruptedException 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(5);
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void staticDropdownSelectByValue() throws InterruptedException 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(dropdown);
		sc.selectByValue("search-alias=amazon-devices");
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void staticDropdownUsingSendKeysActions() throws InterruptedException 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
	}
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
