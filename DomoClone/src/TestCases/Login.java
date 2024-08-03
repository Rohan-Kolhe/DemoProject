package TestCases;

import org.testng.annotations.*;

import Base.BasePage;
import Base.BaseTest;
import Pages.LoginPage;

public class Login extends BaseTest {
	LoginPage loginPage;
	
	@BeforeMethod
	public void setup() {
		loginPage = new LoginPage();
	}
	
	@Test
	public void login_1() {
//		loginPage.goToUrl("https://qa2staging.load.domo.com/");
//		//loginPage.userEmail.sendKeys("rohankolhe@domosoftware.net");
//		loginPage.waitForElementToBeVisible(loginPage.userEmail).sendKeys("rohankolhe@domosoftware.net");
//		//loginPage.Password.sendKeys("Test@123");
//		waitForElementToBeVisible(loginPage.Password).sendKeys("Test@123");
//		sleep(5);
		loginPage.login();
	}
	
	@AfterMethod
	public void cleanUp() {
		loginPage.quitDriver();
	}

}
