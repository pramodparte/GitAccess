package testingNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Module1 {
	
	@Test(priority =1)
	public void logIn()
	{
		
		Reporter.log("log in from module1", true);
	}

	
	@Test(priority =2)
	public void dashBoard()
	{
		
		Reporter.log("dash board from module1", true);
		
		Assert.fail();
	}
	
	
	
	@Test(priority =3, dependsOnMethods = "dashBoard")
	public void admin()
	{
		
		Reporter.log("admin from module1", true);
	}
}
