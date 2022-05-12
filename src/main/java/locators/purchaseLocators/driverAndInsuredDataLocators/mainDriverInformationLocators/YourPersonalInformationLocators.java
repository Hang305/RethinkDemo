package locators.purchaseLocators.driverAndInsuredDataLocators.mainDriverInformationLocators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourPersonalInformationLocators extends PageObject {

    //title
    @FindBy(css = "form .text-primary")
    public WebElement titleSelector;

    //Mr - Ms
    @FindBy(css = "form select")
    public WebElement titleDropdownSelector;
    @FindBy(css = "form select option[name='ms.']")
    public WebElement msSelectSelector;
    @FindBy(css = "form select option[name='mr.']")
    public WebElement mrSelectSelector;

    //Birthdate
    @FindBy(css = "input[name ='dateOfBirth']")
    public WebElement birthdateSelector;
    @FindBy(css = "input[name ='dateOfBirth']+.error")
    public WebElement birthdateErrorSelector;

    //Name
    @FindBy(css = "input[name ='name']")
    public WebElement nameSelector;
    @FindBy(css = "input[name ='name']+.error")
    public WebElement nameErrorSelector;

    //FirstName
    @FindBy(css = "input[name ='firstName']")
    public WebElement firstNameSelector;
    @FindBy(css = "input[name ='firstName']+.error")
    public WebElement firstNameErrorSelector;

    //Street
    @FindBy(css = "input[name ='street']")
    public WebElement streetSelector;
    @FindBy(css = "input[name ='street']+.error")
    public WebElement streetErrorSelector;

    //House Number
    @FindBy(css = "input[name ='houseNumber']")
    public WebElement numberSelector;
    @FindBy(css = "input[name ='houseNumber']+.error")
    public WebElement numberErrorSelector;

    //Postal code
    @FindBy(css = "input[name ='postalCode']")
    public WebElement postalCodeSelector;
    @FindBy(css = "input[name ='postalCode']+.error")
    public WebElement postalCodeErrorSelector;

    //City
    @FindBy(css = "input[name ='city']")
    public WebElement citySelector;
    @FindBy(css = "input[name ='city']+.error")
    public WebElement cityErrorSelector;

    //Email address
    @FindBy(css = "input[name ='email']")
    public WebElement emailSelector;
    @FindBy(css = "input[name ='email']+.error")
    public WebElement emailErrorSelector;

    //Box
    @FindBy(css = "input[name ='box']")
    public WebElement boxSelector;

    //Profession
    @FindBy(css = "input[name ='profession']")
    public WebElement professionSelector;
    @FindBy(css = "input[name ='profession']+.error")
    public WebElement professionErrorSelector;

    //Citizen Number
    @FindBy(css = "input[name ='citizenNumber']")
    public WebElement citizenNumberSelector;
    @FindBy(css = "input[name ='citizenNumber']+.error")
    public WebElement citizenNumberErrorSelector;

    //Driving Licence Since
    @FindBy(css = "input[name ='drivingLicenceSince']")
    public WebElement drivingLicenceSinceSelector;
    @FindBy(css = "input[name ='drivingLicenceSince']+.error")
    public WebElement drivingLicenceSinceErrorSelector;

    //Nationality
    @FindBy(css = "input[name ='nationality']")
    public WebElement nationalitySelector;
    @FindBy(css = "input[name ='nationality']+.error")
    public WebElement nationalityErrorSelector;

    //Driving licence number
    @FindBy(css = "input[name ='drivingLicenceNumber']")
    public WebElement drivingLicenceNumbberSelector;
    @FindBy(css = "input[name ='drivingLicenceNumber']+.error")
    public WebElement drivingLicenceNumbberErrorSelector;

    //Number of claim in error in the part year
    @FindBy(css = "input[name ='numberOfAccident']")
    public WebElement numberOfClaímInErrorInThePartYearSelector;
    @FindBy(css = "input[name ='numberOfAccident']+.error")
    public WebElement numberOfClaímInErrorInThePartYearErrorSelector;

}
