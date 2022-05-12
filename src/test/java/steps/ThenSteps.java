package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import org.apache.tools.ant.taskdefs.Sleep;
import pages.showroomPage.Question1To4Pages;
import pages.showroomPage.Question5To7Pages;
import pages.showroomPage.Question8To12Page;
import pages.purchasePage.driverAndInsuredDataPage.insuredPartyPage.CompanyPage;
import pages.purchasePage.driverAndInsuredDataPage.insuredPartyPage.DataPolicyholderPage;
import pages.purchasePage.driverAndInsuredDataPage.insuredPartyPage.PersonPage;
import pages.purchasePage.driverAndInsuredDataPage.mainDriverInformationPage.YourPersonalInformationPage;
import pages.purchasePage.motorcycleData.DataOfYourMotorcyclePage;
import pages.purchasePage.policyData.YourPreferencesForYourPolicyAndCoveragePage;
import pages.purchasePage.purchasePageOverview.PurchasePage;
import support.check.Check;

public class ThenSteps extends PageObject {

    Question1To4Pages question1To4Pages;
    Question5To7Pages question5To7Pages;
    Question8To12Page question8To12Page;
    PurchasePage purchasePage;
    YourPersonalInformationPage yourPersonalInformationPage;
    DataPolicyholderPage dataPolicyholderPage;
    CompanyPage companyPage;
    PersonPage personPage;
    DataOfYourMotorcyclePage dataOfYourMotorcyclePage;
    YourPreferencesForYourPolicyAndCoveragePage yourPreferencesForYourPolicyAndCoveragePage;
    Check check;

    //SHOWROOM-------------------------------------------------------
    //The insurance premium appears correctly
    @Then("^The insurance premium appears correctly$")
    public void theInsurancePremiumAppearsCorrectly() {
    }

    @Then("^The \"([^\"]*)\" is shown correctly$")
    public void theQuestion1IsShownCorrectly(String question1Content){
        question1To4Pages.q1_verifyContent(question1Content,
                "In showroom section, the content of question 1 is wrong!!!");
    }

    @Then("^The \"([^\"]*)\" of question 1 is shown$")
    public void theIsShown(String warning){
        question1To4Pages.q1_verifyErrorMessage(warning,
                "In showroom section, the warning message of question 1 is wrong!!!");
    }

    @Then("^The \"([^\"]*)\" of question 2 is shown correctly$")
    public void theOfQuestion2IsShownCorrectly(String content){
        question1To4Pages.q2_verifyContent(content,
                "In showroom section, the content of question 2 is wrong!!!");
    }

    @Then("^The \"([^\"]*)\" of question 2 is shown$")
    public void theOfQuestionIsShown(String warning){
        question1To4Pages.q2_verifyErrorMessage(warning,
                "In showroom section, the warning message of question 2 is wrong!!!");
    }

