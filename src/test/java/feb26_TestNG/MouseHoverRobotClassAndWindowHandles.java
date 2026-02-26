package feb26_TestNG;

import org.testng.annotations.Test;

import pageObjectClasses.Facebook_LoginPage;

public class MouseHoverRobotClassAndWindowHandles extends BaseClass1{
	
	@Test
	public void mouseHoverRightClickRobotClassAndWindowHandle() 
	{
		driver.get(facebookUrl);
		//Facebook_LoginPage fblogin = new Facebook_LoginPage(driver);
		//fblogin.mouseHoverRightClickOnInstagramLink();

	}
	
	
	
	
	
	

}
