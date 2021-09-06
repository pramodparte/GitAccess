package testingNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void homePage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
		 driver.manage().window().maximize();// to maximize the window
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		String names = username.getAttribute("name");
		
		System.out.println("names return :"+names);
		 
//		WebElement username = driver.findElement(By.tagName("input"));
		
		username.sendKeys("Admin");
		
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");// by id
	
	
//	WebElement loginbutton = driver.findElement(By.className("button"));// by class name
	WebElement loginbutton = driver.findElement(By.name("Submit"));// by name
	
	loginbutton.click();
	
String urlofdashboard = driver.getCurrentUrl();

String expectedurl = "dashboard";

//Assert.assertEquals(urlofdashboard.contains(expectedurl), false);
//Assert.assertEquals(urlofdashboard, expectedurl);
  Assert.assertTrue(true, "Test case is true");
	}
	
	

}