    @Then("^The \"([^\"]*)\" of question 3 is shown correctly$")
    public void theOfQuestionIsShownCorrectly(String content){
        question1To4Pages.q3_verifyContent(content,
                "In showroom section, the content of question 3 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 3 is shown$")
    public void theOfQuestion3IsShown(String warning){
        question1To4Pages.q3_verifyErrorMessage(warning,
                "In showroom section, the warning message of question 3 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 4 is shown correctly$")
    public void theOfQuestion4IsShownCorrectly(String content){
        question1To4Pages.q4_verifyContent(content,
                "In showroom section, the content of question 4 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 4 is shown$")
    public void theOfQuestion4IsShown(String warning){
        question1To4Pages.q4_verifyErrorMessage(warning,
                "In showroom section, the warning message of question 4 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 5 is shown correctly$")
    public void theOfQuestion5IsShownCorrectly(String content){
        question5To7Pages.q5_verifyContent(content,
                "In showroom section, the content of question 5 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 6 is shown correctly$")
    public void theOfQuestion6IsShownCorrectly(String content){
        question5To7Pages.q6_verifyContent(content,
                "In showroom section, the content of question 6 is wrong!!!" );
    }

    @Then("^The Next button is inactive$")
    public void theNextButtonIsInactive() {
        question5To7Pages.clickNextButton();
        check.checkElementNotEnabled(question5To7Pages.nextButton,
                "The Next button of question 6 is enabled!!!");
    }

    @Then("^The \"([^\"]*)\" of question 7 is shown correctly$")
    public void theOfQuestion7IsShownCorrectly(String content) {
        question5To7Pages.q7_verifyContent(content,
                "In showroom section, the content of question 7 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 7 is shown$")
    public void theOfQuestion7IsShown(String warning){
        question5To7Pages.q7_verifyErrorMessage(warning,
                "In showroom section, the warning message of question 7 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 8 is shown correctly$")
    public void theOfQuestion8IsShownCorrectly(String content){
        question8To12Page.q8_verifyContent(content,
                "In showroom section, the content of question 8 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 9 is shown correctly$")
    public void theOfQuestion9IsShownCorrectly(String content){
        question8To12Page.q9_verifyContent(content,
                "In showroom section, the content of question 9 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 10 is shown correctly$")
    public void theOfQuestion10IsShownCorrectly(String content){
        question8To12Page.q10_verifyContent(content,
                "In showroom section, the content of question 10 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 11 is shown correctly$")
    public void theOfQuestion11IsShownCorrectly(String content){
        question8To12Page.q11_verifyContent(content,
                "In showroom section, the content of question 11 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 12 is shown correctly$")
    public void theOfQuestion12IsShownCorrectly(String content) {
        question8To12Page.q12_verifyContent(content,
                "In showroom section, the content of question 12 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" of question 6 is shown$")
    public void theOfQuestion6IsShown(String warning){
        question5To7Pages.q6_verifyErrorMessage(warning,
                "In showroom section, the warning message of question 6 is wrong!!!" );
    }

    @Then("^The \"([^\"]*)\" is dislayed corectly$")
    public void theResultIsDislayedCorectly(String result)  {
       question8To12Page.checkTotalPremium(result, "The total premium is displayed wrong");
    }

    @Then("^The Purchase page is displayed with \"([^\"]*)\"$")
    public void thePurchasePageIsDisplayedWith(String titleExpected)  {
        purchasePage.checkYourPersonalInformationText(titleExpected);
    }


//PURCHASE--------------------------------------------------------
    //Check the current url
    @Then("^The url address is displayed correctly with \"([^\"]*)\"$")
    public void theUrlAddressIsDisplayedCorrectlyWith(String url) throws Throwable {
        purchasePage.checkTheCurrentUrl(url);
    }

    //Header - Navbar
    // -- Check the content link on the navbar for your personal information section
    @Then("^The navbar of your personal information link is displayed correctly with \"([^\"]*)\"$")
    public void theNavbarOfYourPersonalInformationLinkIsDisplayedCorrectlyWith(String content){
        purchasePage.checkYourPersonalInformationText(content);
    }

    // -- Check the content link on the navbar for Data of your motorcycle
    @Then("^The navbar of data of your motorcycle link is displayed correctly with \"([^\"]*)\"$")
    public void theNavbarOfDataOfYourMotorcycleLinkIsDisplayedCorrectlyWith(String content)  {
        purchasePage.checkDataOfYourMotorcycleText(content);
    }

    // -- Check the content link on the navbar for policy preferences
    @Then("^The navbar of Policy preferences link is displayed correctly with \"([^\"]*)\"$")
    public void theNavbarOfPolicyPreferencesLinkIsDisplayedCorrectlyWith(String content) {
        // Write code here that turns the phrase above into concrete actions
        purchasePage.checkPolicyPreferencesText(content);
    }

    //Your Personal Information section
    // -- Check title for Your personal information section
    @Then("^The title is displayed correctly with \"([^\"]*)\"$")
    public void theTitleIsDisplayedCorrectlyWith(String titleExpected) {
        yourPersonalInformationPage.checkTitle(titleExpected);
    }

    // Required - The warning message is displayed for all the fields of Your personal information section
    @Then("^The warning is displayed correctly \"([^\"]*)\"$")
    public void theWarningIsDisplayedCorrectly(String message) {
        yourPersonalInformationPage.warningDisplayed(message);
    }

    // Ms - Title dropdown - The dropdown of Title is selected Ms.
    @Then("^The dropdown of Title is selected with Ms\\. option has \"([^\"]*)\"$")
    public void theDropdownOfTitleIsSelectedWithMsOptionHas(String content) throws InterruptedException {
        yourPersonalInformationPage.titleDropdownElement(content);
    }

    // Mr - Title dropdown - The dropdown of Title is selected Mr.
    @Then("^The dropdown of Title is selected with Mr\\. option has \"([^\"]*)\"$")
    public void theDropdownOfTitleIsSelectedWithMrOptionHas(String content) {
        yourPersonalInformationPage.titleDropdownElement(content);
    }

    // Name - The warning appears
    @Then("^The warning is displayed correctly with \"([^\"]*)\" for Name field$")
    public void theWarningIsDisplayedCorrectlyWithForNameField(String message) throws InterruptedException {
       yourPersonalInformationPage.nameErrorElement(message);
    }

    // First name - The warning appears
    @Then("^The warning is displayed correctly with \"([^\"]*)\" for First Name field$")
    public void theWarningIsDisplayedCorrectlyWithForFirstNameField(String message){
        yourPersonalInformationPage.firstNameErrorElement(message);
    }
    // Birthdate - Invalid data - Less than or equal
    @Then("^The warning is displayed correctly with \"([^\"]*)\" for the Birthdate field$")
    public void theWarningIsDisplayedCorrectlyWithForTheBirthdateField(String message) throws Throwable {
        yourPersonalInformationPage.birthdateErrorElement(message);
    }


}
