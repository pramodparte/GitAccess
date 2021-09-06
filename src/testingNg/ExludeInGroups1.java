package testingNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExludeInGroups1 {
	
	
//	here we use exclude then that particular test case in not run but we use include
//	that test cases run which is included inside the group

	
	@Test(groups = {"smoke","sanity"})
	public void logIn()
	{
		
		Reporter.log("log in from ExludeInGroups1", true);
	}

	@Test(groups = "smoke")
	public void admin()
	{
		
		Reporter.log("admin in from ExludeInGroups1", true);
	}

	
	@Test(groups = "sanity")
	public void dashboard()
	{
		
		Reporter.log("log in from ExludeInGroups1", true);
	}

	@Test(groups = "smoke")
	public void profile()
	{
		
		Reporter.log("profile in from ExludeInGroups1", true);
	}

	@Test(groups = "second")
	public void freindrequest()
	{
		
		Reporter.log("log in from ExludeInGroups1", true);
	}

	@Test(groups = "sanity")
	public void logout()
	{
		
		Reporter.log("log in from ExludeInGroups1", true);
	}
	@Test(groups = "smoke")
	public void rest()
	{
		
		Reporter.log("rest in from ExludeInGroups1", true);
	}

}
