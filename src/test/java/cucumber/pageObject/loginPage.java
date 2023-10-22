package cucumber.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    private final By form_userName = By.id("user-name");
    private final By form_password = By.id("password");
    private final By btn_login = By.id("login-button");
    private final By txt_swagLabs = By.xpath("//div[contains(text(), 'Swag Labs')]");
    private final By txt_error = By.xpath("//h3[@data-test='error']");

    public loginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUserName(String userName)
    {
        driver.findElement(form_userName).sendKeys(userName);
    }

    public void enterPassword(String password)
    {
        driver.findElement(form_password).sendKeys(password);
    }

    public void clickButtonLogin()
    {
        driver.findElement(btn_login).click();
    }

    public String getSwagLabsTxt()
    {
        return driver.findElement(txt_swagLabs).getText();
    }

    public String getErrorTxt()
    {
        return driver.findElement(txt_error).getText();
    }
}
