package seleniumconcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {
	
	
	
	
	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
		 driver.manage().window().maximize();// to maximize the window
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 
		 
		 String parentid = driver.getWindowHandle();

		 System.out.println("Parent id is :"+parentid);
         //multiple windows
		 driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		 driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		 driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		 
		 
		 Set<String> allwindow = driver.getWindowHandles(); 
			
			int numberofwindow = allwindow.size();
			System.out.println(numberofwindow);
			
			String[] winid = new String[numberofwindow];
			int i = 0;
			for(String id :allwindow)
			{
				winid[i]=id;
				i++;
			}
			
			
			// to print the array which contains all the id
			for (String ss :winid)
			{
				System.out.println(ss);
			}
			
			
			driver.switchTo().window(winid[2]);
			
			driver.get("https://www.facebook.com/")	;
			
			driver.switchTo().window(winid[3]);
			driver.get("https://www.google.com/")	;
			
			
			
			
			Thread.sleep(2000);
			
			driver.quit();
			
			
			
		 
		
		
			}
	
}


