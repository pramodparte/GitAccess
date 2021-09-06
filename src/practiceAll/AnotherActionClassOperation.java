package practiceAll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnotherActionClassOperation {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\dwnl\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement user= driver.findElement(By.xpath("//*[@id='txtUsername']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(user,"Admin")
		.sendKeys(Keys.TAB).sendKeys("admin123")
		.build().perform();
		
		
	     driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		//to perform hower
//		WebElement admin =driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
//		act.moveToElement(admin).build().perform();
		
		// to perform rigth click
		
		WebElement log = driver.findElement(By.xpath("//*[@id='welcome']"));
		
		act.contextClick(log).build().perform();
		
		
		
		
	}
	
	
	
	
	
	

}
