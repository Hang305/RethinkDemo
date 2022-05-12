package pages.purchasePage.driverAndInsuredDataPage.insuredPartyPage;

import locators.purchaseLocators.driverAndInsuredDataLocators.insuredPartyLocators.PersonLocators;
import net.serenitybdd.core.pages.PageObject;
import support.actions.Actions;
import support.check.Check;

public class CompanyPage extends PageObject {
    PersonLocators personaLocators;
    Actions action;
    Check check;

    public void enterAllInputForCompanySection(String title, String name, String firstName, String street, String number, String postalCode, String city, String box, String citizenNumber) {
        action.enterData(personaLocators.titleSelector, title);
        action.enterData(personaLocators.nameSelector, name);
        action.enterData(personaLocators.firstNameSelector, firstName);
        action.enterData(personaLocators.streetSelector, street);
        action.enterData(personaLocators.numberSelector, number);
        action.enterData(personaLocators.postalCodeSelector, postalCode);
        action.enterData(personaLocators.citySelector, city);
        action.enterData(personaLocators.boxSelector, box);
        action.enterData(personaLocators.citizenNumberSelector, citizenNumber);
    }

    //Check title
    public void titleEqual(String expectedText) {
        check.checkContainText(personaLocators.titleSelector, expectedText, "The title is displayed wrong");
    }

    //Mr - Ms
    public void selectDropdownElement(String expectedText) {
        check.checkContainText(personaLocators.titleSelectDataSelector,expectedText, "The title is displayed wrong");
    }
    public void msElement() {
        check.checkContainText(personaLocators.msSelectSelector,"Ms.","The Ms. dropdown does NOT selected" );
    }
    public void mrElement() {
        check.checkContainText(personaLocators.mrSelectSelector,"Mr.","The Mr. dropdown does NOT selected" );
    }

    //Birthdate
    public void birthdateClick(String birthdateExpected) {
        check.checkContainText(personaLocators.birthdateSelector, birthdateExpected,"The Birthdate is displayed wrong");
    }

    //Name
    public void nameElement(String content) {
        action.enterData(personaLocators.nameSelector,content);
    }
    public void nameErrorElement(String expectedText) {
        check.checkContainText(personaLocators.nameErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //First name
    public void firstNameElement(String content) {
        action.enterData(personaLocators.firstNameSelector,content);
    }
    public void firstNameErrorElement(String expectedText) {
        check.checkContainText(personaLocators.firstNameErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Street
    public void streetElement(String content) {
        action.enterData(personaLocators.streetSelector,content);
    }
    public void streetErrorElement(String expectedText) {
        check.checkContainText(personaLocators.streetErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //House number
    public void numberElement(String content) {
        action.enterData(personaLocators.numberSelector,content);
    }
    public void numberErrorElement(String expectedText) {
        check.checkContainText(personaLocators.numberErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Postal code
    public void postalCodeElement(String content) {
        action.enterData(personaLocators.postalCodeSelector,content);
    }
    public void postalCodeErrorElement(String expectedText) {
        check.checkContainText(personaLocators.postalCodeErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //City
    public void cityElement(String content) {
        action.enterData(personaLocators.citySelector,content);
    }
    public void cityErrorElement(String expectedText) {
        check.checkContainText(personaLocators.cityErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Box
    public void boxElement(String content) {
        action.enterData(personaLocators.boxSelector,content);
    }

    //Citizen number
    public void citizenNumberElement(String content) {
        action.enterData(personaLocators.citizenNumberSelector,content);
    }
    public void citizenNumberErrorElement(String expectedText) {
        check.checkContainText(personaLocators.citizenNumberErrorSelector, expectedText, "The warning is displayed wrong");
    }

}
