package base_pack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static WebDriver driver;
	
//	public base(WebDriver driver){
//		
//		this.driver = driver;
//	}
	
	public static void browser() {
		
		driver = new ChromeDriver();
	}
	
	public void url(String url) {
		
		driver.get(url);
	}
	
	public void max() {
		
		driver.manage().window().maximize();
	}
	
	public void implicit_waits() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void screen_shot(String screen) throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File snap = screenshot.getScreenshotAs(OutputType.FILE);
		String destination = "/Automate_testng/Screenshot"+ screen +".png";
		File imgpath = new File(destination);
		FileUtils.copyFile(snap, imgpath);
	}
	
	public void element_click(WebElement element ) {
		
		element.click();
	}
	
}
