package practiceAll;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void scrn(WebDriver driver, String filename) throws IOException {
		
		TakesScreenshot scr = (TakesScreenshot)driver;
		
		File source = scr.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"//Screenshot//"+filename+".png";
		
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
		
		
	}
	
	
	
	
}
