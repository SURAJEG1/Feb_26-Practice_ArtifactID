package march14_TestNG;

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
		ChromeOptions co = new  ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "items")
	public void searchProd(String prod) 
	{
		WebElement searchBox = driver.findElement(By.xpath(""));
		searchBox.sendKeys(prod);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	
	@DataProvider(name = "itmes")
	public static Object[][] dataDriven()
	{
		Object [][] data = new Object [2][1];
		
		data [0][0] = "";
		data [1][0] = "";
		
		return data;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
