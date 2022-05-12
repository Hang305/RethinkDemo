package pages.showroomPage;

import locators.showroomLocators.QuestionLocators;
import support.check.Check;

public class Question8To12Page extends QuestionLocators {

    Check check = new Check();

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

//Question 8
    //Verify content of q6 show correctly,if wrong-> show <message>
    public void q8_verifyContent(String expected,String message){
        check.checkContainText(q8Content,expected,message);
    }

    //Choose answer 1
    public void q8_chooseAnswer1(String expected,String message){
        q8AnswerNo.click();
        check.checkContainText(q8AnswerNo,expected,message);
    }

    //Choose answer 2
    public void q8_chooseAnswer2(String expected,String message){
        q8Answer1000.click();
        check.checkContainText(q8Answer1000,expected,message);
    }

    //Choose answer 3
    public void q8_chooseAnswer3(String expected,String message){
        q8Answer2000.click();
        check.checkContainText(q8Answer2000,expected,message);
    }

//Question 9
    //Verify content of q6 show correctly,if wrong-> show <message>
    public void q9_verifyContent(String expected,String message){
        check.checkContainText(q9Content,expected,message);
    }

    //Choose answer 1
    public void q9_chooseAnswer1(String expected,String message){
        q9Answer12.click();
        check.checkContainText(q9Answer12,expected,message);
    }

    //Choose answer 2
    public void q9_chooseAnswer2(String expected,String message){
        q9Answer24.click();
        check.checkContainText(q9Answer24,expected,message);
    }

    //Choose answer 3
    public void q9_chooseAnswer3(String expected,String message){
        q9Answer36.click();
        check.checkContainText(q9Answer36,expected,message);
    }

//Question 10
    //Verify content of q6 show correctly,if wrong-> show <message>
    public void q10_verifyContent(String expected,String message){
        check.checkContainText(q10Content,expected,message);
    }

    //Choose answer Yes
    public void q10_chooseAnswerYes(String expected,String message){
        q10AnswerYes.click();
        check.checkContainText(q10AnswerYes,expected,message);
    }

    //Choose answer No
    public void q10_chooseAnswerNo(String expected,String message){
        q10AnswerNo.click();
        check.checkContainText(q10AnswerNo,expected,message);
    }

//Question 11
    //Verify content of q6 show correctly,if wrong-> show <message>
    public void q11_verifyContent(String expected,String message){
        check.checkContainText(q11Content,expected,message);
    }

    //Choose answer Yes
    public void q11_chooseAnswerYes(String expected,String message){
        q11AnswerYes.click();
        check.checkContainText(q11AnswerYes,expected,message);
    }

    //Choose answer No
    public void q11_chooseAnswerNo(String expected,String message){
        q11AnswerNo.click();
        check.checkContainText(q11AnswerNo,expected,message);
    }

//Question 12
    //Verify content of q6 show correctly,if wrong-> show <message>
    public void q12_verifyContent(String expected,String message){
        check.checkContainText(q12Content,expected,message);
    }

    //Choose answer Yes
    public void q12_chooseAnswerYes(String expected,String message){
        q12AnswerYes.click();
        check.checkContainText(q12AnswerYes,expected,message);
    }

    //Choose answer No
    public void q12_chooseAnswerNo(String expected,String message){
        q12AnswerNo.click();
        check.checkContainText(q12AnswerNo,expected,message);
    }

//Get total premium
    public void getTotalPremium(){
        String totalPremiumText = totalPremium.getText();
    }

    //Check total premium
    public void checkTotalPremium(String expected, String message){
        check.checkContainText(totalPremium, expected, message);
    }
}