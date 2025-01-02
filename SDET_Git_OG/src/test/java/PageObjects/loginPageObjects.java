package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageObjects {
	static WebDriver driver;
	public loginPageObjects(WebDriver driver) {
		this.driver= driver;
	}
	
	
	By txt_uname= By.id("user-name");
	By txt_Password= By.id("password");
	By login_btn= By.id("login-button");
	By home_logo= By.className("shopping_cart_container");
	
	public void enterUsername(String Username) {
		driver.findElement(txt_uname).sendKeys("standard_user");
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_Password).sendKeys("secret_sauce");
	}
	
	public void clickOnLogin() {
		driver.findElement(login_btn).click();
	}
	
	public void verifyHomepage() {
		driver.findElement(home_logo).isDisplayed();
		System.out.println("USer is on homepage");
	}
}
