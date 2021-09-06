package testingNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ExcelReader;
import utility.ScreenShot;

public class Testlistners1 {
	static WebDriver driver;
	@Test
	public void login() throws IOException, InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get("http://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		 
		username.sendKeys(ExcelReader.readData(0, 0));
		
	driver.findElement(By.id("txtPassword")).sendKeys(ExcelReader.readData(0, 1));// by id
	
	

	WebElement loginbutton = driver.findElement(By.name("Submit"));// by name
	
	loginbutton.click();
	
	ScreenShot.capturescreenshot(driver,"listners");
		
		
	}
	

}
