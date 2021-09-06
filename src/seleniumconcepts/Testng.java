package seleniumconcepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {
	
	
	@ Test (priority= 2)
	public void m1()
	{
		
		System.out.println("m1 is running");
		
	}
     @ Test (priority =1)
	public void m2()
	{
		System.out.println("m2 is running");
		Reporter.log("m2 is runs", true);	
	}
	
}
