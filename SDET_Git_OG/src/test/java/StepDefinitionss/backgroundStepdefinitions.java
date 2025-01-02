package StepDefinitionss;

/*
 * import static org.testng.Assert.assertEquals;
 * 
 * import java.util.List; import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert;
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 * public class backgroundStepdefinitions { String item1; WebDriver driver ;
 * 
 * @Given("User access the saucedemo login page") public void
 * user_access_the_saucedemo_login_page() { driver = new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * driver.get("https://www.saucedemo.com/v1/");
 * driver.manage().window().maximize(); ; }
 * 
 * @When("User enters valid creds") public void user_enters_valid_creds() {
 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
 * driver.findElement(By.id("login-button")).click(); }
 * 
 * @And("Click on breadcrumb icon") public void click_on_breadcrumb_icon() {
 * //Assert.assertTrue( driver.findElement(By.
 * cssSelector("#menu_button_container > div > div:nth-child(3) > div > button"
 * )) .isDisplayed()); }
 * 
 * @Then("User should be able to see menu items") public void
 * user_should_be_able_to_see_menu_items() { List<WebElement> list1 =
 * driver.findElements(By.className("bm-item-list")); System.out.println(list1);
 * System.out.println("Menu items dieplsyed"); }
 * 
 * @And("Click on add to cart button") public void click_on_add_to_cart_button()
 * { driver.navigate().refresh(); item1 =
 * driver.findElement(By.xpath("(//*[@class=\"inventory_item_name\"])[1]")).
 * getText(); driver.findElement(By.xpath(
 * "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
 * 
 * }
 * 
 * @Then("item should be added to cart") public void
 * item_should_be_added_to_cart() {
 * 
 * driver.findElement(By.id("shopping_cart_container")).click(); String item2 =
 * driver.findElement(By.xpath("(//*[@class=\"inventory_item_name\"])[1]")).
 * getText(); Assert.assertEquals(item2, item1); System.out.println(item1 +
 * " product added to cart");
 * 
 * }
 * 
 * }
 */