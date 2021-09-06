package seleniumconcepts;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import utility.ScreenShot;

public class ScreenS {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.get("http://www.orangehrm.com");
		
		ScreenShot.capturescreenshot(driver, "orange");	
		
		
		
	}

}
