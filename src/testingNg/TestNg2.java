package testingNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg2 {
	
	
	@AfterSuite
	public void afterSuit()
	{
	System.out.println("From TestNg2");	
	}
	
	
	@Test
	public void testcase3()
	
	{
		System.out.println("Test case 3 is running");
		
	}

	@Test
    public void testcase4()
	
	{
		System.out.println("Test case 4 is running");
		
	}

}
