package feb28_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPageObject {

	//Create object of WebDriver Class;
	WebDriver driver;
	
	//Constructor
	public Facebook_LoginPageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy (linkText = "Instagram") 
	WebElement rightClickOnInstagramLink;
	
	
	
	public void rightClickOnInstagram() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Actions action = new Actions(driver);
		action.moveToElement(rightClickOnInstagramLink).contextClick().build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
