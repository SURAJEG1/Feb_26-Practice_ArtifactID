package march05_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class DataDrivenWithUsingDataProviderAnnotation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "prod")
	public void searchProductOnFlipkart(String prod) throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchBox.sendKeys(prod);
		searchBox.click();
		Thread.sleep(3000);
		//Assert.assertTrue(false);
	}
	
	
	
	
	@DataProvider(name = "prod")
	public static Object[][] dataDriven() throws IOException
	{
//		Object[][] data = new Object[2][1];
//		data[0][0] = "gifts";
//		data[1][0] = "shits";
		
		String fileN = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Excelfile\\ItemDetails.xlsx";
		String sheetN = "items";
		
		return ExcelDrivenUtility.excelDriven(fileN, sheetN);
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
