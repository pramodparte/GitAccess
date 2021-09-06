package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupHandle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
		 driver.manage().window().maximize();// to maximize the window
		 driver.get("https://www.flipkart.com/");
		
		
	WebElement closebutton = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));

	closebutton.click();


	}

}
