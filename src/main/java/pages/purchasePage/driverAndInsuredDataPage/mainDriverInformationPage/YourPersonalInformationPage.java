package pages.purchasePage.driverAndInsuredDataPage.mainDriverInformationPage;

import locators.purchaseLocators.driverAndInsuredDataLocators.mainDriverInformationLocators.YourPersonalInformationLocators;
import pages.purchasePage.purchasePageOverview.PurchasePage;
import support.actions.Actions;
import support.check.Check;

public class YourPersonalInformationPage extends PurchasePage {

    YourPersonalInformationLocators personalInformationLocators;
    Actions action;
    Check check;

    public void enterAllInputForYourPersonalInformationSection(String birthdate, String name, String firstName, String street, String number, String postalCode, String city,
                                                               String emailAddress, String box, String profession,
                                                               String citizenNumber, String drivingLicenseSince, String nationality, String drivingLicenceNumber,
                                                               String numberOfClaim) {
        action.enterData(personalInformationLocators.birthdateSelector, birthdate);
        action.enterData(personalInformationLocators.nameSelector, name);
        action.enterData(personalInformationLocators.firstNameSelector, firstName);
        action.enterData(personalInformationLocators.streetSelector, street);
        action.enterData(personalInformationLocators.numberSelector, number);
        action.enterData(personalInformationLocators.postalCodeSelector, postalCode);
        action.enterData(personalInformationLocators.citySelector, city);
        action.enterData(personalInformationLocators.emailSelector, emailAddress);
        action.enterData(personalInformationLocators.boxSelector, box);
        action.enterData(personalInformationLocators.professionSelector, profession);
        action.enterData(personalInformationLocators.citizenNumberSelector, citizenNumber);
        action.enterData(personalInformationLocators.drivingLicenceSinceSelector, drivingLicenseSince);
        action.enterData(personalInformationLocators.nationalitySelector, nationality);
        action.enterData(personalInformationLocators.drivingLicenceNumbberSelector, drivingLicenceNumber);
        action.enterData(personalInformationLocators.numberOfClaímInErrorInThePartYearSelector, numberOfClaim);
    }

    // Enter all input mandatory
    public void enterAllInputMandatoryForYourPersonalInformationSection( String name, String firstName, String street, String number, String postalCode, String city,
                                                               String emailAddress, String profession,
                                                               String citizenNumber, String nationality, String drivingLicenceNumber,
                                                               String numberOfClaim) {
        action.enterData(personalInformationLocators.nameSelector, name);
        action.enterData(personalInformationLocators.firstNameSelector, firstName);
        action.enterData(personalInformationLocators.streetSelector, street);
        action.enterData(personalInformationLocators.numberSelector, number);
        action.enterData(personalInformationLocators.postalCodeSelector, postalCode);
        action.enterData(personalInformationLocators.citySelector, city);
        action.enterData(personalInformationLocators.emailSelector, emailAddress);
        action.enterData(personalInformationLocators.professionSelector, profession);
        action.enterData(personalInformationLocators.citizenNumberSelector, citizenNumber);
        action.enterData(personalInformationLocators.nationalitySelector, nationality);
        action.enterData(personalInformationLocators.drivingLicenceNumbberSelector, drivingLicenceNumber);
        action.enterData(personalInformationLocators.numberOfClaímInErrorInThePartYearSelector, numberOfClaim);
    }

    // Required - The warning message is displayed when blank data for all the input
    public void warningDisplayed(String message)  {
        nameErrorElement(message);
        firstNameErrorElement(message);
        streetErrorElement(message);
        numberErrorElement(message);
        postalCodeErrorElement(message);
        cityErrorElement(message);
        emailErrorElement(message);
        professionErrorElement(message);
        citizenNumberErrorElement(message);
        nationalityErrorElement(message);
        drivingLicenceNumbberErrorElement(message);
    }

    //Title
    public void checkTitle(String expectedText) {
        check.checkContainText(personalInformationLocators.titleSelector, expectedText, "The title is displayed wrong");
    }

    //Mr - Ms
    public void titleDropdownElement(String content) {
        action.selectGetText(personalInformationLocators.titleDropdownSelector,content);
    }
    public void msTitleDropdownElement() {
        action.clickElement(personalInformationLocators.msSelectSelector);
    }

    public void mrTitleDropdownElement() {
        action.clickElement(personalInformationLocators.mrSelectSelector);
    }

    //Birthdate
    public void birthdateElement(String content) {
        action.enterData(personalInformationLocators.birthdateSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void birthdateErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.birthdateErrorSelector, expectedText, "The warning is displayed wrong");
    }
    //Name
    public void nameElement(String content) {
        action.enterData(personalInformationLocators.nameSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void nameErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.nameErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //First name
    public void firstNameElement(String content) {
        action.enterData(personalInformationLocators.firstNameSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void firstNameErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.firstNameErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Street
    public void streetElement(String content) {
        action.enterData(personalInformationLocators.streetSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void streetErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.streetErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //House number
    public void numberElement(String content) {
        action.enterData(personalInformationLocators.numberSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void numberErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.numberErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Postal code
    public void postalCodeElement(String content) {
        action.enterData(personalInformationLocators.postalCodeSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void postalCodeErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.postalCodeErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //City
    public void cityElement(String content) {
        action.enterData(personalInformationLocators.citySelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void cityErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.cityErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Email address
    public void emailElement(String content) {
        action.enterData(personalInformationLocators.emailSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void emailErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.emailErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Box
    public void boxElement(String content) {
        action.enterData(personalInformationLocators.boxSelector,content);
    }

    //Profession
    public void professionElement(String content) {
        action.enterData(personalInformationLocators.professionSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void professionErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.professionErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Citizen number
    public void citizenNumberElement(String content) {
        action.enterData(personalInformationLocators.citizenNumberSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void citizenNumberErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.citizenNumberErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Driving licence since
    public void drivingLicenceSinceClick() {
       action.clickElement(personalInformationLocators.drivingLicenceSinceSelector);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }
    public void drivingLicenceSinceElement(String content) {
        action.enterData(personalInformationLocators.drivingLicenceSinceSelector,content);
    }

    public void drivingLicenceSinceErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.drivingLicenceSinceErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Nationality
    public void nationalityElement(String content) {
        action.enterData(personalInformationLocators.nationalitySelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void nationalityErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.nationalityErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Driving licence number
    public void drivingLicenceNumbberElement(String content) {
        action.enterData(personalInformationLocators.nationalitySelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void drivingLicenceNumbberErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.drivingLicenceNumbberErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Number of claim in error in the part year
    public void clearDataForNumberOfClaim(){
        action.clearInputField(personalInformationLocators.numberOfClaímInErrorInThePartYearSelector);
    }
    public void numberOfClaímInErrorInThePartYearElement(String content) {
        action.enterData(personalInformationLocators.numberOfClaímInErrorInThePartYearSelector,content);
        action.clickOnTab(personalInformationLocators.nameSelector);
    }

    public void numberOfClaímInErrorInThePartYearErrorElement(String expectedText) {
        check.checkContainText(personalInformationLocators.numberOfClaímInErrorInThePartYearErrorSelector, expectedText, "The warning is displayed wrong");
    }
}
