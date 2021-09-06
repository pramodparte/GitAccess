package testingNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Module2 {
	
	@Test(dependsOnMethods= "testingNg.Module1.admin")
	public void m1()
	{
		Reporter.log("M2 from Module2", true);
		
	}
	

}
