package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
		 driver.manage().window().maximize();// to maximize the window
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
	WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		 
	Actions act = new Actions(driver);
	act.doubleClick(doubleclickbutton).perform();
	
	
	Thread.sleep(2000);
	
	
	String messageonalert = driver.switchTo().alert().getText();
	
	
	
	System.out.println(messageonalert);
	
	
	driver.switchTo().alert().accept();
	
	
	// to handle confirmation alert pop up:
	
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		

	}
	

}
