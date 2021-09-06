package practiceAll;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\dwnl\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");	
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(ExcelReader.ready(0, 0));
		//driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(ExcelReader.ready(0, 1));
	    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	    
	    ScreenShot.scrn(driver, "screenshot1");
		
		
		
	}
	

}
