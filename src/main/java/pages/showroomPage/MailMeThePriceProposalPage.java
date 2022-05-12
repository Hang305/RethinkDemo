package pages.showroomPage;

import locators.showroomLocators.MailMeThePriceProposalLocators;
import org.openqa.selenium.WebElement;
import support.check.Check;

public class MailMeThePriceProposalPage extends MailMeThePriceProposalLocators {

    Check check = new Check();

    //Click back button to homepage
    public void clickBackHomePage(){
        backHomePageButton.click();
    }

    //Click back to previous page (Total Premium page)
    public void backToPTotalPremiumPage(){
        backTotalPremiumPageButton.click();
    }

    //Click Send button
    public void clickSendButton(){
        sendButton.click();
    }

    //Enter email into textBox
    public void enterEmail(String email){
        inputEmail.sendKeys(email);
    }

    //Verify title of email box
    public void verifyEmailBoxTitle(WebElement webElement, String expectedText, String message){
        check.checkContainText(title,expectedText,message);
    }

}