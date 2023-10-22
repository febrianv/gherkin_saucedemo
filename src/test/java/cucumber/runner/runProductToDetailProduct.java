package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/cucumber/resources/features/productToDetailProduct.feature",
    glue = "cucumber/stepDef",
    plugin = {
        "html:target/HTML_report_product_to_detailProduct.html"
    }
)

public class runProductToDetailProduct {
}
