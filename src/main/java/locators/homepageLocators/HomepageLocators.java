package locators.homepageLocators;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageLocators extends PageObject{

    //HEADER--------------------------------------------

    //Logo
    @FindBy(css = "#header .text-base")
    public WebElement logoSel;

    //Navbar
    @FindBy(css = "nav .pl-4:nth-child(3)")
    public WebElement howDoesItWorkSel;
    @FindBy(css = "nav .pl-4:nth-child(4)")
    public WebElement GuaranteesSel;
    @FindBy(css = "nav .pl-4:nth-child(5)")
    public WebElement FAQSel;

    @FindBy(css = "nav .list-reset a:nth-child(1)")
    public WebElement myBrokerSel;

    //Languages
    @FindBy(css = "nav .relative")
    public WebElement LanguagesSel;
    //en
    @FindBy(css = "nav li:nth-child(1)")
    public WebElement enLanguagesSel;
    //nl
    @FindBy(css = "nav .absolute li:nth-child(2)")
    public WebElement nlLanguagesSel;
    //fr
    @FindBy(css = "nav li:nth-child(3)")
    public WebElement frLanguagesSel;

    //Calculate your premium here button
    @FindBy(xpath = "//a[contains(text(),'Calculate your premium here')]")
    public WebElement calculateYourPremiumHereButton;

    //FOOTER--------------------------------------------
    @FindBy(css = "footer .text-gray-400")
    public WebElement contentFooterSel;
    @FindBy(css = "footer .text-white")
    public WebElement emailSel;

    //Hyperlink footer
    @FindBy(css = "footer a:nth-child(1)")
    public WebElement privacyPolicyLinkSel;
    @FindBy(css = "footer a:nth-child(2)")
    public WebElement termAndConditionsLinkSel;
    @FindBy(css = "footer a:nth-child(3)")
    public WebElement aboutUsLinkSel;
    @FindBy(css = "footer a:nth-child(4)")
    public WebElement downloadLinkSel;
    @FindBy(css = "footer a:nth-child(5)")
    public WebElement contactUsLinkSel;
    @FindBy(css = "footer a:nth-child(6)")
    public WebElement partnerDashboardLinkSel;

    //Logo
    @FindBy(css = "footer img:nth-child(1)")
    public WebElement logoFooterLinkSel;

    //Social
    //Facebook
    @FindBy(css = "footer .flex-row:nth-child(3) a:nth-child(1)")
    public WebElement facebookLinkSel;

    //Instagram
    @FindBy(css = "footer .flex-row:nth-child(3) a:nth-child(2) ")
    public WebElement instagramLinkSel;

    //Linkedin
    @FindBy(css = "footer .flex-row:nth-child(3) a:nth-child(3)")
    public WebElement linkedinLinkSel;

    //Button
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
    public WebElement calculateButton;
}
