package march27_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {

	WebDriver driver;


	@Test
	public void amazon() 
	{

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//		List<WebElement> prime  = driver.findElements(By.tagName("a"));
		//
		//		for(int i=0; i<prime.size(); i++) {
		//
		//			if(prime.get(i).getText().contains("Fashion")) {
		//				System.out.println(prime.get(i).getText());
		//				prime.get(i).click();
		//				break;
		//			}
		//		}


		List<WebElement> fashion=driver.findElements(By.tagName("a"));

		for(int i=0; i<fashion.size(); i++) {
			System.out.println(fashion.get(i).getText());
			System.out.println(fashion.get(i).getAttribute("href"));
			System.out.println();


		}



	}


















}
