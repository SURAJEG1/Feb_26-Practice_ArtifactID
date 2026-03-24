package march24_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class DynamicSearchAndListDropdown {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co  = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1)
	public void dynamicSearchAndListDropdown_Exmple1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		searchBox.sendKeys("gifts");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int count = dynamicList.size();
		Thread.sleep(1000);
		System.out.println(count);
		dynamicList.get(5).click();
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority=2)
	public void dynamicSearchAndListDropdown_Example2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		searchBox.sendKeys("gifts");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(dynamicList.size());
		
		Thread.sleep(2000);
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("for girls age 13-14 years")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
