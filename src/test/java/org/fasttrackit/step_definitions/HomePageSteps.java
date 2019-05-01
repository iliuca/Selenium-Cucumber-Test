package org.fasttrackit.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.fasttrackit.webviews.HomePage;
import org.fasttrackit.webviews.ProductsGrid;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteps extends TestBase {
    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    private Header header = PageFactory.initElements(driver, Header.class
    );

    @Given("^I open the homepage$")
    public void iOpenTheHomepage() {
        openHomepage();
    }

    @And("^I select one product$")
    public void iSelectOneProduct() {
        homePage.getElizabethTop().click();
    }


    @And("^I press VIP$")
    public void iPressVIP() {header.getVipButton().click();
    }

    @And("^I press SALE$")
    public void iPressSALE() {header.getSaleButton().click();
    }
}
