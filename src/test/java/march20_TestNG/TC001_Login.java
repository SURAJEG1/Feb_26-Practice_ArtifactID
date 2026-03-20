package march20_TestNG;

import org.openqa.selenium.WebDriver;

public class TC001_Login extends BaseTest{
	
	
	
	

	public void loginCredentials() 
	{
		driver.get(baseUrl);
		
		PageObject login = new PageObject(driver);
		login.userid("example@gamil.com");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
