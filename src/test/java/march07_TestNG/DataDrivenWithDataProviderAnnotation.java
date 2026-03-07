package march07_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class DataDrivenWithDataProviderAnnotation {
	
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
	
	
	
	@Test(dataProvider = "prod")
	public void productSearchTC001(String item) throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(item);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	//@DataProvider(name = "prod")
	public static Object[][] dataDriven()
	{
		Object[][] data = new Object[2][1];
		
		data [0][0] = "apple mobiles";
		data [1][0] = "samsung mobiles";
		return data;
	}
	
	
	@DataProvider(name = "prod")
	public static Object[][] excelDriven() throws IOException
	{
		// Set Excel file path & Sheet name
		String filepath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Excelfile\\ItemDetails.xlsx";
		String sheetname = "items";
		
		//Return ExcelDrivenUtility class and excelDriven method with parameter
		return ExcelDrivenUtility.excelDrivenUtility(filepath, sheetname);
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
