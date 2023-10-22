package cucumber.stepDef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class common extends abstractStepDef{
    WebDriver driver = getDriver();

    @Then("Close browser")
    public void close_browser() {
        driver.quit();
        clearDriver();
    }
}
