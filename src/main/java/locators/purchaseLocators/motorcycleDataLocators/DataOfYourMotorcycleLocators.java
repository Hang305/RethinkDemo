package locators.purchaseLocators.motorcycleDataLocators;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataOfYourMotorcycleLocators extends PageObject {

    //Title
    @FindBy(css = ".grow .text-primary")
    public WebElement titleSelector;

    //Brand
    @FindBy(css = "input[name ='brand']")
    public WebElement brandSelector;
    @FindBy(css = "input[name ='brand']+.error")
    public WebElement brandErrorSelector;

    //Model
    @FindBy(css = "input[name ='model']")
    public WebElement modelSelector;
    @FindBy(css = "input[name ='model']+.error")
    public WebElement modelErrorSelector;

    //Year of construction
    @FindBy(css = "input[name ='yearOfConstruction']")
    public WebElement yearOfConstructionSelector;
    @FindBy(css = "input[name ='yearOfConstruction']+.error")
    public WebElement yearOfConstructionErrorSelector;

    //Power
    @FindBy(css = "input[name ='power']")
    public WebElement powerSelector;
    @FindBy(css = "input[name ='power']+.error")
    public WebElement powerErrorSelector;

    //Fuel type
    @FindBy(css = "input[name ='fuelType']")
    public WebElement fuelTypeSelector;
    @FindBy(css = "input[name ='fuelType']+.error")
    public WebElement fuelTypeErrorSelector;

    //Licence plate
    @FindBy(css = "input[name ='licencePlate']")
    public WebElement licencePlateSelector;
    @FindBy(css = "input[name ='licencePlate']+.error")
    public WebElement licencePlateErrorSelector;

    //Chassis number
    @FindBy(css = "input[name ='chassisNumber']")
    public WebElement chassisNumberSelector;
    @FindBy(css = "input[name ='chassisNumber']+.error")
    public WebElement chassisNumberErrorSelector;

    //Date of first use
    @FindBy(css = "input[name ='dateOfFirstUse']")
    public WebElement dateOfFirstUseSelector;
    @FindBy(css = "input[name ='dateOfFirstUse']+.error")
    public WebElement dateOfFirstUseErrorSelector;

    //Use checkbox
    @FindBy(css = "input[value ='private']")
    public WebElement usePrivarySelector;
    @FindBy(css = "input[value ='professional']")
    public WebElement useProfessionalSelector;

    //Insured value
    @FindBy(css = "input[name ='insuredValue']")
    public WebElement insuredValueSelector;
    @FindBy(css = "input[name ='insuredValue']+.error")
    public WebElement insuredValueErrorSelector;

    //Depending on the value of your bike
    @FindBy(css = "input[value ='Mechanical']")
    public WebElement mechanicalSelector;
    @FindBy(css = "#motorcyc-data input[type='checkbox']:nth-child(7)")
    public WebElement mechanicalStarterDisablerSelector;
    @FindBy(css = "#motorcyc-data input[type='checkbox']:nth-child(10)")
    public WebElement mechanicalStarterDisablerAlarmSelector;
}