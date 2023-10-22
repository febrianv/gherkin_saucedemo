package cucumber.stepDef;

import cucumber.pageObject.cartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class cartStepDef extends abstractStepDef {
    WebDriver driver = getDriver();
    cartPage cartPage = new cartPage(driver);

    @And("user can see {string} and {string} product in the cart")
    public void userCanSeeAndProductInTheCart(String arg0, String arg1) {
        List<String> listProduct = cartPage.listProductName();

        Assert.assertTrue(listProduct.contains(arg0) && listProduct.contains(arg1));
    }


    @Then("User redirect to cart page")
    public void userRedirectToCartPage() {
        String cartTitle = cartPage.getCartTitle();
        Assert.assertEquals(cartTitle, "Your Cart");
    }
}
