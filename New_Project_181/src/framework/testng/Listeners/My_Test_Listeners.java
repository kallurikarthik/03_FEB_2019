package framework.testng.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class My_Test_Listeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("=>Start Test Execution");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("happy");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Sad");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Rest");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Sad But OK");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("All Tests before ==>");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All Tests after <==");
		
	}

}
