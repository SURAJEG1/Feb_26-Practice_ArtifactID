package march19_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	WebDriver driver;
	
	public PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (id = "") 
	WebElement username;
	
	@FindBy (id = "")
	WebElement password;
	
	@FindBy (xpath = "")
	WebElement lgButton;
	
	
	
	public void userID(String un) 
	{
		username.sendKeys(un);
	}
	
	
	public void userPwd(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	
	public void clicOnLogin() 
	{
		lgButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
