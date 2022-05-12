package locators.purchaseLocators.driverAndInsuredDataLocators.insuredPartyLocators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataPolicyholderLocators extends PageObject {

    //Same as main driver checkbox
    @FindBy(css = "input[type ='checkbox']")
    public WebElement sameAsMainDriverCheckboxSelector;

    //Person
    @FindBy(css = "option[value ='person']")
    public WebElement personaCheckboxSelector;

    //Company
    @FindBy(css = "option[value ='firma']")
    public WebElement companyCheckboxSelector;
}
