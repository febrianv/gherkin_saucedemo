package cucumber.stepDef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class abstractStepDef {
    protected static WebDriver driver;

    public static String baseUrl = "https://www.saucedemo.com/";

    protected WebDriver getDriver() {
        if (driver == null)
        {
            WebDriverManager.firefoxdriver().setup();

            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }

        return driver;
    }

    protected void clearDriver()
    {
        driver = null;
    }
}
