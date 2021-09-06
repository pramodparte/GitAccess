package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiceselenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get("http://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//driver.get("http://www.facebook.com");
		
		//driver.navigate().back();
		//Thread.sleep(2000);
		
	//	driver.navigate().forward();
		
	//	String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();
		
		//driver.findElement(By.name("firstname")).click();
		//WebElement nm=driver.findElement(By.name("firstname"));
		//nm.sendKeys("Pramod");
	//	WebElement day=driver.findElement(By.id("day"));
		//Select d = new Select(day);
		//d.selectByVisibleText("23");
		
	WebElement username = driver.findElement(By.id("txtUsername"));
		
		username.sendKeys("Admin");
		
        WebElement password = driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("admin123");
	
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		for(int i=1; i<40; i++)
		{
			
		
		driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])['+i']")).click();
		
		}
		
		
		
		
	}

}
