package testingNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Testlistners2 extends Testlistners1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Log in Start :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Log in Execute :"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Oops ! it is failed check code :"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("it is skipped  :"+result.getName());
		
		}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on start :"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("it is finish :"+context.getName());
		
	}

	
	
	
	

}
