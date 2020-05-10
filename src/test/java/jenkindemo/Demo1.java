package jenkindemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");    
		
	}
	
	

public static void main(String[] args) {
	

	
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
		 driver.get("https://www.facebook.com");
}
}