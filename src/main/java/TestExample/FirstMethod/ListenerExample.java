package TestExample.FirstMethod;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("tescase finished");
		
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("testcase started");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
System.out.println("percentage");
	}

	public void onTestFailure(ITestResult arg0) {
		
		System.out.println("tescase failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("testcase skipped");
		
	}

	public void onTestStart(ITestResult arg0) {
	System.out.println("test start");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
		System.out.println("testcase succesful");
	}

}
