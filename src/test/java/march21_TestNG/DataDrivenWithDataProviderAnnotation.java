package march21_TestNG;

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
		co.addArguments("--incognito");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	
	
	@Test(dataProvider = "credentials")
	public void loginCredentials(String un, String pwd) 
	{
		WebElement username = driver.findElement(By.id(""));
		WebElement password = driver.findElement(By.id(""));
		WebElement lgButton = driver.findElement(By.id(""));
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgButton.click();
	}





	@DataProvider(name = "credentials")
	public static Object[][] dataDriven()
	{
		Object [][] data = new Object [2][2];
		data [0][0] = "welcome1";
		data [0][1] = "welcome@123";
		
		data [1][0] = "admin123";
		data [1][1] = "admin@123";
		
		return data;
	}

	
	
	
	









}
