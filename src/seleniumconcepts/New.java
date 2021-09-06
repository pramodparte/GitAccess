package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	
	public static void main(String[] args, List<WebElement> c) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver ();
	driver.get("http://www.google.com");
	
      Thread.sleep(2000);
	
	driver.get("http://opensource-demo.orangehrmlive.com/index.php/dashboard");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//*[@name='Submit']")).click();
	
	
	//int i=1;
	driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	
	//WebElement checkboxes = driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord')]"));
	//for(int i=1; i<40; i++)
	
		
	List<WebElement> a = driver.findElements(By.xpath("//*[@name='chkSelectAll']"));
		
			
	
	
	
	//driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_10']")).click();
	
	
	
	
	
	}

}
