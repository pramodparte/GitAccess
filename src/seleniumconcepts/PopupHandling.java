package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:\\www.Google.com");
		
		
		
		
	}

}
