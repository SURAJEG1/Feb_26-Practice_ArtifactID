package march13_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	WebDriver driver;

	public ReusableMethods(WebDriver driver) {
		this.driver =driver;
	}


	public void maximize() {
		driver.manage().window().maximize();
	}


	public void impWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	public void thread_Wait(int sleepTime) throws InterruptedException {
		Thread.sleep(sleepTime);
	}


	public void refresh() {
		driver.navigate().refresh();
	}


	public void backward() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

















}
