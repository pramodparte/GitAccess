package testingNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNg {
	
	
	@Parameters("browser")
	@Test
	public void launchChrome(String name)
	{
		
		
		if(name.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\May 21\\selenium\\chromedriver.exe");

			 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
			 driver.manage().window().maximize();// to maximize the window
			 
			 driver.get("https://www.facebook.com/");
		}
		
		else if(name.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\A\\Desktop\\geckodriver.exe");

			 WebDriver driver = new FirefoxDriver();// recommended way to launch the browser
			 driver.manage().window().maximize();// to maximize the window
			 
			 driver.get("https://www.google.com/");
		}


	}}
