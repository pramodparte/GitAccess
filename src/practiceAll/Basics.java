package practiceAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\dwnl\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//username.sendKeys("Admin");
		 
	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
    driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
    
    

		
		
		
		
	}

}
