package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Downloaded\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://en-gb.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI3NzA1MTEzLCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
	
	WebElement fname = driver.findElement(By.xpath("//*[@name='firstname']"));
	
	Actions act = new Actions(driver);
	
	act.sendKeys(fname,"Pramod")
	.sendKeys(Keys.TAB).sendKeys("Parte")
	.sendKeys(Keys.TAB).sendKeys("8482838550")
	.sendKeys(Keys.TAB).sendKeys("password")
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
	
	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	
	act.click(day).sendKeys("23")
	.sendKeys(Keys.TAB).sendKeys("Jul")
	.sendKeys(Keys.TAB).sendKeys("1993")
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).click()
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
	.click().build().perform();
	
	
	
	
	}
}
