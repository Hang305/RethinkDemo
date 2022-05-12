package locators.purchaseLocators.driverAndInsuredDataLocators.insuredPartyLocators;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonLocators extends PageObject {

    //title of section
    @FindBy(css="form .text-primary")
    public WebElement titleSelector;

    //title Mr - Ms
    @FindBy(css = "form select")
    public WebElement titleSelectDataSelector;
    @FindBy(css = ".data-policyholder select option[name='ms.']")
    public WebElement msSelectSelector;
    @FindBy(css = ".data-policyholder select option[name='mr.']")
    public WebElement mrSelectSelector;

    //Birthdate
    @FindBy(css = ".data-policyholder input[name ='dateOfBirth']")
    public WebElement birthdateSelector;
    @FindBy(css = ".data-policyholder input[name ='dateOfBirth']+.error")
    public WebElement birthdateErrorSelector;

    //Name
    @FindBy(css = ".data-policyholder input[name ='dateOfBirth']")
    public WebElement nameSelector;
    @FindBy(css = ".data-policyholder input[name ='dateOfBirth']+.error")
    public WebElement nameErrorSelector;

    //FirstName
    @FindBy(css = ".data-policyholder input[name ='firstName']")
    public WebElement firstNameSelector;
    @FindBy(css = ".data-policyholder input[name ='firstName']+.error")
    public WebElement firstNameErrorSelector;

    //Street
    @FindBy(css = ".data-policyholder input[name ='street']")
    public WebElement streetSelector;
    @FindBy(css = ".data-policyholder input[name ='street']+.error")
    public WebElement streetErrorSelector;

    //House Number
    @FindBy(css = ".data-policyholder input[name ='houseNumber']")
    public WebElement numberSelector;
    @FindBy(css = ".data-policyholder input[name ='houseNumber']+.error")
    public WebElement numberErrorSelector;

    //Postal code
    @FindBy(css = ".data-policyholder input[name ='postalCode']")
    public WebElement postalCodeSelector;
    @FindBy(css = ".data-policyholder input[name ='postalCode']+.error")
    public WebElement postalCodeErrorSelector;

    //City
    @FindBy(css = ".data-policyholder input[name ='city']")
    public WebElement citySelector;
    @FindBy(css = ".data-policyholder input[name ='city']+.error")
    public WebElement cityErrorSelector;

    //Box
    @FindBy(css = "input[name ='box']")
    public WebElement boxSelector;

    //Citizen Number
    @FindBy(css = ".data-policyholder input[name ='citizenNumber']")
    public WebElement citizenNumberSelector;
    @FindBy(css = ".data-policyholder input[name ='citizenNumber']+.error")
    public WebElement citizenNumberErrorSelector;

}
