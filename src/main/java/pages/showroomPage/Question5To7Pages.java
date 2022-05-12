package pages.showroomPage;

import locators.showroomLocators.QuestionLocators;
import support.check.Check;

public class Question5To7Pages extends QuestionLocators {

    Check check = new Check();

//Common method.
    //Click next button
    public void clickNextButton() {
        nextButton.click();
    }

    //Click back button to homepage
    public void clickBackHomePage() {
        backHomePageButton.click();
    }

    //Click back to previous question
    public void backToPreviousQuestionButton() {
        backToPreviousQuestionButton.click();
    }

//Question 5
    //Verify content of q5 show correctly,if wrong-> show <message>
    public void q5_verifyContent(String expected,String message){
        check.checkContainText(q5Content,expected,message);
    }

    //Choose answer 1
    public void q5_chooseAnswer1(String expected,String message){
        check.checkEqualValue(q5Answer1,expected,message);
    }

    //Choose answer 2
    public void q5_chooseAnswer2(String expected,String message){
        check.checkEqualValue(q5Answer2,expected,message);
    }

    //Choose answer 3
    public void q5_chooseAnswer3(String expected,String message){
        check.checkEqualValue(q5Answer3,expected,message);
    }

//Question 6
    //Verify content of q6 show correctly,if wrong-> show <message>
    public void q6_verifyContent(String expected,String message){
        check.checkContainText(q6Content,expected,message);
    }

    //Enter to question 6 textBox
    public void q6_enterToTextBox(String price){
        q6InputData.sendKeys(price);
    }

    //Verify content of error message, if wrong -> Show <message>
    public void q6_verifyErrorMessage(String expectedText,String message){
        check.checkContainText(q6ErrorMess,expectedText,message);
    }

    //Go to question 7
    public void goToQuestion7(){
        q6_enterToTextBox("10000");
        clickNextButton();
    }

//Question 7.
    //Verify content of q6 show correctly,if wrong-> show <message>
    public void q7_verifyContent(String expected,String message){
        check.checkContainText(q7Content,expected,message);
    }

    //Choose answer 1
    public void q7_chooseAnswer1(String expected,String message){
        check.checkContainText(q7Answer1,expected,message);
        q7Answer1.click();
    }

    //Choose answer 2
    public void q7_chooseAnswer2(String expected,String message){
        check.checkContainText(q7Answer2,expected,message);
        q7Answer2.click();
    }

    //Choose answer 3
    public void q7_chooseAnswer3(String expected,String message){
        check.checkContainText(q7Answer3,expected,message);
        q7Answer3.click();
    }

    //Verify content of error message, if wrong -> Show <message>
    public void q7_verifyErrorMessage(String expectedText,String message){
        check.checkContainText(q7ErrorMess,expectedText,message);
    }

}