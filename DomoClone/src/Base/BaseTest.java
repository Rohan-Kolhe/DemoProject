package Base;

import org.openqa.selenium.WebDriver;

import WebDriverSetup.WebDriverSetup;


public class BaseTest {
	
	private static WebDriverSetup webDriverSetup;
	public WebDriver driver;
	
	protected BaseTest(){
		webDriverSetup = new WebDriverSetup();
		driver = webDriverSetup.getDriver() ;
	}
	
	public void goToUrl(String url) {
		driver.get(url);
	}
	
	public void quitDriver() {
		System.out.println("close driver");
		driver.quit();
	}

}
