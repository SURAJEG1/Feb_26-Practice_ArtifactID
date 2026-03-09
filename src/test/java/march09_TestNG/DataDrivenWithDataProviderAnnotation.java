package march09_TestNG;

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
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "items")
	public void myntraSearch(String prod) 
	{
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchBox.sendKeys(prod);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	//@DataProvider(name = "items")
	public static Object[][] dataDriven()
	{
		Object[][] data = new Object[2][1];
		data [0][0] = "Rodstar";
		data [1][0] = "levis";
		
		return data;
	}
	
	
	
	@DataProvider(name = "items")
	public static Object [][] excelDriven() throws IOException
	{
		String filePath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Excelfile\\ItemDetails.xlsx";
		String sheetName = "items";
		
		return ExcelDrivenUtility.excelDriven(filePath, sheetName);
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
