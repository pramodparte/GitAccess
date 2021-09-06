package testingNg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg1 {
	
	
	@BeforeSuite
	public void beforeSuit()
	{
	System.out.println("From TestNg2");	
	}
	
	
	@Test
	public void testcase1()
	
	{
		System.out.println("Test case 1 is running");
		
	}

	@Test
    public void testcase2()
	
	{
		System.out.println("Test case 2 is running");
		
	}
}
