package march16_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	//Crate object of WebDriver interface;
	WebDriver driver;
	//Constructor
	public PageObjectClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (id = "") 
	WebElement username;
	
	@FindBy (id = "") 
	WebElement password;
	
	
	
	public void login(String un) 
	{
		username.sendKeys(un);
	}
	
	
	public void password(String pwd) 
	{
		password.sendKeys(pwd);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
