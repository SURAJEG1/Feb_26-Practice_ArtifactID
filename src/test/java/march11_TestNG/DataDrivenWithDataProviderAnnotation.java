package march11_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DataDrivenWithDataProviderAnnotation {
	//create object of WebDriver driver;
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "credentials")
	public void loginTestCase(String un, String pwd) 
	{
		
	}
	
	
	
	
	@DataProvider(name = "credential")
	public static Object[][] dataDriven()
	{
		Object[][] data = new Object[2][2];
		data [0][0] = "";
		data [0][1] = "";
		
		data [1][0] = "";
		data [1][1] = "";
		
		return data;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
