package steps;

import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import pages.homepagePage.HomepagePage;
import pages.purchasePage.driverAndInsuredDataPage.mainDriverInformationPage.YourPersonalInformationPage;
import pages.purchasePage.purchasePageOverview.PurchasePage;
import pages.showroomPage.Question1To4Pages;
import pages.showroomPage.Question5To7Pages;
import pages.showroomPage.Question8To12Page;

public class WhenSteps extends PageObject {

    HomepagePage homepagePage;
    Question1To4Pages question1To4Pages;
    Question5To7Pages question5To7Pages;
    Question8To12Page question8To12Page;
    PurchasePage purchasePage;
    YourPersonalInformationPage yourPersonalInformationPage;

    // SHOWROOM -------------------------------
    //Click "Calculate your premium here" button
    @When("^Click \"([^\"]*)\" button$")
    public void clickButton(String arg0) {
        homepagePage.clickCalculateButton();
    }

    @When("^Click calculate button in Homepage$")
    public void clickCalculateButtonInHomepage(){
        homepagePage.clickCalculateButton();
    }

    @When("^Enter \"([^\"]*)\" into birthday field$")
    public void enterIntoBirthdayField(String date){
        homepagePage.clickCalculateButton();
        question1To4Pages.q1_enterDateField(date);
    }

    @When("^Open question 2$")
    public void openQuestion2() {
        enterIntoBirthdayField("01-01-1990");
        question1To4Pages.clickNextButton();

    }

    @When("^Open question 3$")
    public void openQuestion3(){
        openQuestion2();
        question1To4Pages.nextQuestion(question1To4Pages.yesButton);
    }

    @When("^Open question 4$")
    public void openQuestion4() {
        openQuestion3();
        question1To4Pages.nextQuestion(question1To4Pages.q3_yesButton);
    }

    @When("^Open question 5$")
    public void openQuestion5() {
        openQuestion4();
        question1To4Pages.nextQuestion(question1To4Pages.q4_yesButton);
    }

    @When("^Open question 6$")
    public void openQuestion6() {
        openQuestion5();
        question1To4Pages.nextQuestion(question1To4Pages.q5Answer1);
    }

    @When("^Open question 7$")
    public void openQuestion7() {
        openQuestion6();
        question5To7Pages.goToQuestion7();
    }

    @When("^Open question 8 to 12 \\(one Page\\)$")
    public void openQuestion8To12Page() {
        openQuestion7();
        question5To7Pages.q7_chooseAnswer1("BMW or Harley-Davidson",
                "Something wrong when choosing answer A of question 7!!!");
        question5To7Pages.clickNextButton();
    }



//PURCHASE ---------------------------------
    // Your personal information section
    // -- Navigate to your personal information section
    @When("^Navigate to Your personal information section$")
    public void navigateToYourPersonalInformationSection() {
        purchasePage.navigateToYourPersonalInformationSection();
    }

    // -- Enter input valid data for Your personal information
    @When("^Enter valid data for all fields with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterValidDataForAllFieldsWithAnd(String birthdate, String name, String firstName, String street, String number, String postalCode, String city, String email, String box, String profession, String citizenNumber, String drivingLicenseSince, String nationality, String drivingLicenceNumber, String numberOfClaim)  {
        yourPersonalInformationPage.clearDataForNumberOfClaim();
        yourPersonalInformationPage.enterAllInputForYourPersonalInformationSection(birthdate, name, firstName, street, number,
                postalCode, city, email,box, profession, citizenNumber, drivingLicenseSince, nationality, drivingLicenceNumber,
                numberOfClaim);
    }

    // -- Your personal information section - Blank data for all the input
    @When("^Blank data for all the input the mandatory$")
    public void blankDataForAllTheInputTheMandatory() {
        yourPersonalInformationPage.enterAllInputMandatoryForYourPersonalInformationSection("", "", "", "", "", "", "", "", "", "", "", "");
    }

    // Birthdate - Enter valid data
    @When("^Enter valid data for Birthdate field with \"([^\"]*)\"$")
    public void enterValidDataForBirthdateFieldWith(String birthdate) {
        yourPersonalInformationPage.birthdateElement(birthdate);
    }

    // Birthdate - Enter less than or equal to 26 years old
    @When("^Enter \"([^\"]*)\" with less than or equal to twenty six years old$")
    public void enterWithLessThanOrEqualToTwentySixYearsOld(String date) {
        yourPersonalInformationPage.birthdateElement(date);
    }


}
