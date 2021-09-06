package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String [] args) 
	{
		System.setProperty("webdriver.driver.chromedriver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //Launch a Browser
		
		driver.manage().window().maximize();  // To Maximize Window
		
		//driver.get("http://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
}
}