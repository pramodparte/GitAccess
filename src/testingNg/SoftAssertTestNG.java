package testingNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class  SoftAssertTestNG {
	
	
	
	@Test
	public void testCase1()
	{
		
		System.out.println("Before assertion");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(false, true);
		
		System.out.println("After assertion");
		
		sa.assertAll();
		
		
		
	}

}

	
	

