package feb24_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DataDrivenWithDataProviderAnnotation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
	
	
	// TestCase for flipkart search product
	@Test(dataProvider = "product")
	public void searchProduct(String prod) throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys(prod);
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	// DataProvider annotation use for multiple test execution
	@DataProvider(name = "product")
	public static Object[] dataDriven() 
	{
		Object[][] data = new Object[4][1];
		data[0][0] = "mobile";
		data[1][0] = "laptop";
		data[2][0] = "shirt";
		data[3][0] = "denims";
		return data;
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{	
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	

}
