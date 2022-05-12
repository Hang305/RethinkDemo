package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import pages.homepagePage.HomepagePage;
import net.thucydides.core.pages.PageObject;
import pages.purchasePage.purchasePageOverview.PurchasePage;

public class GivenSteps extends PageObject {
    HomepagePage homepagePage;
    PurchasePage purchasePage;

    // SHOWROOM -------------------------------------
    //Open home page
    @Given("^Open the homepage$")
    public void openHomePage() {
        homepagePage.open();
    }

    // PURCHASE -------------------------------------
    //Open purchase page
    @Given("^Open Purchase page$")
    public void openPurchasePage() {
        purchasePage.open();
    }



}
