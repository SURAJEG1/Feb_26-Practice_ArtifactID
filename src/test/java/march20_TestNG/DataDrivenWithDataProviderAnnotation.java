package march20_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
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
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "credentials")
	public void login(String un, String pwd) 
	{
		WebElement userid = driver.findElement(By.xpath(""));
		userid.sendKeys(un);
		
		WebElement pass = driver.findElement(By.xpath(""));
		pass.sendKeys(pwd);
	}
	
	
	
	@DataProvider(name = "credentials")
	public static Object [][] excelDriven()
	{
		Object [][] data = new Object [2][2];
		data [0][0] = "";
		data [0][1] = "";
		
		data [1][0] = "";
		data [1][1] = "";
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
