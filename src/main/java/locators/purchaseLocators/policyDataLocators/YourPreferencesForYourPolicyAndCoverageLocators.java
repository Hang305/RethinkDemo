package locators.purchaseLocators.policyDataLocators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourPreferencesForYourPolicyAndCoverageLocators extends PageObject {

    //Title
    @FindBy(css = "#policy-data .text-primary")
    public WebElement titleSelector;

    //Pay your premium
    @FindBy(css = "#policy-data input[value='Yearly']")
    public WebElement yearlySelector;
    @FindBy(css = "#policy-data input[value='Monthly']")
    public WebElement monthlySelector;

    //BA + Full Omnium
    @FindBy(css = "#policy-data input[type='checkbox']:nth-child(1)")
    public WebElement BA_FullOmniumCheckboxSelector;
    @FindBy(css = "#policy-data button:nth-child(1)")
    public WebElement BA_FullOmniumSuggestionSelector;
    @FindBy(css = "#policy-data .text-base:nth-child(2)")
    public WebElement BA_FullOmniumResultSelector;

    //Legal Assistance
    @FindBy(css = "#policy-data input[type='checkbox']:nth-child(2)")
    public WebElement legalCheckboxSelector;
    @FindBy(css = "#policy-data button:nth-child(2)")
    public WebElement legalSuggestionSelector;
    @FindBy(css = "#policy-data .text-base:nth-child(2)")
    public WebElement legalResultSelector;

    //Physical damage
    @FindBy(css = "#policy-data input[type='checkbox']:nth-child(3)")
    public WebElement physicalCheckboxSelector;
    @FindBy(css = "#policy-data button:nth-child(3)")
    public WebElement physicalSuggestionSelector;
    @FindBy(css = "#policy-data .text-base:nth-child(3)")
    public WebElement physicalResultSelector;

    //Roadside assistance
    @FindBy(css = "#policy-data input[type='checkbox']:nth-child(4)")
    public WebElement roadSideCheckboxSelector;
    @FindBy(css = "#policy-data button:nth-child(4)")
    public WebElement roadSideSuggestionSelector;
    @FindBy(css = "#policy-data .text-base:nth-child(4)")
    public WebElement roadSideResultSelector;

    //Equipment
    @FindBy(css = "#policy-data input[type='checkbox']:nth-child(5)")
    public WebElement equipmentCheckboxSelector;
    @FindBy(css = "#policy-data button:nth-child(5)")
    public WebElement equipmentSuggestionSelector;
    @FindBy(css = "#policy-data .text-base:nth-child(5)")
    public WebElement equipmentResultSelector;

    //Total
    @FindBy(css = "#policy-data .text-base:nth-child(6)")
    public WebElement totalResultSelector;

    //Agree to the IPID Sheet
    @FindBy(css = "#policy-data form input[type='checkbox']")
    public WebElement agreeCheckboxSelector;

    //Make an insurance contract button
    @FindBy(css = " #policy-data .block")
    public WebElement makeInsuranceContractBtn;

}
