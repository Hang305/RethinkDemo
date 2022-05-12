package pages.purchasePage.motorcycleData;

import locators.purchaseLocators.motorcycleDataLocators.DataOfYourMotorcycleLocators;
import net.serenitybdd.core.pages.PageObject;
import support.actions.Actions;
import support.check.Check;

public class DataOfYourMotorcyclePage extends PageObject {

    DataOfYourMotorcycleLocators dataOfYourMotorcycleLocators;
    Actions action;
    Check check;

    public void enterAllInputForDataOfYourMotorcycleSection(String brand, String model, String yearOfContruction, String power, String fuelType, String licensePlate,
                                                               String chassisNumber, String dateOfFirstUse, Boolean use,
                                                               String insuredValue) {
        action.enterData(dataOfYourMotorcycleLocators.brandSelector, brand);
        action.enterData(dataOfYourMotorcycleLocators.modelSelector, model);
        action.enterData(dataOfYourMotorcycleLocators.yearOfConstructionSelector, yearOfContruction);
        action.enterData(dataOfYourMotorcycleLocators.powerSelector, power);
        action.enterData(dataOfYourMotorcycleLocators.fuelTypeSelector, fuelType);
        action.enterData(dataOfYourMotorcycleLocators.licencePlateSelector, licensePlate);
        action.enterData(dataOfYourMotorcycleLocators.chassisNumberSelector, chassisNumber);
        action.enterData(dataOfYourMotorcycleLocators.dateOfFirstUseSelector, dateOfFirstUse);
        action.enterData(dataOfYourMotorcycleLocators.usePrivarySelector, String.valueOf(use));
        action.enterData(dataOfYourMotorcycleLocators.insuredValueSelector, insuredValue);
    }

    //Title
    public void titleElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.titleSelector, expectedText, "The title is displayed wrong");
    }

    //Brand
    public void brandElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.brandSelector, content);
    }

    public void brandErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.brandErrorSelector, expectedText, "The warning is displayed wrong");
    }
    //Model
    public void modelElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.modelSelector, content);
    }

    public void modelErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.modelErrorSelector, expectedText, "The warning is displayed wrong");
    }
    //Year of construction
    public void yearOfConstructionElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.yearOfConstructionSelector, content);
    }

    public void yearOfConstructionErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.yearOfConstructionErrorSelector, expectedText, "The warning is displayed wrong");
    }
    //Power
    public void powerElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.powerSelector, content);
    }

    public void powerErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.powerErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Fuel type
    public void fuelTypeElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.fuelTypeSelector, content);
    }

    public void fuelTypeErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.fuelTypeErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //License plate
    public void licensePlateElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.licencePlateSelector, content);
    }

    public void licensePlateErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.licencePlateErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Chassis number
    public void chassisNumberElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.chassisNumberSelector, content);
    }

    public void chassisNumberErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.chassisNumberErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Date of first use
    public void dateOfFirstUseClick() {
        action.clickElement(dataOfYourMotorcycleLocators.dateOfFirstUseSelector);
    }
    public void dateOfFirstUseElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.dateOfFirstUseSelector, content);
    }
    public void dateOfFirstUseErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.dateOfFirstUseErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Use
    //-- private
    public void usePrivateClick() {
        action.clickElement(dataOfYourMotorcycleLocators.usePrivarySelector);
    }
    //-- professional
    public void useProfessionalClick() {
        action.clickElement(dataOfYourMotorcycleLocators.useProfessionalSelector);
    }

    //Insured value
    public void insuredValueElement(String content) {
        action.enterData(dataOfYourMotorcycleLocators.insuredValueSelector, content);
    }
    public void insuredValueErrorElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.insuredValueErrorSelector, expectedText, "The warning is displayed wrong");
    }

    //Motorcycle Value < € 7,000 - Only Mechanical Protection
    public void onlyMechanicalElement(String expectedText) {
        check.checkContainText(dataOfYourMotorcycleLocators.mechanicalSelector, expectedText, "The Only mechanical is displayed wrong");
    }

    //Motorcycle Value < € 7,000 And < € 10,000 - Mechanical Protection + Anti-Start System
    public void mechanicalStarterDisablerElement() {
        action.clickElement(dataOfYourMotorcycleLocators.mechanicalStarterDisablerSelector);
    }
    //Motorcycle Value > €10,000 - Mechanical Protection + Anti-Start System + Siren
    public void mechanicalStarterDisablerAlarmElement(String expectedText) {
        action.clickElement(dataOfYourMotorcycleLocators.mechanicalStarterDisablerAlarmSelector);
    }
}
