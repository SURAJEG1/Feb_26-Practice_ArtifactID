package march09_TestNG;

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
	public void staticDropdownExample1_SelectByValue() throws InterruptedException 
	{
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select sc = new Select(dropDown);
		sc.selectByValue("search-alias=baby");
		Thread.sleep(3000);
	}
	
	
	@Test(priority=2)
	public void staticDropdownExample2_SelectByIndex() throws InterruptedException 
	{
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select sc = new Select(dropDown);
		sc.selectByIndex(3);
		Thread.sleep(3000);
	}
	
	
	@Test(priority=3)
	public void staticDropdownExample3_UsingSendKeysAction() throws InterruptedException 
	{
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		dropDown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
