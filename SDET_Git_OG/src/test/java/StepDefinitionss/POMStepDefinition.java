package StepDefinitionss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.loginPageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMStepDefinition {
	loginPageObjects login;

	static WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters {string} and {string}")
	public void user_enters_username_and_password(String Username, String password) {
		login = new loginPageObjects(driver);
		login.enterUsername(Username);
		login.enterPassword(password);
	}

	@And("Click on login button")
	public void click_on_login_button() {
		login.clickOnLogin();
	}

	@Then("User should logged in successfully")
	public void user_should_logged_in_successfully() {
		login.verifyHomepage();
	}

	@And("close the browser") public void close_the_browser() { driver.quit();// closes the browser 
 }

}
