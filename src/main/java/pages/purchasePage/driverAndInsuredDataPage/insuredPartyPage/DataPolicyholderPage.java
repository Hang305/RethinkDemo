package pages.purchasePage.driverAndInsuredDataPage.insuredPartyPage;

import locators.purchaseLocators.driverAndInsuredDataLocators.insuredPartyLocators.DataPolicyholderLocators;
import net.serenitybdd.core.pages.PageObject;
import support.actions.Actions;
import support.check.Check;

public class DataPolicyholderPage extends PageObject {

    DataPolicyholderLocators dataPolicyholderLocators;
    Actions action;
    Check check;

    //Check on The Same as main driver
//    public void checkSameAsMainDriver() {
//        check.checkElementSelected(dataPolicyholderLocators.sameAsMainDriverCheckboxSelector, "The Same as main driver is NOT selected");
//    }

    //Select Persona checkbox
//    public void selectPersonaDropdown() {
//        action.clickElement(dataPolicyholderLocators.personaCheckboxSelector);
//    }

    //Select Company checkbox
//    public void selectCompanyDropdown() {
//        action.clickElement(dataPolicyholderLocators.companyCheckboxSelector);
//    }

}
