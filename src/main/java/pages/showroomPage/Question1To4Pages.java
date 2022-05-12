package pages.showroomPage;

import com.ibm.icu.impl.UResource;
import locators.showroomLocators.QuestionLocators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import support.check.Check;

public class Question1To4Pages extends QuestionLocators {
    Check check = new Check();

//Common method
    //Click next button
    public void clickNextButton(){
        nextButton.click();
    }

    //Click back button to homepage
    public void clickBackHomePage(){
        backHomePageButton.click();
    }

    //Click back to previous question
    public void backToPreviousQuestionButton(){
        backToPreviousQuestionButton.click();
    }

    //Go to next question
    public void nextQuestion(WebElement element){
        element.click();
        nextButton.click();
    }

//Question 1
    //Verify content of q1 show correctly,if wrong-> show <message>
    public void q1_verifyContent(String expected,String message){
        check.checkContainText(q1Content,expected,message);
    }

    //Enter date into date textBox
    public void q1_enterDateField(String date){
        q1InputDate.sendKeys(date, Keys.RETURN);
    }

    /*  Verify error message content show correctly when entering invalid email
        If not match, show <message>    */
    public void q1_verifyErrorMessage(String expected,String message){
        check.checkContainText(q1ErrorMess,expected,
                "In showroom section, the warning message of question 1 is wrong!!!");
    }

//Question 2
    //Verify content of q2 show correctly,if wrong-> show <message>
    public void q2_verifyContent(String expected,String message){
        check.checkContainText(q2Content,expected,message);
    }

    //Verify that next button is active when choosing "Yes", if not show <message>
    public void q2_Yes_nextButtonActive(String message){
        yesButton.click();
        check.checkElementEnabled(nextButton,message);
    }

    //Verify that error message is shown correctly when choosing "No"
    public void q2_verifyErrorMessage(String expected,String message){
        check.checkContainText(q2ErrorMess,expected,message);
    }

    //Verify that next button is inactive when choosing "No", if not show <message>
//    public void q2_No_nextButtonInactive(String message){
//        noButton.click();
//        check.checkElementEnabled(nextButton,message);
//    }

    //Click yes button
    public void clickYesButton(){
        yesButton.click();
    }

    //Click no button
    public void clickNoButton(){
        noButton.click();
    }

//Question 3
    //Verify content of q2 show correctly,if wrong-> show <message>
    public void q3_verifyContent(String expected,String message){
        check.checkContainText(q3Content,expected,message);
    }

    //Verify that next button is active when choosing "Yes", if not show <message>
    public void q3_Yes_nextButtonActive(String message){
        yesButton.click();
        check.checkElementEnabled(nextButton,message);
    }

    //Verify that error message is shown correctly when choosing "No"
    public void q3_verifyErrorMessage(String expected,String message){
        check.checkContainText(q3ErrorMess,expected,message);
    }

    //Verify that next button is inactive when choosing "No", if not show <message>
//    public void q3_No_nextButtonInactive(String message){
//        noButton.click();
//        check.checkElementEnabled(nextButton,message);
//    }

    //Click yes button
    public void q3_clickYesButton(){
        q3_yesButton.click();
    }

    //Click no button
    public void q3_clickNoButton(){
        q3_noButton.click();
    }

//Question 4
    //Verify content of q2 show correctly,if wrong-> show <message>
    public void q4_verifyContent(String expected,String message){
        check.checkContainText(q4Content,expected,message);
    }

    //Verify that next button is active when choosing "Yes", if not show <message>
    public void q4_Yes_nextButtonActive(String message){
        yesButton.click();
        check.checkElementEnabled(nextButton,message);
    }

    //Verify that error message is shown correctly when choosing "No"
    public void q4_verifyErrorMessage(String expected,String message){
        check.checkContainText(q4ErrorMess,expected,message);
    }

    //Verify that next button is inactive when choosing "No", if not show <message>
//    public void q4_No_nextButtonInactive(String message){
//        noButton.click();
//        check.checkElementEnabled(nextButton,message);
//    }

    //Click yes button
    public void q4_clickYesButton(){
        q4_yesButton.click();
    }

    //Click no button
    public void q4_clickNoButton(){
        q4_noButton.click();
    }

}
