package testingNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test(groups = "first")
	public void logIn()
	{
		
		Reporter.log("log in from module1", true);
	}

	@Test(groups = "second")
	public void admin()
	{
		
		Reporter.log("log in from module1", true);
	}

	
	@Test(groups = "first")
	public void dashboard()
	{
		
		Reporter.log("log in from module1", true);
	}

	@Test(groups = "first")
	public void profile()
	{
		
		Reporter.log("log in from module1", true);
	}

	@Test(groups = "second")
	public void freindrequest()
	{
		
		Reporter.log("log in from module1", true);
	}

	@Test(groups = "first")
	public void logout()
	{
		
		Reporter.log("log in from module1", true);
	}
	@Test(groups = "second")
	public void rest()
	{
		
		Reporter.log("log in from module1", true);
	}

}
