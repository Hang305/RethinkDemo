package locators.purchaseLocators.purchaseOverviewLocators;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseLocators extends PageObject {

    //HEADER--------------------------------------
    //Your personal information
    @FindBy(css = "#header a[href='#driver-insured-party']")
    public WebElement personaInformationSel;

    //Motorcycle
    @FindBy(css = "#header a[href='#motorcyc-data']")
    public WebElement motorcycleSel;

    //Policy preferences
    @FindBy(css = "#header a[href='#policy-data']")
    public WebElement policyPreferencesSel;

}
