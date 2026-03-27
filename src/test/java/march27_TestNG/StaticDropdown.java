package march27_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class StaticDropdown {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void staticDropdown_SelectByValue() 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(dropdown);
		sc.selectByValue("search-alias=amazon-pharmacy");
	}
	
	@Test(priority=2)
	public void staticDropdown_SelectByIndex() 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(8);
	}
	
	@Test(priority=3)
	public void staticDropdown_SelectSendKeysAction() 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_LEFT);
	}
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
