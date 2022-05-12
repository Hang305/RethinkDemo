package locators.purchaseLocators.driverAndInsuredDataLocators.insuredPartyLocators;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyLocators extends PageObject {

    //Name
    @FindBy(css = ".data-policyholder input[name ='name']")
    public WebElement companyNameSelector;
    @FindBy(css = ".data-policyholder input[name ='name']+.error")
    public WebElement companyNameErrorSelector;

    //Contact
    @FindBy(css = ".data-policyholder input[name ='contact']")
    public WebElement companyContractSelector;
    @FindBy(css = ".data-policyholder input[name ='contact']+.error")
    public WebElement companyContractErrorSelector;

    //Street
    @FindBy(css = ".data-policyholder input[name ='street']")
    public WebElement companyStreetSelector;
    @FindBy(css = ".data-policyholder input[name ='street']+.error")
    public WebElement companyStreetErrorSelector;

    //Number
    @FindBy(css = ".data-policyholder input[name ='houseNumber']")
    public WebElement companyNumberSelector;
    @FindBy(css = ".data-policyholder input[name ='houseNumber']+.error")
    public WebElement companyNumberErrorSelector;

    //Postal code
    @FindBy(css = ".data-policyholder input[name ='postalCode']")
    public WebElement companyPostalCodeSelector;
    @FindBy(css = ".data-policyholder input[name ='postalCode']+.error")
    public WebElement companyPostalCodeErrorSelector;

    //City
    @FindBy(css = ".data-policyholder input[name ='city']")
    public WebElement companyCitySelector;
    @FindBy(css = ".data-policyholder input[name ='city']+.error")
    public WebElement companyCityErrorSelector;

    //Email address
    @FindBy(css = ".data-policyholder input[name ='email']")
    public WebElement companyEmailSelector;
    @FindBy(css = ".data-policyholder input[name ='email']+.error")
    public WebElement companyEmailErrorSelector;

    //Box
    @FindBy(css = ".data-policyholder input[name ='box']")
    public WebElement companyBoxSelector;

    //VAT number
    @FindBy(css = ".data-policyholder input[name ='vatNumber']")
    public WebElement companyVATNumberSelector;
    @FindBy(css = ".data-policyholder input[name ='vatNumber']+.error")
    public WebElement companyVATNumberErrorSelector;

}
