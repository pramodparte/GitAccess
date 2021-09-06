package seleniumconcepts;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
       WebElement chbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_21']"));	
       
       /*   JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.ScrollBy(0.1000)");
       
       Thread.sleep(2000);
       
       js.executeScript("window.scrollBy(0,-400)");   */  // my code
       
       
      JavascriptExecutor js = (JavascriptExecutor)driver;
      /* 	// to scroll downward and upward
		js.executeScript("window.scrollBy(0, 800)");
		
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -400)");   */
		 
		js.executeScript("arguments[0].scrollIntoView();", chbox);  
		

       
	}

}
