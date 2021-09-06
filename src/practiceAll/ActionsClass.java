package practiceAll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\dwnl\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement search =driver.findElement(By.xpath("//*[@name='q']"));
		Actions act = new Actions(driver);
		
		act.sendKeys(search,"india").build().perform();
		
		act.sendKeys(search,Keys.ARROW_DOWN).sendKeys(search,Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
		
		

		
		
		
		
	}
	

}
