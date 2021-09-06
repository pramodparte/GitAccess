package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploader {
	public static void main(String[] args) {
		


	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Downloaded\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();// recommended way to launch the browser
	 driver.manage().window().maximize();// to maximize the window
	 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");



         WebElement fileuploader = driver.findElement(By.xpath("//*[@name='upload']"));
          // To upload a file in selenium
             fileuploader.sendKeys("C:\\Users\\shree\\Desktop\\Screenshots");


}
}