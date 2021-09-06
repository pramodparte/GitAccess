package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands1 {
	
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
        driver.manage().window().maximize();  // To Maximize Window
		//driver1.get("https://www.facebook.com");
		
        String title =driver.getTitle();
		System.out.println("Title is "+title);
		Thread.sleep(3000);
		
		String currenturl =driver.getCurrentUrl();		
		System.out.println("Current URL is "+currenturl);      
		
	/* boolean s = title.equals(currenturl) ;
	   System.out.println(s); */

}
}
