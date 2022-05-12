package pages.homepagePage;

import locators.homepageLocators.HomepageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://rethinkit.verzekerje.be/")
public class HomepagePage extends PageObject {

    HomepageLocators homepageLocators;

    //Open Homepage
    public void homePage_Open(){
        open();
    }

    //Click "Calculate your premium here" button
    public void clickCalculateButton(){
        homepageLocators.calculateButton.click();
    }

}
