package feb23_TestNG;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class FlipkartDynamicSearchAndListDropdown {
	//Create object of WebDriver;
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co  = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	//Annotation (helping attribute)
	@Test(priority=1)
	public void flipkartDynamicSearchAndListDropdown_Example1() throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("mobile");
		List<WebElement> dynamicLsit = driver.findElements(By.xpath("//form[@class='_Bidnv header-form-search']/ul/li"));
		Thread.sleep(1000);
		int count = dynamicLsit.size();
		System.out.println(count);
		Thread.sleep(1000);
		dynamicLsit.get(2).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	

}
