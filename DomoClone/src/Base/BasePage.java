package Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BaseTest {
	//WebDriver wait
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	//
	public WebElement waitForElementToBeVisible(WebElement selector) {
		return wait.until(ExpectedConditions.visibilityOf(selector));
	} 
	public void sleep(int sec) {
		System.out.println("Sleeping");
		try {
			TimeUnit.SECONDS.sleep(sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
