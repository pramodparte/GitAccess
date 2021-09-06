package testingNg;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InclusionAndExclusion {
	
	@Test(priority = 1,invocationCount=5)
	public void testCase1()
	{
		
		Reporter.log("Test case 1", true);
		
	}
	
	@Test(priority = 2)
	public void testCase2()
	{
		
		Reporter.log("Test case 2", true);
		Assert.fail();
		
	}
	
	@Test(priority = 3, dependsOnMethods="testCase2")
	public void testCase3()
	{
		
		Reporter.log("Test case 3", true);
		
	}
	
	

}
