package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {
	//static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
        driver.manage().window().maximize();  // To Maximize Window
        Thread.sleep(2000);
		
		
		driver.get("http://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		username.sendKeys("Admin");
		
        WebElement password = driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("admin123");
		
	//	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
	//	driver.findElement(By.xpath("//Input[@id='menu_admin_viewAdminModule']")).click();
	//	driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_37']")).click();  
		


	}

}
