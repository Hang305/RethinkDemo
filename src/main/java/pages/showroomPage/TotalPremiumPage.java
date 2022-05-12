package pages.showroomPage;

import locators.showroomLocators.TotalPremiumLocators;

public class TotalPremiumPage extends TotalPremiumLocators {

    //Click Back to Homepage button
    public void clickBackToHomePageButton(){
        backButton.click();
    }

    //Click to reset the questionnaire
    public void resetQuestionnaire(){
        resetButton.click();
    }

    //Click Mail me button
    public void clickMailMeButton(){
        mailMeButton.click();
    }

    //Click Make an insurance button
    public void clickMakeAnInsuranceButton(){
        makeInsuranceButton.click();
    }

    //Get total premium
    public void getTotalPremium(){

    }

    //Get premium per month
    public void getPremiumPerMonth(){

    }
}