package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {
	
	@FindBy (id="user-name")
	WebElement txt_username;
	
	@FindBy (id="password")
	WebElement txt_password;
	
	@FindBy (id="login-button")
	WebElement log_btn;
	
	@FindBy (className="shopping_cart_container")
	WebElement home_logo;
	
	static WebDriver driver;
	//declare construcor - impin page factory 
	public loginPageFactory(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String Username) {
		txt_username.sendKeys("standard_user");
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys("secret_sauce");
	}
	
	public void clickOnLogin() {
		log_btn.click();
	}
	
	public void verifyHomepage() {
		home_logo.isDisplayed();
		System.out.println("USer is on homepage");
	}

}
