package locators.showroomLocators;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class MailMeThePriceProposalLocators {

    @FindBy (xpath = "//a[contains(text(),'Back')]")
    public WebElement backHomePageButton;

    @FindBy (xpath = "//button[contains(text(),'Back')]")
    public WebElement backTotalPremiumPageButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/p[1]")
    public WebElement title;

    @FindBy (xpath = "//button[contains(text(),'Send')]")
    public WebElement sendButton;

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/form[1]/input[1]")
    public WebElement inputEmail;


}
