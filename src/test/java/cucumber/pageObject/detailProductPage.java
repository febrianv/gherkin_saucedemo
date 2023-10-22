package cucumber.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class detailProductPage {
    WebDriver driver;

    private final By txt_productDetail = By.className("inventory_details_name");

    public detailProductPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getProductDetailTxt()
    {
        return driver.findElements(txt_productDetail).getFirst().getText();
    }
}
