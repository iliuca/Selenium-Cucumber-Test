package org.fasttrackit.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.HomePage;
import org.fasttrackit.webviews.SingleProductPage;
import org.fasttrackit.webviews.ShoppingCart;
import org.openqa.selenium.support.PageFactory;
import static org.hamcrest.MatcherAssert.assertThat;

public class SingleProductSteps extends TestBase {
    SingleProductPage singleProductPage = PageFactory.initElements(driver, SingleProductPage.class);
    Header header = PageFactory.initElements(driver, Header.class);
    ShoppingCart shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @And("^I select color \"([^\"]*)\"$")
    public void iSelectColor(String color) {
        if (color.equals("pink")) {
            singleProductPage.colorPink.click();
            if (color.equals("red")) {
                singleProductPage.colorRed.click();
            }
        }
    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size) {
        if (size.equals("S")) {
            singleProductPage.sizeS.click();
            if (size.equals("M")) {
                singleProductPage.sizeM.click();
                if (size.equals("L")) {
                    singleProductPage.sizeL.click();
                    if (size.equals("XL")) {
                        singleProductPage.sizeXL.click();
                    }
                }
            }
        }
    }

    @When("^I press Add to cart$")
    public void iPressAddToCart() {
        singleProductPage.getAddToCart().click();
    }


    @And("^I select one size$")
    public void iSelectOneSize() {
        singleProductPage.sizeS.click();
    }

    @And("^I select one color$")
    public void iSelectOneColor() {
        singleProductPage.colorPink.click();
    }
}
