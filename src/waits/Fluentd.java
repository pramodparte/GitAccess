package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentd {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
		 driver.manage().window().maximize();// to maximize the window
		 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		 
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				 						.withTimeout(50, TimeUnit.SECONDS)
				 						.pollingEvery(10, TimeUnit.MILLISECONDS);
		
		 driver.findElement(By.xpath("//*[@id='alert']")).click();
		 
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		 driver.switchTo().alert().accept();
		 
	}


}
