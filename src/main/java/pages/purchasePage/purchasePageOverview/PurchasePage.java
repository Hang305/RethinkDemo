package pages.purchasePage.purchasePageOverview;

import locators.purchaseLocators.purchaseOverviewLocators.PurchaseLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import support.actions.Actions;
import support.check.Check;

import java.util.jar.JarOutputStream;

@DefaultUrl("https://rethinkit.smartdev.vn/purchase")
public class PurchasePage extends PageObject {
    PurchaseLocators purchaseLocators;
    Actions action;
    Check check;

    //Check The current url
    public void checkTheCurrentUrl(String urlExpected) {
        check.checkContainUrlText(action.getUrl(), urlExpected, "The current url is displayed wrong ");
    }

    //Check header - navbar
    // -- Your personal information
    public void navigateToYourPersonalInformationSection(){
        action.clickElement(purchaseLocators.personaInformationSel);
    }
    public void checkYourPersonalInformationText(String content) {
        check.checkContainText(purchaseLocators.personaInformationSel, content, "The content is displayed wrong for Your personal information");
    }

    // -- Data your motorcycle
    public void checkDataOfYourMotorcycleText(String content) {
        check.checkContainText(purchaseLocators.motorcycleSel, content, "The content is displayed wrong for Data of your motorcycle");
    }

    // -- Policy Preferences
    public void checkPolicyPreferencesText(String content) {
        check.checkContainText(purchaseLocators.policyPreferencesSel, content, "The content is displayed wrong for Policy Preferences");
    }
}
