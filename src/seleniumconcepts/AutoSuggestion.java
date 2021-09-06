package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
	 driver.manage().window().maximize();// to maximize the window
	 driver.get("https://www.google.com/");
	 
	 WebElement searchbox = driver.findElement(By.xpath("//*[@id='input']"));
	 Actions act = new Actions(driver);
	 act.sendKeys(searchbox, "webdriver").perform();
	 Thread.sleep(2000);
	
	 List<WebElement> searchlist = driver.findElements(By.xpath("//*[@jsname='erkvQe']//div//span[text()='webdriver']"));
	 
	 for(WebElement searchresult:searchlist)
	 {
		 String value = searchresult.getText();
		 
		 System.out.println(value);
		 
		 if(value.contains("manager"))
		 {
			 Thread.sleep(1000);
			 searchresult.click();
		 }
	 }
	 	 
	 
	 
	
	 


}


	

}
