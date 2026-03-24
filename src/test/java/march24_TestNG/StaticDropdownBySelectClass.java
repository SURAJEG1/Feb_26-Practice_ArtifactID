package march24_TestNG;

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
public class StaticDropdownBySelectClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1)
	public void amazonStaticDropdown_SelectByValue() 
	{
		WebElement dropdown = driver.findElement(By.cssSelector("select[name='url']"));
		Select sc = new Select(dropdown);
		sc.selectByValue("search-alias=fashion");
	}
	
	
	
	@Test(priority=2)
	public void amazonStaticDropdown_SelectByIndex() 
	{
		WebElement dropdown = driver.findElement(By.cssSelector("select[name='url']"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(5);
	}
	
	
	@Test(priority=3)
	public void amazonStaticDropdown_SelectBySendKeysAction() throws InterruptedException 
	{
		WebElement dropdown = driver.findElement(By.cssSelector("select[name='url']"));
		dropdown.sendKeys(Keys.ARROW_DOWN);
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
