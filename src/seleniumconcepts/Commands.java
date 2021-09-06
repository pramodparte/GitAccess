package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
	
	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //Launch a Browser
		
		driver.manage().window().maximize();  // To Maximize Window
		
		driver.get("http:\\www.google.com");
		
		String title =driver.getTitle();
		System.out.println("Title is "+title);
		Thread.sleep(3000);
		
		driver.get("http:\\www.Facebook.com");
		
		driver.navigate().back();   //  use to navigate back
		
		Thread.sleep(2000);
		
		driver.navigate().forward();   //  use to navigate Forward
		Thread.sleep(2000);
		
		driver.navigate().refresh();   //  use to Refresh page
		
		
		String currenturl =driver.getCurrentUrl();		
		System.out.println(currenturl);      
		
		driver.close();            //  use to close window   
		
		
		
		
		
		
	}

}
