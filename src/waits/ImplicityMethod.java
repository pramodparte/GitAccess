package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicityMethod {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("india");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		
//		driver.findElement(By.xpath("//*[text()='Sbi.co.in']")).click();
		driver.findElement(By.partialLinkText("Sbi.co.in")).click();
		
		
		
	}

}
