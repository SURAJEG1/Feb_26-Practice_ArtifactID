package march07_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : Successfully Executed");
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " : Got failed & Screensoht captured");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
