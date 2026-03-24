package march24_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class ExcelDrivenUtility {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https:/www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "items")
	public void searchProd(String prod) throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.xpath("//form[@class='lilxh_ header-form-search']//input[@placeholder='Search for Products, Brands and More']"));
		Thread.sleep(2000);
		searchBox.sendKeys(prod);
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
	@DataProvider(name = "items")
	public Object[][] dataDriven() throws IOException
	{
		String filePath = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Excelfile\\ItemDetails.xlsx";
		String sheetName = "items";
		
		return excelDriven(filePath, sheetName);
	}
	
	

	
	

	
	public static Object[][] excelDriven(String filepath, String sheetname) throws IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount-1][columnCount];
		for(int i=1; i<rowCount; i++) 
		{
			Row row = sheet.getRow(i);
			
			for(int j=0; j<columnCount; j++) 
			{
				Cell cell = row.getCell(j);
				data[i-1][j] = cell.toString();
			}	
		}
		
		workbook.close();
		return data;
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
