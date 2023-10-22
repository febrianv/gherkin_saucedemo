package cucumber.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productPage {
    WebDriver driver;

    private final By txt_product = By.xpath("//span[contains(text(), 'Products')]");
    private final By shoppingCartBadge = By.className("shopping_cart_badge");
    private final By txt_productName = By.className("inventory_item_name");
    private final By img_productName = By.className("inventory_item_img");
    private final By btn_addCartBackPack = By.id("add-to-cart-sauce-labs-backpack");
    private final By btn_addCartBikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    private final By btn_addCartBoltTshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By btn_removeBackPack = By.id("remove-sauce-labs-backpack");
    private final By btn_removeBikeLight = By.id("remove-sauce-labs-bike-light");
    private final By btn_removeBoltTshirt = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By icon_cart = By.className("shopping_cart_link");



    public productPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getProductTxt()
    {
        return driver.findElement(txt_product).getText();
    }

    public String getProductName()
    {
        return driver.findElements(txt_productName).getFirst().getText();
    }

    public void clickProductName()
    {
        driver.findElements(txt_productName).getFirst().click();
    }

    public void clickProductImg()
    {
        driver.findElements(img_productName).getFirst().click();
    }

    public void clickBtnAddCartSouceLabsBackPack()
    {
        driver.findElement(btn_addCartBackPack).click();
    }

    public void clickBtnAddCartSouceLabsBikeLight()
    {
        driver.findElement(btn_addCartBikeLight).click();
    }

    public void clickBtnAddCartSouceLabsBoltTshirt()
    {
        driver.findElement(btn_addCartBoltTshirt).click();
    }

    public String getBtnRemoveBackPackName()
    {
        return driver.findElement(btn_removeBackPack).getText();
    }

    public String getBtnRemoveBikeLightName()
    {
        return driver.findElement(btn_removeBikeLight).getText();
    }

    public String getBtnRemoveBoltTshirtName()
    {
        return driver.findElement(btn_removeBoltTshirt).getText();
    }

    public int getNumberShoppingCartBadge()
    {
        return Integer.parseInt(driver.findElement(shoppingCartBadge).getText());
    }

    public void clickIconCart()
    {
        driver.findElement(icon_cart).click();
    }

}
