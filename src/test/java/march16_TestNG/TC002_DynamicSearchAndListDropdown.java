package march16_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class TC002_DynamicSearchAndListDropdown {
	//Create object of WebDriver interface;
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1)
	public void dynamicSearchAndListDropdownExample1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("led tv");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(dynamicList.size());
		
		Thread.sleep(2000);
		for(int i=0;  i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains("32 + inch")) 
			{
			dynamicList.get(i).click();
			break;
			}
		}
		
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
	public void dynamicSearchAndListDropdownExample2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("led tv");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int count = dynamicList.size();
		Thread.sleep(1000);
		System.out.println(count);
		dynamicList.get(3).click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
