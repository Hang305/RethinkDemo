package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import pages.purchasePage.driverAndInsuredDataPage.mainDriverInformationPage.YourPersonalInformationPage;
import pages.showroomPage.Question1To4Pages;
import pages.showroomPage.Question5To7Pages;
import pages.showroomPage.Question8To12Page;
import pages.showroomPage.TotalPremiumPage;
import support.common.Variable;

public class AndSteps extends PageObject implements Variable {

    Question1To4Pages question1To4Pages;
    Question5To7Pages question5To7Pages;
    Question8To12Page question8To12Page;
    TotalPremiumPage totalPremiumPage;
    YourPersonalInformationPage yourPersonalInformationPage;

//SHOWROOM PAGE ----------------------------------------
    @And("^Choose No button$")
    public void chooseNoButton() {
        question1To4Pages.clickNoButton();
    }

    @And("^Choose No button in question 3$")
    public void chooseNoButtonInQuestion() {
        question1To4Pages.q3_clickNoButton();
    }

    @And("^Choose No button in question 4$")
    public void chooseNoButtonInQuestion4() {
        question1To4Pages.q4_clickNoButton();
    }

    @And("^Enter \"([^\"]*)\" into textbox$")
    public void enterIntoTextBox(String letters){
        question5To7Pages.q6_enterToTextBox(letters);
    }

    @And("^Leave textbox blank$")
    public void leaveTextBoxBlank() {
        question5To7Pages.q6_enterToTextBox("");
    }

    @And("^Choose answer \"([^\"]*)\"$")
    public void chooseAnswer(String answerB){
        question5To7Pages.q7_chooseAnswer2(answerB,
                "Had the problem when choosing answer B of question 7!!!");
    }

    @And("^Enter invalid \"([^\"]*)\"$")
    public void enterInvalidNumber (String number){
        question5To7Pages.q6_enterToTextBox(number);
    }

    @And("^Choose answer for question 8 with \"([^\"]*)\"$")
    public void chooseAnswerForQuestion8With(String answer2) {
        switch (answer2){
            case NO_ANSWER:
                question8To12Page.q8_chooseAnswer1(answer2,"The answer 2 is displayed wrong");
                break;
            case UPTO1000:
                question8To12Page.q8_chooseAnswer2(answer2,"The answer 2 is displayed wrong");
                break;
            case UPTO2000:
                question8To12Page.q8_chooseAnswer3(answer2,"The answer 2 is displayed wrong");
                break;
        }
    }

    @And("^Choose answer for question 9 with \"([^\"]*)\"$")
    public void chooseAnswerForQuestion9With(String answer1)  {
        switch (answer1){
            case MONTHS_12:
                question8To12Page.q9_chooseAnswer1(answer1,"The answer 2 is displayed wrong");
                break;
            case MONTHS_24:
                question8To12Page.q9_chooseAnswer2(answer1,"The answer 2 is displayed wrong");
                break;
            case MONTHS_36:
                question8To12Page.q9_chooseAnswer3(answer1,"The answer 2 is displayed wrong");
                break;
        }
    }

    @And("^Choose answer for question 10 with \"([^\"]*)\"$")
    public void chooseAnswerForQuestion10With(String answer1) {
        switch (answer1){
            case YES_ANSWER:
                question8To12Page.q10_chooseAnswerYes(answer1,"The answer 2 is displayed wrong");
                break;
            case NO_ANSWER:
                question8To12Page.q10_chooseAnswerNo(answer1,"The answer 2 is displayed wrong");
                break;
        }
    }

    @And("^Choose answer for question 11 \"([^\"]*)\"$")
    public void chooseAnswerForQuestion11(String answer1) {
        switch (answer1){
            case YES_ANSWER:
                question8To12Page.q11_chooseAnswerYes(answer1,"The answer 2 is displayed wrong");
                break;
            case NO_ANSWER:
                question8To12Page.q11_chooseAnswerNo(answer1,"The answer 2 is displayed wrong");
                break;
        }
    }

    @And("^Choose answer for question 12 \"([^\"]*)\"$")
    public void chooseAnswerForQuestion12(String answer1) {
        switch (answer1){
            case YES_ANSWER:
                question8To12Page.q12_chooseAnswerYes(answer1,"The answer 2 is displayed wrong");
                break;
            case NO_ANSWER:
                question8To12Page.q12_chooseAnswerNo(answer1,"The answer 2 is displayed wrong");
                break;
        }
    }

    @And("^Click on Next button$")
    public void clickOnNextButton() {
        question8To12Page.clickNextButton();
    }

    @And("^Click on the Make an insurance button$")
    public void clickOnTheMakeAnInsuranceButton() {
        totalPremiumPage.clickMakeAnInsuranceButton();
    }

