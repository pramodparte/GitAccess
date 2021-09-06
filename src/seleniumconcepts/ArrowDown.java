package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
		 driver.manage().window().maximize();// to maximize the window
		 driver.get("https://www.google.com/");
		 
		 WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));   //web element of search box
		 Actions act = new Actions(driver);
		 
		 act.sendKeys(searchbox, "Ind").perform();   //send keys method of action method
		 
		 Thread.sleep(2000);
		
		 
		 act.sendKeys(searchbox, Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .build().perform();
		 

		
		
		
	}

}
