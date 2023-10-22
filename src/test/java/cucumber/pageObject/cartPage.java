package cucumber.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class cartPage {
    WebDriver driver;

    private final By txt_cartTitle = By.className("title");
    private final By list_productName = By.className("inventory_item_name");


    public cartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getCartTitle()
    {
        return driver.findElement(txt_cartTitle).getText();
    }

    public List<String> listProductName()
    {
        List<String> arrayList = new ArrayList<>();

        for (WebElement x : driver.findElements(list_productName)) {
            arrayList.add(x.getText());
        }

        return arrayList;
    }
}
