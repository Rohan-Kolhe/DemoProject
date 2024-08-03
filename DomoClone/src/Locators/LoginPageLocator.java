package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Base.BaseTest;

public class LoginPageLocator extends BasePage {
	
	protected LoginPageLocator() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="//input[contains(@name,'username')]")
	public WebElement userEmail;
	
	@FindBy(how = How.XPATH, using="//input[contains(@name,'password')]")
	public WebElement Password;
	
}
