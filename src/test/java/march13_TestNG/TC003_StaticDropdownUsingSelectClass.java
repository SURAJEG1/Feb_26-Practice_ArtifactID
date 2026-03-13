package march13_TestNG;

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
public class TC003_StaticDropdownUsingSelectClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1, groups = {"regression"})
	public void staticDropdwon_SelectByValue() throws InterruptedException 
	{
		WebElement staticDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(staticDropdown);
		sc.selectByValue("search-alias=fashion");
		Thread.sleep(2000);
	}
	
	@Test(priority=2, groups = {"regression"})
	public void staticDropdown_SelectByIndex() throws InterruptedException 
	{
		WebElement staticDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(staticDropdown);
		sc.selectByIndex(6);
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void staticDropdown_SelectByVisibleText() throws InterruptedException 
	{
		WebElement staticDropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(staticDropdown);
		sc.selectByVisibleText("Beauty");
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void staticDropdown_SelectByUsingSendKeysActions() throws InterruptedException 
	{
		WebElement staticDropdown = driver.findElement(By.id("searchDropdownBox"));
		staticDropdown.sendKeys(Keys.ARROW_DOWN);
		staticDropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
	}
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	

}
