package march03_TestNG;

import java.io.IOException;
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

public class DataDrivenWithDataProviderAnnotation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "credentials")
	public void loginTest(String un, String pwd) 
	{
		//Using Xpath locator strategy to find WebElement of below fields
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement clickOnLogin=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
		//Perform Actions on WebElement
		userName.sendKeys(un);
		password.sendKeys(pwd);
		clickOnLogin.submit();
		
	}
	
	
	
	
	@DataProvider(name = "credentials")
	public static Object[] dataDriven() throws IOException 
	{
		//Object [][] data = new Object [2][2];
//		data [0][0] = "";
//		data [1][0] = "";
//		
//		data [1][0] = "";
//		data [1][1] = "";
		
		String fileName = "E:\\InfoEge Automation Project\\Feb_26-Practice_ArtifactID\\Excelfile\\LoginDetails.xlsx";
		String sheetName = "Testdata";
		
		return ExcelDriven.excelDriven(fileName, sheetName);
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
