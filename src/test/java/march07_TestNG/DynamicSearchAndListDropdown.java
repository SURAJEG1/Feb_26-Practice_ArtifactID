package march07_TestNG;

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
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
		driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(priority=1)
	public void dynamicSearchAndListDorpdownExample1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("samsung");
		
		List<WebElement> dynamicLsit = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		int listCount = dynamicLsit.size();
		System.out.println(listCount);
		Thread.sleep(2000);
		dynamicLsit.get(4).click();
		Thread.sleep(3000);
	}
	
	
	@Test(priority=2)
	public void dynamicSearchAndListDorpdownExample2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("samsung");
		
		Thread.sleep(2000);
		List<WebElement> dynamicLsit = driver.findElements(By.xpath("//span[@class='s-heavy']"));
		System.out.println(dynamicLsit.size());
		for(int i=0; i<=dynamicLsit.size(); i++) 
		{
			if(dynamicLsit.get(i).getText().contains("s25 ultra 5g mobile")) 
			{
				dynamicLsit.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		
	}
	
	
	
	
	
	

}
