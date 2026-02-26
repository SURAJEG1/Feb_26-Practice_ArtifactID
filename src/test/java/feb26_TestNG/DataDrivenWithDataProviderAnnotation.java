package feb26_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWithDataProviderAnnotation {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}	
	
	
	
	@Test(dataProvider = "items")
	public void searchProducts(String prod) throws InterruptedException 
	{
		WebElement seaarchBox = driver.findElement(By.xpath("//input[@name='q']"));
		seaarchBox.sendKeys(prod);
		seaarchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	
	@DataProvider(name = "items")
	public static Object[] dataDriven() 
	{
		Object [][] data = new Object [2][1];	
		data [0][0] = "laptop";
		data [1][0] = "mobile";
		
		return data;
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	

}
