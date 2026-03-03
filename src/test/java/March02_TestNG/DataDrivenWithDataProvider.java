package march02_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWithDataProvider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --stat-Maximized");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "credentials")
	public void loginTest(String un, String pwd) 
	{
		WebElement username = driver.findElement(By.id(""));
		WebElement password = driver.findElement(By.id(""));
		WebElement lgButton = driver.findElement(By.id(""));
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgButton.click();
	}
	
	
	
	
	@DataProvider(name = "credentials")
	public static Object[] dataDriven() 
	{
		Object[][] data = new Object[3][2];
		data [0][0] = "";
		data [0][1] = "";
		
		data [1][0] = "";
		data [1][1] = "";
		
		return data;
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
