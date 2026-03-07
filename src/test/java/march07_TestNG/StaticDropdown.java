package march07_TestNG;


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
public class StaticDropdown {
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
	
	
	
	@Test(priority=1)
	public void  staticDropdownExample1() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(4);
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority=2)
	public void  staticDropdownExample2() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(dropdown);
		sc.selectByValue("search-alias=audible");
		Thread.sleep(2000);
	}
	
	
	@Test(priority=3)
	public void  staticDropdownExample3() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(dropdown);
		sc.selectByVisibleText("Baby");
		Thread.sleep(3000);
	}
	
	
	
	
	
	@Test(priority=4)
	public void staticDropdownExample4() throws InterruptedException 
	{
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
