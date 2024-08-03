package Pages;

import Locators.LoginPageLocator;

public class LoginPage extends LoginPageLocator{
	
	public void login() {
		goToUrl("https://qa2staging.load.domo.com/");
		//loginPage.userEmail.sendKeys("rohankolhe@domosoftware.net");
		userEmail.sendKeys("rohankolhe@domosoftware.net");
		//loginPage.Password.sendKeys("Test@123");
		Password.sendKeys("Test@123");
		//sleep(5);
	}
	
	//Create method for login page
	
}