    @And("^Choose answer for question 8 to 12 with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and click on the Make an insurance button$")
    public void chooseAnswerForQuestion8To12WithAndClickOnTheMakeAnInsuranceButton(String answerQ8, String answerQ9, String answerQ10, String answerQ11, String answerQ12)  {
        chooseAnswerForQuestion8With(answerQ8);
        chooseAnswerForQuestion9With(answerQ9);
        chooseAnswerForQuestion10With(answerQ10);
        chooseAnswerForQuestion11(answerQ11);
        chooseAnswerForQuestion12(answerQ12);
        clickOnNextButton();
        clickOnTheMakeAnInsuranceButton();
    }
    // Open purchase page from Showroom page
    @Given("^Open Purchase page from Showroom page$")
    public void openPurchasePageFromShowroomPage() {
        chooseAnswerForQuestion8To12WithAndClickOnTheMakeAnInsuranceButton();
    }


// PURCHASE PAGE ----------------------------------------
    // Your personal information section
    // Name - Enter valid data
    @And("^Enter valid data for Name field with \"([^\"]*)\"$")
    public void enterValidDataForNameFieldWith(String name) {
        yourPersonalInformationPage.nameElement(name);
    }
    // Name - Not enter input data for the Name text box
    @And("^Blank data for Name textbox with \"([^\"]*)\"$")
    public void blankDataForNameTextboxWith(String name) {
        yourPersonalInformationPage.nameElement(name);
    }

    // Name - Enter one character for Name text box
    @And("^Enter one character for Name text box with \"([^\"]*)\"$")
    public void enterOneCharacterForNameTextBoxWith(String name) {
        yourPersonalInformationPage.nameElement(name);
    }

    // First name - Enter valid data
    @And("^Enter valid data for First Name field with \"([^\"]*)\"$")
    public void enterValidDataForFirstNameFieldWith(String firstName)  {
        yourPersonalInformationPage.firstNameElement(firstName);
    }

    // Street - Enter valid data
    @And("^Enter valid data for Street field with \"([^\"]*)\"$")
    public void enterValidDataForStreetFieldWith(String street) throws Throwable {
        yourPersonalInformationPage.streetElement(street);
    }

    // Number - Enter valid data
    @And("^Enter valid data for Number field with \"([^\"]*)\"$")
    public void enterValidDataForNumberFieldWith(String number) {
        yourPersonalInformationPage.numberElement(number);
    }

    // Postal code - Enter valid data
    @And("^Enter valid data for Postal code field with \"([^\"]*)\"$")
    public void enterValidDataForPostalCodeFieldWith(String postalCode) {
        yourPersonalInformationPage.postalCodeElement(postalCode);
    }
    //City - Enter valid data
    @And("^Enter valid data for City field with \"([^\"]*)\"$")
    public void enterValidDataForCityFieldWith(String city) {
        yourPersonalInformationPage.cityElement(city);
    }

    // Email - Enter valid data
    @And("^Enter valid data for Email field with \"([^\"]*)\"$")
    public void enterValidDataForEmailFieldWith(String email)  {
        yourPersonalInformationPage.emailElement(email);
    }

    // Box - Enter valid data
    @And("^Enter valid data for Box field with \"([^\"]*)\"$")
    public void enterValidDataForBoxFieldWith(String box) {
        yourPersonalInformationPage.boxElement(box);
    }

    // Profession - Enter valid data
    @And("^Enter valid data for Profession field with \"([^\"]*)\"$")
    public void enterValidDataForProfessionFieldWith(String profession) {
        yourPersonalInformationPage.professionElement(profession);
    }

    // Citizen number - Enter valid data
    @And("^Enter valid data for Citizen number field with \"([^\"]*)\"$")
    public void enterValidDataForCitizenNumberFieldWith(String citizenNumber){
        yourPersonalInformationPage.citizenNumberElement(citizenNumber);
    }

    // Driving license since - Enter valid data
    @And("^Enter valid data for Driving license since field with \"([^\"]*)\"$")
    public void enterValidDataForDrivingLicenseSinceFieldWith(String drivingLicenceSince)  {
        yourPersonalInformationPage.drivingLicenceSinceElement(drivingLicenceSince);
    }

    // Nationally - Enter valid data
    @And("^Enter valid data for Nationality field with \"([^\"]*)\"$")
    public void enterValidDataForNationalityFieldWith(String nationally) {
        yourPersonalInformationPage.nationalityElement(nationally);
    }

    // Driving licence number - Enter valid data
    @And("^Enter valid data for Driving licence number field with \"([^\"]*)\"$")
    public void enterValidDataForDrivingLicenceNumberFieldWith(String drivingLicenceNumber)  {
        yourPersonalInformationPage.drivingLicenceNumbberElement(drivingLicenceNumber);
    }

    // Number of claim in error in the past year - Enter valid data
    @And("^Enter valid data for Number of claim in error in the past year field with \"([^\"]*)\"$")
    public void enterValidDataForNumberOfClaimInErrorInThePastYearFieldWith(String numberOfClaímInErrorInThePartYear)  {
        yourPersonalInformationPage.numberOfClaímInErrorInThePartYearElement(numberOfClaímInErrorInThePartYear);
    }

    @And("^Enter one character for First Name text box with \"([^\"]*)\"$")
    public void enterOneCharacterForFirstNameTextBoxWith(String firstName) {
        yourPersonalInformationPage.firstNameElement(firstName);
    }



}
