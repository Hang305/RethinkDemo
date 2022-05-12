package locators.showroomLocators;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class TotalPremiumLocators extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    public WebElement backButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement mailMeButton;

    @FindBy(css = "a[href='/purchase']")
    public WebElement makeInsuranceButton;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/*[1]")
    public WebElement resetButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement totalPremium;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
    public WebElement premiumPerMonth;

}
