package WebDriverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverSetup {
	
	static WebDriver driver;
	ChromeOptions co = new ChromeOptions();
	
	
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().capabilities(co).create();
		driver = new ChromeDriver();
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		setUp();
		return driver;
	}
	
}
