package cucumber.stepDef;

import cucumber.pageObject.detailProductPage;
import cucumber.pageObject.productPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class product extends abstractStepDef{
    WebDriver driver = getDriver();
    productPage productPage = new productPage(driver);
    detailProductPage detailProductPage = new detailProductPage(driver);

    String productName = "";

    @Then("User redirect to inventory page")
    public void user_redirect_to_inventory_page() {
        String productPageAssert = productPage.getProductTxt();
        Assert.assertEquals(productPageAssert, "Products");
    }

    @When("User click on product name")
    public void user_click_on_product_name() {
        productName = productPage.getProductName();
        productPage.clickProductName();
    }

    @When("User click on product image")
    public void userClickOnProductImage() {
        productName = productPage.getProductName();
        productPage.clickProductImg();
    }

    @Then("User redirect to detail product")
    public void userRedirectToDetailProduct() {
        String productNameAssert = detailProductPage.getProductDetailTxt();
        Assert.assertEquals(productNameAssert, productName);
    }

    @And("we have {int} product in front of the cart icon")
    public void weHaveNumberProductInFrontOfTheCartIcon(int count) {
        int countAssert = productPage.getNumberShoppingCartBadge();
        Assert.assertEquals(countAssert,count);
    }

    @When("user click Add to cart button on {string} Product")
    public void userClickAddToCartButtonOnProduct(@NotNull String arg0) {
        switch (arg0) {
            case "Sauce Labs Backpack" -> productPage.clickBtnAddCartSouceLabsBackPack();
            case "Sauce Labs Bike Light" -> productPage.clickBtnAddCartSouceLabsBikeLight();
            case "Sauce Labs Bolt T-Shirt" -> productPage.clickBtnAddCartSouceLabsBoltTshirt();
        }
    }

    @Then("Add to cart button change to Remove button on {string} Product")
    public void addToCartButtonChangeToRemoveButtonOnProduct(@NotNull String arg0) {
        String buttonRemove = switch (arg0) {
            case "Sauce Labs Backpack" -> productPage.getBtnRemoveBackPackName();
            case "Sauce Labs Bike Light" -> productPage.getBtnRemoveBikeLightName();
            case "Sauce Labs Bolt T-Shirt" -> productPage.getBtnRemoveBoltTshirtName();
            default -> "";
        };

        Assert.assertEquals(buttonRemove, "Remove");
    }

    @When("User click icon cart")
    public void userClickIconCart() {
        productPage.clickIconCart();
    }
}
