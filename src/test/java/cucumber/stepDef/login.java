package cucumber.stepDef;

import cucumber.pageObject.loginPage;
import cucumber.pageObject.productPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class login extends abstractStepDef{
    WebDriver driver = getDriver();
    loginPage loginPage = new loginPage(driver);
    productPage productPage = new productPage(driver);

    @Given("login page is ready")
    public void login_page_is_ready() {
        driver.get(baseUrl);

        String loginPageAssert = loginPage.getSwagLabsTxt();
        Assert.assertEquals(loginPageAssert, "Swag Labs");
    }

    @When("Input valid username")
    public void input_valid_username() {
        loginPage.enterUserName("standard_user");
    }

    @And("Input valid password")
    public void input_valid_password() {
        loginPage.enterPassword("secret_sauce");
    }

    @And("click login button")
    public void click_login_button() {
        loginPage.clickButtonLogin();
    }

    @And("Input invalid password")
    public void input_invalid_password() {
        loginPage.enterPassword("wrongPassword");
    }

    @Then("User get error message")
    public void user_get_error_message() {
        String errorMessage = loginPage.getErrorTxt();
        Assert.assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
    }

    @When("Input invalid username")
    public void input_invalid_username() {
        loginPage.enterUserName("wrongUserName");
    }
}